import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ENEQ solver = new ENEQ();
        solver.solve(1, in, out);
        out.close();
    }

    static class ENEQ {
        long modExp(long x, long y, long mod) {
            if (y == 0)
                return 1 % mod;
            long ret = modExp(x, y >> 1, mod);
            ret = ret * ret % mod;
            if ((y & 1) == 1)
                ret = ret * (x % mod) % mod;
            return ret;
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            long[] fact = new long[m + 1];
            fact[0] = 1;
            long[] ifact = new long[m + 1];
            ifact[0] = 1;
            long mod = (long) 1e9 + 7;
            for (int i = 1; i <= m; i++) {
                fact[i] = fact[i - 1] * i % mod;
                ifact[i] = ifact[i - 1] * modExp(i, mod - 2, mod) % mod;
            }
            long[] a = new long[n + 1];
            a[n] = 1;
            for (int i = n - 1; i >= 0; i--) {
                long v1 = fact[n] * ifact[i] % mod * ifact[n - i] % mod;
                long v2 = fact[m - i] * ifact[n - i] % mod * ifact[m - n] % mod;
                a[i] = v1 * v2 % mod * fact[n - i] % mod;
                a[i] = (a[i] - a[i + 1] + mod) % mod;
            }
            long res = fact[m] * ifact[m - n] % mod * a[0] % mod;
            w.println(res);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
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

