import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author maheshwari29
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FKnapsackForAllSubsets solver = new FKnapsackForAllSubsets();
        solver.solve(1, in, out);
        out.close();
    }

    static class FKnapsackForAllSubsets {
        static long mod = 998244353;

        static long exponent(long a, long n) {
            long ans = 1;
            while (n != 0) {
                if (n % 2 == 1) ans = (ans * a) % mod;
                a = (a * a) % mod;
                n = n >> 1;
            }
            return ans;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int i, j;
            int n = in.ni();
            int s = in.ni();
            int a[] = in.nia(n);
            long dp[][] = new long[n + 1][s + 1];
            long inv = exponent(2, mod - 2);
            dp[0][0] = exponent(2, n);
            for (i = 1; i <= n; i++) {
                for (j = 0; j <= s; j++) {
                    dp[i][j] += dp[i - 1][j];
                    if (j - a[i - 1] >= 0)
                        dp[i][j] = (dp[i][j] + (dp[i - 1][j - a[i - 1]] * inv) % mod) % mod;
                }
            }
            out.println(dp[n][s]);
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
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

        public int ni() {
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

        public int[] nia(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = ni();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

