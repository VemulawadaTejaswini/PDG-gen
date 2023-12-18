//Created by Aminul on 9/13/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        final long inf = (long) 1e15;
        int n = in.nextInt();
        long pp = -inf, pm = -inf, mp = -inf, mm = -inf, res = -inf;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt(), y = in.nextInt();
            res = max(res, x + y + mm);
            res = max(res, x - y + mp);
            res = max(res, -x + y + pm);
            res = max(res, -x - y + pp);

            pp = max(pp, x + y);
            pm = max(pm, x - y);
            mp = max(mp, -x + y);
            mm = max(mm, -x - y);
        }

        pw.println(res);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}