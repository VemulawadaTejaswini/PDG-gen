import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSumOfDivisors solver = new DSumOfDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSumOfDivisors {
        static final int MAXN = 10000001;
        static int spf = new int[MAXN];

        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            long[] ans = new long[n + 1];
            long a = 0;
            sieve();
            for (int i = 1; i <= n; i++) {
                ans[i] = i * (getFactorization(i));
                a += ans[i];
            }

            out.println(a);

        }

        static void sieve() {
            spf[1] = 1;
            for (int i = 2; i < MAXN; i++)

                // marking smallest prime factor for every
                // number to be itself.
                spf[i] = i;

            // separately marking spf for every even
            // number as 2
            for (int i = 4; i < MAXN; i += 2)
                spf[i] = 2;

            for (int i = 3; i * i < MAXN; i++) {
                // checking if i is prime
                if (spf[i] == i) {
                    // marking SPF for all numbers divisible by i
                    for (int j = i * i; j < MAXN; j += i)

                        // marking spf[j] if it is not
                        // previously marked
                        if (spf[j] == j)
                            spf[j] = i;
                }
            }
        }

        static long getFactorization(int x) {
            HashMap<Integer, Integer> ret = new HashMap<>();
            while (x != 1) {
                ret.put(spf[x], ret.getOrDefault(spf[x], 0) + 1);
                x = x / spf[x];
            }
            long a = 1L;
            Iterator<Integer> iter = ret.keySet().iterator();
            while (iter.hasNext()) {
                int curr = iter.next();
                a *= (ret.get(curr) + 1L);
            }
            return a;
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

