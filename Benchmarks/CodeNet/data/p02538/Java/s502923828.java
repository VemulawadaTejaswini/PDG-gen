/**
 * Created by Aminul on 9/26/2020.
 */

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    static long pow[], powSum[], mod = 998244353;

    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), q = in.nextInt();
        pow = new long[n + 1];
        powSum = new long[n + 1];
        pow[0] = powSum[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow[i] = (pow[i - 1] * 10) % mod;
            powSum[i] = (powSum[i - 1] + pow[i]) % mod;
        }

        SegTree segTree = new SegTree(n);
        segTree.build();

        for (int i = 0; i < q; i++) {
            int l = in.nextInt(), r = in.nextInt(), d = in.nextInt();
            segTree.update(l, r, d);
            pw.println(segTree.getVal());
        }

        pw.close();
    }


    static class SegTree {
        int n;
        long[] seg, lazy;
        int size[];

        SegTree(int N) {
            n = N;
            seg = new long[4 * n];
            lazy = new long[4 * n];
            size = new int[4 * n];
        }

        void build() {
            build(1, 1, n);
        }

        void build(int p, int s, int e) {
            if (s == e) {
                seg[p] = 1;
                size[p] = 1;
                return;
            }
            if (s > e) return;
            int m = (s + e) >> 1, l = 2 * p, r = 2 * p + 1;
            build(l, s, m);
            build(r, m + 1, e);
            size[p] = size[l]+ size[r];
            seg[p] = ((seg[l] * pow[size[r]]) % mod + seg[r]) % mod;
        }

        long getVal() {
            return seg[1];
        }

        void update(int l, int r, int val) {
            update(1, 1, n, l, r, val);
        }

        void pushDown(int p, int l, int r) {
            if (lazy[p] == 0) return;
            lazy[l] = lazy[r] = lazy[p];
            seg[l] = (lazy[p] * powSum[size[l] - 1]) % mod;
            seg[r] = (lazy[p] * powSum[size[r] - 1]) % mod;
            lazy[p] = 0;
        }

        void update(int p, int s, int e, int a, int b, int val) {
            if (s >= a && e <= b) {
                seg[p] = (val * powSum[size[p] - 1]) % mod;
                lazy[p] = val;
                return;
            }
            if (s > b || s > e || e < a) return;
            int m = (s + e) >> 1, l = 2 * p, r = 2 * p + 1;
            pushDown(p, l, r);
            update(l, s, m, a, b, val);
            update(r, m + 1, e, a, b, val);
            seg[p] = ((seg[l] * pow[size[r]]) % mod + seg[r]) % mod;
        }

    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static class FastReader {
        InputStream is;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0, ptrbuf = 0;

        public FastReader(InputStream is) {
            this.is = is;
        }

        public int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = is.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public int skip() {
            int b;
            while ((b = readByte()) != -1 && isSpaceChar(b)) ;
            return b;
        }

        public String next() {
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while (!(isSpaceChar(b))) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }


        public String nextLine() {
            int c = skip();
            StringBuilder sb = new StringBuilder();
            while (!isEndOfLine(c)) {
                sb.appendCodePoint(c);
                c = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public char[] next(int n) {
            char[] buf = new char[n];
            int b = skip(), p = 0;
            while (p < n && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = readByte();
            }
            return n == p ? buf : Arrays.copyOf(buf, p);
        }

        public char readChar() {
            return (char) skip();
        }
    }
}