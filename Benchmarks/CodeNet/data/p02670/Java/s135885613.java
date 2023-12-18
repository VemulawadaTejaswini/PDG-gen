import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    void solve() {
        int n = in.nextInt();
        int[][] dist = new int[n][n];
        boolean[][] used = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Math.min(Math.min(i + 1, j + 1), Math.min(n - i, n - j));
            }
        }
        Point.h = n;
        Point.w = n;
        long ans = 0;
        for (int i = 0; i < n * n; i++) {
            int p = in.nextInt() - 1;
            int x = p % n;
            int y = p / n;
            dist[y][x]--;
            ans += dist[y][x];
            used[y][x] = true;
            Deque<Point> deque = new ArrayDeque<>();
            deque.add(new Point(x, y));
            while (!deque.isEmpty()) {
                Point v = deque.pollLast();
                for (Point u : v.aroundPoints(4)) {
                    if (used[u.y][u.x]) {
                        if (dist[u.y][u.x] > dist[v.y][v.x]) {
                            dist[u.y][u.x] = dist[v.y][v.x];
                            deque.addLast(u);
                        }
                    } else {
                        if (dist[u.y][u.x] > dist[v.y][v.x] + 1) {
                            dist[u.y][u.x] = dist[v.y][v.x] + 1;
                            deque.addFirst(u);
                        }
                    }
                }
            }
        }
        out.println(ans);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Point implements Comparable<Point> {
    static int h = -1, w = -1;
    final int x, y, z;

    Point(int z) {
        this.x = z % w;
        this.y = z / w;
        this.z = z;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = y * w + x;
    }

    Point move(int d) {
        return new Point(x + Main.da[d], y + Main.da[d + 1]);
    }

    boolean isInner() {
        if (h == -1 || w == -1) {
            throw new IllegalStateException("h/w is not initialized!");
        }
        return 0 <= x && x < w && 0 <= y && y < h;
    }

    List<Point> aroundPoints(int type) {
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < type; i++) {
            int nx = x + Main.da[i];
            int ny = y + Main.da[i + 1];
            Point point = new Point(nx, ny);
            if (point.isInner()) {
                list.add(point);
            }
        }
        return list;
    }

    int direction(Point o) {
        for (int i = 0; i < 8; i++) {
            if (move(i).equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int compareTo(Point o) {
        return x == o.x ? Integer.compare(y, o.y) : Integer.compare(x, o.x);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }
        Point point = (Point)o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return x * 31 + y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[][] nextCharArray(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
