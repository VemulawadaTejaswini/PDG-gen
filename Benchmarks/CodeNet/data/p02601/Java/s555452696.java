//Created by Aminul on 7/25/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int a[] = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        while (k-- > 0) {
            if (a[1] <= a[0]) a[1] *= 2;
            else a[2] *= 2;
        }
        pw.println(a[2] > a[1] && a[1] > a[0] ? "Yes" : "No");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}