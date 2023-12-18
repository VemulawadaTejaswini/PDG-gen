// 提出時に消す
// package app;

import java.util.Scanner;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int check = 0;
        for (int i = 0; i < n.length(); i++) {
            check += Integer.valueOf(n.substring(i, i + 1));
        }

        if (check == 0 || check % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}