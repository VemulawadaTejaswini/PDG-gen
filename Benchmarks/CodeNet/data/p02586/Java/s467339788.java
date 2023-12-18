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
            EPickingGoods solver = new EPickingGoods();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EPickingGoods {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int r = s.nextInt(), c = s.nextInt(), k = s.nextInt();
            int[][] v = new int[r + 1][c + 1];
            while (k-- > 0) v[s.nextInt()][s.nextInt()] = s.nextInt();
            long[][][] dp = new long[4][r + 1][c + 1];
            for (int i = 1; i <= r; i++) {
                for (int j = 1; j <= c; j++) {
                    for (int m = 0; m <= 3; m++) {
                        dp[1][i][j] = Math.max(dp[1][i][j], dp[m][i - 1][j] + v[i][j]);
                        dp[0][i][j] = Math.max(dp[0][i][j], dp[m][i - 1][j]);
                        if (m == 0) continue;
                        dp[m][i][j] = func.max(dp[m - 1][i][j - 1] + v[i][j],
                                dp[m][i - 1][j], dp[m][i][j - 1],
                                dp[m][i][j]);
                    }
                }
            }
            w.println(func.max(dp[3][r][c], dp[2][r][c], dp[1][r][c], dp[0][r][c]));
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

    static class func {
        public static long max(long... v) {
            long max = Integer.MIN_VALUE;
            for (long i : v) max = Math.max(max, i);
            return max;
        }

    }
}

