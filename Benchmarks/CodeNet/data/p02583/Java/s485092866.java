//Created by Aminul on 8/15/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (isTriangle(arr[i], arr[j], arr[k])) {
                        cnt++;
                    }
                }
            }
        }

        pw.println(cnt);
        pw.close();
    }

    static boolean isTriangle(int a, int b, int c) {
        return a != b && a != c && b != c && (a + b > c) && (a + c > b) && (b + c > a);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}