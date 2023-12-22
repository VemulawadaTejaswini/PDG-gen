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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSumOfGcdOfTuplesEasy solver = new CSumOfGcdOfTuplesEasy();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSumOfGcdOfTuplesEasy {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int k = s.nextInt();
            long ans = 0l;
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= k; j++) {
                    long gcd1 = CSumOfGcdOfTuplesEasy.Maths.gcd(i, j);
                    for (int l = 1; l <= k; l++) {
                        ans += CSumOfGcdOfTuplesEasy.Maths.gcd(gcd1, l);
                    }
                }
            }

            out.println(ans);
        }

        private static class Maths {
            private static long gcd(long a, long b) {
                if (b == 0) {
                    return a;
                }

                return gcd(b, a % b);
            }

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

