import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
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
            DWizardInMaze solver = new DWizardInMaze();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class DWizardInMaze {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            char[][] c = new char[n + 2][m + 2];
            for (char[] chars : c) Arrays.fill(chars, '#');
            int ch = s.nextInt(), cw = s.nextInt();
            int dh = s.nextInt(), dw = s.nextInt();
            for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) c[i][j] = s.nextChar();
            int[][] dist = new int[n + 2][m + 2];
            for (int[] ints : dist) Arrays.fill(ints, Integer.MAX_VALUE);
            dist[ch][cw] = 0;
            PriorityQueue<dist> l = new PriorityQueue<>();
            l.add(new dist(ch, cw, 0));
            while (!l.isEmpty()) {
                dist cur = l.poll();
                if (cur.z != dist[cur.x][cur.y]) continue;
                for (int i = 0; i < 4; i++) {
                    int xx = cur.x + dx[i], yy = cur.y + dy[i];
                    if (dist[xx][yy] > cur.z && c[xx][yy] != '#') {
                        dist[xx][yy] = cur.z;
                        l.add(new dist(xx, yy, cur.z));
                    }
                }
                for (int i = -2; i <= 2; i++) {
                    for (int j = -2; j <= 2; j++) {
                        if (i == 0 && j == 0) continue;
                        int xx = cur.x + i, yy = cur.y + j;
                        if (xx >= 1 && xx <= n && yy >= 1 && yy <= m && dist[xx][yy] > cur.z + 1 && c[xx][yy] != '#') {
                            dist[xx][yy] = cur.z + 1;
                            l.add(new dist(xx, yy, cur.z + 1));
                        }
                    }
                }
            }
            w.println(dist[dh][dw] == Integer.MAX_VALUE ? -1 : dist[dh][dw]);
        }

    }

    static class dist implements Comparable<dist> {
        public int x;
        public int y;
        public int z;

        public dist(int xi, int yi, int zi) {
            x = xi;
            y = yi;
            z = zi;
        }

        public int compareTo(dist other) {
            if (this.z > other.z) {
                return 1;
            }
            if (this.z < other.z) {
                return -1;
            }
            return 0;
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

        public char nextChar() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            return (char) c;
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

