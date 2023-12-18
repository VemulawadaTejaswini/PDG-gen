// package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final int A = sc.nextInt();
        final int B = sc.nextInt();

        int result = Math.max(A + B, Math.max(A * B, A - B));

        System.out.println(result);

    }
}