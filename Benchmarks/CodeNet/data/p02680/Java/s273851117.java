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

    int h, w;
    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer, Integer> xm = new TreeMap<>();
        Map<Integer, Integer> ym = new TreeMap<>();
        xm.put(-1500000000, 0);
        xm.put(1500000000, 0);
        xm.put(0, 0);
        ym.put(-1500000000, 0);
        ym.put(1500000000, 0);
        ym.put(0, 0);
        List<Line> list1 = new ArrayList<>();
        List<Line> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            xm.put(a, 0);
            ym.put(c, 0);
            xm.put(b, 0);
            list1.add(new Line(a, c, b, c));
        }
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            xm.put(a, 0);
            ym.put(b, 0);
            ym.put(c, 0);
            list2.add(new Line(a, b, a, c));
        }
        {
            int i = 0;
            for (Map.Entry<Integer, Integer> entry : xm.entrySet()) {
                entry.setValue(i);
                i += 2;
            }
        }
        {
            int i = 0;
            for (Map.Entry<Integer, Integer> entry : ym.entrySet()) {
                entry.setValue(i);
                i += 2;
            }
        }
        w = xm.size() * 2 - 1;
        h = ym.size() * 2 - 1;
        long[] width = size(xm);
        long[] height = size(ym);
        for (Line line : list1) {
            line.x1 = xm.get(line.x1);
            line.x2 = xm.get(line.x2);
            line.y1 = ym.get(line.y1);
            line.y2 = ym.get(line.y2);
        }
        for (Line line : list2) {
            line.x1 = xm.get(line.x1);
            line.x2 = xm.get(line.x2);
            line.y1 = ym.get(line.y1);
            line.y2 = ym.get(line.y2);
        }
        boolean[][] wall = new boolean[h][w];
        {
            int[][] c = new int[h + 1][w + 1];
            for (Line line : list1) {
                c[line.y1][line.x1]++;
                c[line.y2][line.x2 + 1]--;
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    c[i][j + 1] += c[i][j];
                    wall[i][j] |= c[i][j] >= 1;
                }
            }
        }
        {
            int[][] c = new int[h + 1][w + 1];
            for (Line line : list2) {
                c[line.y1][line.x1]++;
                c[line.y2 + 1][line.x2]--;
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    c[i + 1][j] += c[i][j];
                    wall[i][j] |= c[i][j] >= 1;
                }
            }
        }
        boolean[][] visited = new boolean[h][w];
        visited[ym.get(0)][xm.get(0)] = true;
        Deque<Point> deque = new ArrayDeque<>();
        deque.add(new Point(xm.get(0), ym.get(0)));
        Point.h = h;
        Point.w = w;
        long ans = 0;
        while (!deque.isEmpty()) {
            Point point = deque.pollLast();
            if (point.x == 0 || point.y == 0) {
                out.println("INF");
                return;
            }
            for (Point next : point.aroundPoints(4)) {
                if (!wall[next.y][next.x] && !visited[next.y][next.x]) {
                    ans += width[next.x] * height[next.y];
                    visited[next.y][next.x] = true;
                    deque.addLast(next);
                }
            }
        }
        out.println(ans);
    }

    long[] size(Map<Integer, Integer> map) {
        int n = map.size() * 2 - 1;
        long[] a = new long[n];
        int i = -1;
        boolean b = false;
        int last = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (b) {
                a[i] = entry.getKey() - last;
            }
            i += 2;
            b = true;
            last = entry.getKey();
        }
        return a;
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

class Line {
    int x1, y1;
    int x2, y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
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
