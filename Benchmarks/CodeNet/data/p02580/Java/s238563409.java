import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
import java.util.ArrayList;
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
            EBomber solver = new EBomber();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EBomber {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt(), k = s.nextInt();
            int[][] cols = new int[m][2];
            ArrayList<Integer>[] colR = new ArrayList[m];
            int[] rows = new int[n];
            for (int i = 0; i < m; i++) {
                colR[i] = new ArrayList<>();
                cols[i][1] = i;
            }
            for (int i = 0; i < k; i++) {
                int x = s.nextInt() - 1, y = s.nextInt() - 1;
                rows[x]++;
                cols[y][0]++;
                colR[y].add(x);
            }
            func.sortbyColumn(cols, 0);
            int[] cnt = new int[n];
            int tot = 1;
            for (int i : colR[cols[m - 1][1]]) cnt[i]++;
            int ptr = m - 2;
            while (ptr >= 0 && cols[ptr][0] == cols[ptr + 1][0]) {
                tot++;
                for (int i : colR[cols[ptr][1]]) cnt[i]++;
                ptr--;
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (cnt[i] != tot) ans = Math.max(ans, rows[i] + cols[m - 1][0]);
                else ans = Math.max(ans, rows[i] + cols[m - 1][0] - 1);
            }
            w.println(ans);
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
        public static void sortbyColumn(int[][] arr, final int col) {
            Arrays.sort(arr, new Comparator<int[]>() {

                public int compare(final int[] entry1, final int[] entry2) {
                    if (entry1[col] > entry2[col]) return 1;
                    if (entry1[col] < entry2[col]) return -1;
                    return 0;
                }
            });
        }

    }
}

