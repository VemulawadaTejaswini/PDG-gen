package com.go.atcoder.contest.oneseventhree;

import java.util.Scanner;  // Import the Scanner class

public class Payment {

    public static void main(String[] args) {
        int res = 0;
        Scanner in = new Scanner(System.in);
        int amt = in.nextInt();
        res = solve(amt);
        System.out.println("res :" + res);
    }

    public static int solve(int inp) {
        System.out.println("given money : " + inp);
        int rem = inp % 1000;
        return (rem != 0) ? 1000 - rem : 0;
    }
}
