import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastReader in = new FastReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            FSimplifiedReversi solver = new FSimplifiedReversi();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class FSimplifiedReversi {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), q = s.nextInt();
            segtreeiter rows = new segtreeiter(n), cols = new segtreeiter(n);
            long res = (n - 2) * (long) (n - 2);
            while (q-- > 0) {
                if (s.nextInt() == 1) {
                    int x = s.nextInt() - 1;
                    int to = cols.query(x);
                    res -= to - 1;
                    rows.modify(1, to, x);
                    cols.modify(x, x + 1, 1);
                } else {
                    int x = s.nextInt() - 1;
                    int to = rows.query(x);
                    res -= to - 1;
                    cols.modify(1, to, x);
                    rows.modify(x, x + 1, 1);
                }
            }
            w.println(res);
        }

        public class segtreeiter {
            public final int n;
            public int[] t;

            public segtreeiter(int n) {
                t = new int[n << 1];
                Arrays.fill(t, n - 1);
                this.n = n;
            }

            public void modify(int l, int r, int value) {
                for (l += n, r += n; l < r; l >>= 1, r >>= 1) {
                    if ((l & 1) == 1) t[l] = Math.min(t[l++], value);
                    if ((r & 1) == 1) t[--r] = Math.min(t[r], value);
                }
            }

            int query(int p) {
                int res = n;
                for (p += n; p > 0; p >>= 1) res = Math.min(res, t[p]);
                return res;
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

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

