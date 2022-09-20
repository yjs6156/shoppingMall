package com.example.shoppingmall.controller;

import com.example.shoppingmall.dto.UserDto;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "/test")
    public UserDto test() {
        UserDto userDto = new UserDto();

        userDto.setAge(20);
        userDto.setName("hoon");
        
        return userDto;
    }
}
