import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
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
        CWalkOnMultiplicationTable solver = new CWalkOnMultiplicationTable();
        solver.solve(1, in, out);
        out.close();
    }

    static class CWalkOnMultiplicationTable {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            long n = s.nextLong();
            ArrayList<Long> divisors = CWalkOnMultiplicationTable.Maths.printDivisors(n);
            Long min = Long.MAX_VALUE;
            for (Long l : divisors) {
                min = Math.min(min, l - 1 + (n / l) - 1);
            }
            out.println(min);
        }

        private static class Maths {
            static ArrayList<Long> printDivisors(long n) {
                // Note that this loop runs till square root
                ArrayList<Long> list = new ArrayList<>();
                for (long i = 1; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        if (n / i == i) {
                            list.add(i);
                        } else {
                            list.add(i);
                            list.add(n / i);
                        }
                    }
                }
                Collections.sort(list);
                return list;
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

