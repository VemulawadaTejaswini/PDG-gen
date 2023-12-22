// package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final String N = sc.next();
        // final int M = sc.nextInt();
        // final int N = sc.nextInt();
        // final int A = sc.nextInt();
        // final int B = sc.nextInt();
        // final int D = sc.nextInt();

        int cnt = 0;
        boolean goodNum = false;
        char tmp = 'z';
        for (int i = 0; i < N.length(); i++) {
            if (tmp == N.charAt(i)) {
                cnt++;
                if (cnt >= 3) {
                    goodNum = true;
                    break;
                }
            } else {
                tmp = N.charAt(i);
                cnt = 1;
            }
        }

        // System.out.println();
        System.out.println(goodNum ? "Yes" : "No");

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}