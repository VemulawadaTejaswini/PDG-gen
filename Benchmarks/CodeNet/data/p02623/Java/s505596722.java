//Created by Aminul on 6/27/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), m = in.nextInt(), k = in.nextInt();
        int[] a = new int[n], b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        int  i = 0, j = 0;
        while (i < n || j < m) {
            if (i < n && j < m) {
                if (a[i] <= b[j] && a[i] <= k) {
                    k -= a[i++];
                } else if (b[j] <= a[i] && b[j] <= k) {
                    k -= b[j++];
                } else break;
            } else if (i < n && a[i] <= k) {
                k -= a[i++];
            } else if (j < m && b[j] <= k) {
                k -= b[j++];
            } else break;
        }

        pw.println(i + j);

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}