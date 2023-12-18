//Created by Aminul on 6/27/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        long[] nod = NOD(n);
        long res = 0;
        for (int i = 1; i <= n; i++) {
            res += i * nod[i];
        }

        pw.println(res);
        pw.close();
    }

    static long[] NOD(int n) {
        long nod[] = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                nod[j]++;
            }
        }
        return nod;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}