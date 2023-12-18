//Created by Aminul on 9/19/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    static final long mod = 998244353;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        int k = in.nextInt();
        int ranges[][] = new int[n][2];
        for (int i = 0; i < k; i++) {
            ranges[i][0] = in.nextInt();
            ranges[i][1] = in.nextInt();
        }
        Arrays.sort(ranges, (x, y) -> {
            int cmp = Integer.compare(x[0], y[0]);
            if (cmp == 0) cmp = Integer.compare(x[1], y[1]);
            return cmp;
        });

        BinaryIndexTree bit = new BinaryIndexTree(n + 5);
        for (int i = n; i >= 1; i--) {
            if (i == n) {
                bit.add(i, 1);
            } else {
                long ways = 0;
                for (int range[] : ranges) {
                    int l = i + range[0], r = i + range[1];
                    r = min(r, n);
                    ways += bit.query(l, r);
                    if (ways >= mod) {
                        ways -= mod;
                    }
                    if (r >= n) break;
                }
                bit.add(i, ways);
            }
        }

        pw.println(bit.query(1, 1));

        pw.close();
    }

    static class BinaryIndexTree {
        public long bit[];
        public int n;

        public BinaryIndexTree(int N) {
            n = N;
            bit = new long[n];
        }

        public void add(int index, long value) {
            for (; index < n; index = index + (index & -index)) {
                bit[index] += value;
                if (bit[index] >= mod) bit[index] -= mod;
            }
        }

        public long sum(int index) {
            long sum = 0;
            for (; index > 0; index = index - (index & -index)) {
                sum += bit[index];
                if (sum >= mod) sum -= mod;
            }
            return sum;
        }

        public long query(int i, int j) {
            long res = sum(j) - sum(i - 1);
            //res %= mod;
            if (res < 0) res += mod;
            return res;
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}