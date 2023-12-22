// https://atcoder.jp/contests/abc081/tasks/abc081_a

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int count = 0;
        for(char ch : s.toCharArray()) {
           if (ch == '1') count++;
        }
        System.out.println(count);
    }
}