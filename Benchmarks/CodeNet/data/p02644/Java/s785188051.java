import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) throws Exception {
        new Thread(null, new TaskAdapter(), "KharYusuf", 1 << 27).start();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastReader in = new FastReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            FPondSkater solver = new FPondSkater();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class FPondSkater {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int h = s.nextInt(), wi = s.nextInt(), k = s.nextInt();
            int x1 = s.nextInt() - 1, y1 = s.nextInt() - 1, x2 = s.nextInt() - 1, y2 = s.nextInt() - 1;
            char[][] c = new char[h][];
            for (int i = 0; i < h; i++) c[i] = s.next().toCharArray();
            PriorityQueue<pair<pair<Integer, Integer>, dist>> l = new PriorityQueue<>(new Comparator<pair<pair<Integer, Integer>, dist>>() {

                public int compare(pair<pair<Integer, Integer>, dist> o1, pair<pair<Integer, Integer>, dist> o2) {
                    return Integer.compare(o1.y.z, o2.y.z);
                }
            });
            int[][][] dis = new int[h][wi][4];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < wi; j++) Arrays.fill(dis[i][j], Integer.MAX_VALUE);
            }
            for (int i = 0; i < 4; i++) {
                l.add(new pair<>(new pair<>(x1, y1), new dist(i, k, 0)));
                dis[x1][y1][i] = 0;
            }
            while (!l.isEmpty()) {
                pair<pair<Integer, Integer>, dist> cur = l.poll();
                if (cur.y.z != dis[cur.x.x][cur.x.y][cur.y.x]) continue;
                for (int i = 0; i < 4; i++) {
                    int xx = cur.x.x + dx[i], yy = cur.x.y + dy[i];
                    if (xx >= 0 && xx < h && yy >= 0 && yy < wi && c[xx][yy] != '@') {
                   /* if(xx == 2 && yy == 3 ) {
                        w.println(cur.y.x+" "+cur.y.y+" "+cur.y.z+" "+i);
                    }
                    if(xx == 1 && yy == 3 ) {
                        w.println(cur.y.x+"y "+cur.y.y+" "+cur.y.z+" "+i);
                    }*/
                        if (i == cur.y.x && cur.y.y < k) {
                            if (dis[xx][yy][i] > cur.y.z) {
                                dis[xx][yy][i] = cur.y.z;
                                //w.println(xx+" "+yy);
                                l.add(new pair<>(new pair<>(xx, yy), new dist(i, cur.y.y + 1, dis[xx][yy][i])));
//                            for (int j = 0; j < 4; j++)
//                                if (i != j) l.add(new pair<>(new pair<>(xx, yy), new dist(j, 1, dis[xx][yy] + 1)));
                            }
                        } else {
                            if (dis[xx][yy][i] > cur.y.z + 1) {
                                dis[xx][yy][i] = cur.y.z + 1;
                                l.add(new pair<>(new pair<>(xx, yy), new dist(i, 1, dis[xx][yy][i])));
                            }
                        }
                    }
                }
            }
        /*r (int i = 0; i < h; i++) {
            for (int j = 0; j < wi; j++) for (int x = 0; x < 4; x++) w.print(dis[i][j][x]+" ");
            w.println();
        }*/
            w.println(func.min(dis[x2][y2]) == Integer.MAX_VALUE ? -1 : func.min(dis[x2][y2]));
        }

    }

    static class pair<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<pair<U, V>> {
        public U x;
        public V y;

        public pair(U x, V y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(pair<U, V> other) {
            int i = x.compareTo(other.x);
            if (i != 0) return i;
            return y.compareTo(other.y);
        }

        public String toString() {
            return x.toString() + " " + y.toString();
        }

        public boolean equals(Object obj) {
            if (this.getClass() != obj.getClass()) return false;
            pair<U, V> other = (pair<U, V>) obj;
            return x.equals(other.x) && y.equals(other.y);
        }

        public int hashCode() {
            return 31 * x.hashCode() + y.hashCode();
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

        public String next() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            StringBuilder res = new StringBuilder();

            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
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
        public static int min(int... v) {
            int min = Integer.MAX_VALUE;
            for (int i : v) min = Math.min(min, i);
            return min;
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
}

