//Created by Aminul on 7/5/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), m = in.nextInt(), k = in.nextInt();
        char[][] str = new char[n][m];
        for (int i = 0; i < n; i++) {
            str[i] = in.next().toCharArray();
        }

        int res = 0;
        for (int x = 0; x < (1 << n); x++) {
            for (int y = 0; y < (1 << m); y++) {
                int cnt = 0;
                for (int i = 0; i < n; i++) {
                    if (check(x, i)) continue;
                    for (int j = 0; j < m; j++) {
                        if (check(y, j)) continue;
                        cnt += str[i][j] == '#' ? 1 : 0;
                    }
                }
                if (cnt == k) res++;
            }
        }

        pw.println(res);

        pw.close();
    }

    static boolean check(int N, int pos) {
        return (N & (1 << pos)) != 0;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}