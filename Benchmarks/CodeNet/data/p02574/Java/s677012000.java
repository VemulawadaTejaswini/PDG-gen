/**
 * Created by Aminul on 8/29/2020.
 */

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int N = (int) 1e6;
        sieve(N);
        int primFactors[][] = factors(N);
        int frq[] = new int[N + 1];
        int n = in.nextInt();
        int arr[] = new int[n];
        int g = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            g = gcd(g, arr[i]);
            for (int p : primFactors[arr[i]]) {
                frq[p]++;
            }
        }

        boolean flag = true;
        for (int i : arr) {
            for (int p : primFactors[i]) {
                flag &= (frq[p] == 1);
                frq[p]--;
            }
            if (!flag) break;
        }

        if (flag) pw.println("pairwise coprime");
        else if (g == 1) pw.println("setwise coprime");
        else pw.println("not coprime");

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    static int[][] factors(int n) {
        int idx[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i; j <= n; j += i) {
                idx[j]++;
            }
        }
        int factors[][] = new int[n + 1][];
        factors[0] = new int[0];
        for (int i = 1; i <= n; i++) {
            factors[i] = new int[idx[i]];
            idx[i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i; j <= n; j += i) {
                factors[j][idx[j]++] = i;
            }
        }
        for (int i = 1; i <= n; i++) {
            factors[i] = Arrays.copyOf(factors[i], idx[i]);
        }
        return factors;
    }


    static boolean isPrime[];

    static void sieve(int n) {
        isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 4; i <= n; i += 2) isPrime[i] = false;
        for (int i = 3; i * i <= n; i += 2) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += 2 * i)
                    isPrime[j] = false;
            }
        }
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