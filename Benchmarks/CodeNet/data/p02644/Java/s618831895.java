import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.FileInputStream;
import java.util.TreeMap;
import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/F1";

    FastScanner in;
    PrintWriter out;

    int[] vx = {0, 1, 0, -1};
    int[] vy = {1, 0, -1, 0};

    public void solve() {
        int h = in.nextInt();
        int w = in.nextInt();
        int k = in.nextInt();
        int sy = in.nextInt() - 1, sx = in.nextInt() - 1;
        int gy = in.nextInt() - 1, gx = in.nextInt() - 1;
        char[][] c = new char[h][];
        for (int i = 0; i < h; i++) {
            c[i] = in.next().toCharArray();
        }

        final int INF = 10000000;
        int[][][] dist = new int[h][w][4];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                Arrays.fill(dist[i][j], INF);
            }
        }
        Arrays.fill(dist[sy][sx], 0);

        Queue<State> q = new ArrayDeque<>();
        q.add(new State(sx, sy, 0));

        while (!q.isEmpty()) {
            State s = q.poll();
            int x = s.x, y = s.y;
            for (int d = 0; d < vx.length; d++) {
                int nx = x + vx[d];
                int ny = y + vy[d];
                int z = 1;
                while (0 <= nx && nx < w && 0 <= ny && ny < h && c[ny][nx] == '.' && dist[ny][nx][d] > dist[y][x][s.d] + 1 && z <= k) {
                    dist[ny][nx][d] = dist[y][x][s.d] + 1;
                    q.add(new State(nx, ny, d));
                    nx += vx[d];
                    ny += vy[d];
                    z++;
                }
            }
        }
        long res = INF;
        for (int i = 0; i < 4; i++) {
            res = Math.min(res, dist[gy][gx][i]);
        }
        System.out.println(res == INF ? -1 : res);
    }

    class State {
        final int x;
        final int y;
        final int d;

        public State(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }

    private Integer toId(int x, int y, int h) {
        return x * h + y;
    }

    private void add(TreeMap<Integer, Integer> tm, int a) {
        tm.put(a, tm.getOrDefault(a, 0) + 1);
    }

    private void update(TreeMap<Integer, Integer> tm, int ac) {
        if (tm.get(ac) == 1) {
            tm.remove(ac);
        } else {
            tm.put(ac, tm.get(ac) - 1);
        }
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }
}


class FastScanner {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream) {
        this.stream = stream;
        // stream = new FileInputStream(new File("dec.in"));
    }

    int read() {
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

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    public int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    public long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    public double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    public String next() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    public String nextLine() {
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndline(c));
        return res.toString();
    }

    public int[][] nextPackedIntArrays(int packN, int size) {
        int[][] res = new int[packN][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < packN; j++) {
                res[j][i] = nextInt();
            }
        }
        return res;
    }
}
