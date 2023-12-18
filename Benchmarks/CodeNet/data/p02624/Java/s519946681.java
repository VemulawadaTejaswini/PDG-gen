import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DSumOfDivisors solver = new DSumOfDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSumOfDivisors {
        int[] spf;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long n = in.nextLong();
            spf = _F.spfsieve((int) n + 1);
            long ans = 0;
            for (int i = 1; i <= n; i++) {
                ans += (i * getDivisorsCount(i));
            }
            out.println(ans);
        }

        long getDivisorsCount(int n) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            while (n > 1) {
                hm.put(spf[n], hm.getOrDefault(spf[n], 0) + 1);
                n = n / spf[n];
            }
            long count = 1;
            for (int c : hm.values()) {
                count *= (c + 1);
            }
            return count;
        }

    }

    static class _F {
        public static int[] spfsieve(int n) {
            int[] spf = new int[n + 1];
            spf[1] = 1;
            for (int i = 2; i <= n; i += 2) {
                spf[i] = 2;
            }
            for (int i = 3; i <= n; i += 2) {
                if (spf[i] == 0) {
                    spf[i] = i;
                    for (int j = 2 * i; j <= n; j += i) {
                        if (spf[j] == 0) {
                            spf[j] = i;
                        }
                    }
                }
            }
            return spf;
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

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

