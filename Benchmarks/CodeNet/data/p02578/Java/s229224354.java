//Created by Aminul on 8/22/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        long res = 0, max = 0;
        for (int i = 0; i < n; i++) {
            long x = in.nextInt();
            if (x < max) {
                res += max - x;
                x = max;
            }
            max = max(max, x);
        }

        pw.println(res);

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}