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
 * @author Hello
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        ENEQ solver = new ENEQ();
        solver.solve(1, in, out);
        out.close();
    }

    static class ENEQ {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt(), m = c.readInt();
            long fact[] = new long[(int) 5e5 + 1];
            fact[0] = 1;
            long mod = (long) (1e9 + 7);
            for (int i = 1; i <= 5e5; i++) {
                fact[i] = (fact[i - 1] * i) % mod;
            }

            long res1 = npr(m, m - n, mod, fact);

            long res2 = res1;
            long tf = 1, cur = m - 2;
            for (int i = 1; i <= n; i++) {
//            if(cur == 0) break;
                long tot = (tf * npr(m - i, m - n, mod, fact)) % mod;
//            w.printLine(tf, tot);
                res2 = (res2 + mod - tot) % mod;
                tf *= cur;
                tf %= mod;
                cur--;
//            w.printLine(tf,tot);
            }

//        w.printLine(res1, res2);
            w.printLine((res1 * res2) % mod);


        }

        private long npr(int m, int n, long mod, long[] fact) {
            return (fact[m] * Utils.modInverse(fact[n], mod)) % mod;
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

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

        public void printLine(long i) {
            writer.println(i);
        }

    }

    static class Utils {
        public static long modInverse(long a, long m) {
            return power(a, m - 2, m);
        }

        public static long power(long x, long y, long p) {
            long res = 1;
            x = x % p;
            while (y > 0) {
                if ((y & 1) == 1) {
                    res = (res * x) % p;
                }
                y = y >> 1;
                x = (x * x) % p;
            }
            return res;
        }

    }
}

