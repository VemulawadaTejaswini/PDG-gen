package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sを入力してください");
        int s = sc.nextInt();
        System.out.println("Dを入力してください");
        int D = sc.nextInt();
        System.out.println("Tを入力してください");
        int T = sc.nextInt();
        System.out.println(s);
        System.out.println(D);
        System.out.println(T);

        if (D <= s * T) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}