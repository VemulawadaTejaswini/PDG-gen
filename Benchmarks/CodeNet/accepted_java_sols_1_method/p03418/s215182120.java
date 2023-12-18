/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package codeforces;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        long ans = 0;
        for (int i = k+1; i <= n; ++i) {
            ans += n/i*(i-k) + (n%i-k+1 >= 0 ? n%i-k+1 : 0);
        }
        if (k == 0) {
            ans = (long) n*n;
        }
        System.out.println(ans);
    }
}