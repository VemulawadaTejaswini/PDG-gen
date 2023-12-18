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
import java.util.ArrayDeque;
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
        CTsundoku solver = new CTsundoku();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTsundoku {
        long LINF = (long) 1e18 + 33331;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long n = in.nextLong();
            long m = in.nextLong();
            long k = in.nextLong();
            ArrayDeque<Long> stackN = new ArrayDeque<>();
            ArrayDeque<Long> stackM = new ArrayDeque<>();
            long amins = 0;
            long bmins = 0;
            int ac = 0;
            int bc = 0;
            for (int i = 0; i < n; i++) {
                long x = in.nextLong();
                if (x + amins <= k) {
                    amins += x;
                    ac++;
                }
                stackN.addLast(x);
            }
            for (int i = 0; i < m; i++) {
                long x = in.nextLong();
                if (x + bmins <= k) {
                    bmins += x;
                    bc++;
                }
                stackM.addLast(x);
            }
            int count = 0;
            long totalMins = 0;
            while (!stackM.isEmpty() || !stackN.isEmpty()) {
                long nn = LINF;
                long mm = LINF;
                if (!stackN.isEmpty()) {
                    nn = stackN.peek();
                }

                if (!stackM.isEmpty()) {
                    mm = stackM.peek();
                }
                boolean worked = false;
                if (nn < mm && totalMins + nn <= k) {
                    stackN.poll();
                    count++;
                    totalMins += nn;
                    worked = true;
                }
                if (mm <= nn && totalMins + mm <= k) {
                    stackM.poll();
                    count++;
                    totalMins += mm;
                    worked = true;
                }
                if (!worked) {
                    break;
                }
            }
            out.println(_F.max(count, ac, bc));
        }

    }

    static class _F {
        public static <T extends Comparable<T>> T max(T... list) {
            T candidate = list[0];
            for (T i : list) {
                if (candidate.compareTo(i) < 0) {
                    candidate = i;
                }
            }
            return candidate;
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

