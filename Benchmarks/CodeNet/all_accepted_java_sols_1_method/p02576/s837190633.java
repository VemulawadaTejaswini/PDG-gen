// 提出時に消す
// package app;

import java.util.Scanner;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();

        int kaisu = n / x;
        if (n % x > 0) {
            kaisu++;
        }

        System.out.println(t * kaisu);

        sc.close();
    }
}