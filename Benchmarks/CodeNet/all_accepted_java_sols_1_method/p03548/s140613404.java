//package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x, y, z;
        int ans;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        /*x = Integer.parseInt(a);
        y = Integer.parseInt(b);
        z = Integer.parseInt(c);*/
        sc.close();

        ans = (x - z) / (y + z);
        System.out.println(ans);
    }
}
