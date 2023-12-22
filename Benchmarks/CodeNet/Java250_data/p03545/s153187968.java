// package app;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = System.in.read() - '0';
        }

        String result = "";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int j2 = 0; j2 < 2; j2++) {
                    for (int k = 0; k < 2; k++) {
                    int a1 = i % 2 == 0 ? a[0] : -a[0];
                    String op1 = j % 2 == 0 ? "+" : "-";
                    int a2 = j % 2 == 0 ? a[1] : -a[1];
                    String op2 = j2 % 2 == 0 ? "+" : "-";
                    int a3 = j2 % 2 == 0 ? a[2] : -a[2];
                    String op3 = k % 2 == 0 ? "+" : "-";
                    int a4 = k % 2 == 0 ? a[3] : -a[3];

                        if (a1 + a2 + a3 + a4 == 7){
                        result = Objects.toString(a[0]) + op1 + Objects.toString(a[1]) + op2 + Objects.toString(a[2]) + op3 + Objects.toString(a[3]) +"=7";
                        System.out.println(result);
                        return;
                        }
                    }
                }
            }
        }
    }
}