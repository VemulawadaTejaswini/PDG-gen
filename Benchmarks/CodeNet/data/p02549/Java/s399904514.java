//Created by Aminul on 9/19/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    static final int mod = 998244353;

    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader(System.in);
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

        if (k > 10) throw new RuntimeException("ERROR!!!");

        BinaryIndexTree bit = new BinaryIndexTree(n + 5);
        for (int i = n; i >= 1; i--) {
            if (i == n) {
                bit.add(i, 1);
            } else {
                int ways = 0;
                for (int range[] : ranges) {
                    int l = i + range[0], r = i + range[1];
                    if (l > n) break;
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
        public int bit[];
        public int n, offset = 5;

        public BinaryIndexTree(int N) {
            n = N + 10;
            bit = new int[n];
        }

        public void add(int index, int value) {
            index += offset;
            for (; index < n; index = index + (index & -index)) {
                bit[index] += value;
                if (bit[index] >= mod) bit[index] -= mod;
            }
        }

        public int sum(int index) {
            index += offset;
            int sum = 0;
            for (; index > 0; index = index - (index & -index)) {
                sum += bit[index];
                if (sum >= mod) sum -= mod;
            }
            return sum;
        }

        public int query(int i, int j) {
            int res = sum(j) - sum(i - 1);
            if (res < 0) res += mod;
            return res;
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