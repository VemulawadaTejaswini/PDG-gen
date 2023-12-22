// package app;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final String a = sc.next();
        final String b = sc.next();

        // final int a = sc.nextInt();
        // final int b = sc.nextInt();
        // final int D = sc.nextInt();
        // System.out.println();

        String result = b;
        if(a.equals("D")){
            result = b.equals("H") ? "D" : "H";
        }

        System.out.println(result);

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}