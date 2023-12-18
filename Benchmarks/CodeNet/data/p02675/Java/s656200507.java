package com.example.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] one = {2, 4, 5, 7, 9};
        int[] two = {0, 1, 6, 8};
        int[] three = {3};
        int digit = N % 10;
        if (three[0] == digit) {
            System.out.println("bon");
        } else {
            int flag = 0 ;
            for (int value : two) {
                if (value == digit) {
                    flag = 1;
                    System.out.println("pon");
                    break;
                }
            }
            if( flag == 0 ){
                for (int value : one) {
                    if (value == digit) {
                        System.out.println("hon");
                        break;
                    }
                }
            }
        }
    }
}
