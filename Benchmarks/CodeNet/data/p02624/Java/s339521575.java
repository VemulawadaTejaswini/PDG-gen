import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
 * @author Nikita Mikhailov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DSumOfDivisors solver = new DSumOfDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSumOfDivisors {
        int testNumber;
        InputReader in;
        OutputWriter out;

        public void solve() {
            int n = in.readInt();
            long[] ints = PrimeUtils.seiveNumDividers(n);

            long res = 0;
            for (int i = 1; i <= n; i++) {
                res += i * ints[i];
            }
            out.println(res);
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            this.testNumber = testNumber;
            this.in = in;
            this.out = out;

            solve();
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private int read() {
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

        public int readInt() {
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class PrimeUtils {
        public static long[] seiveNumDividers(int n) {
            long[] numDividers = new long[n + 1];
            boolean[] isPrime = new boolean[n + 1];
            Arrays.fill(isPrime, true);
            Arrays.fill(numDividers, 1);

            isPrime[0] = isPrime[1] = false;
            numDividers[0] = numDividers[1] = 1;

            for (int i = 2; i <= n; i++) {
                if (isPrime[i]) {
                    numDividers[i] += 1;
                    for (int j = 2; j <= n / i; j++) {
                        isPrime[i * j] = false;

                        int p = i * j;
                        int cnt = 0;
                        while (p > 0 && p % i == 0) {
                            cnt++;
                            p /= i;
                        }
                        numDividers[i * j] *= cnt + 1;
                    }
                }
            }
            return numDividers;
        }

    }
}

