import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        State[][][] d = new State[5][n + 2][m + 2];
        boolean[][] ok = new boolean[n + 2][m + 2];
        for (int i = 0; i < n; i++) {
            char[] s = in.next().toCharArray();
            for (int j = 0; j < m; j++) {
                if (s[j] == '.') {
                    ok[i + 1][j + 1] = true;
                }
            }
        }
        PriorityQueue<State> pq = new PriorityQueue<>();
        {
            State s = new State(4, x1, y1, 0, 0);
            pq.add(s);
            d[4][x1][y1] = s;
        }
        boolean[][][] was = new boolean[5][n + 2][m + 2];
        int[] dx = new int[]{0, -1, 1, 0};
        int[] dy = new int[]{-1, 0, 0, 1};
        while (!pq.isEmpty()) {
            State s = pq.poll();
            int dir = s.dir, x = s.x, y = s.y;
            if (was[dir][x][y]) {
                continue;
            }
            was[dir][x][y] = true;
//            System.err.println(s);
            if (dir == 4) {
                for (int i = 0; i < dx.length; i++) {
                    int nx = x + dx[i], ny = y + dy[i];
                    State ns = new State(i, nx, ny, k - 1, s.cost + 1);
                    if (ok[nx][ny] && (d[i][nx][ny] == null || d[i][nx][ny].compareTo(ns) > 0)) {
                        d[i][nx][ny] = ns;
                        pq.add(ns);
                    }
                }
            } else {
                if (s.more > 0) {
                    int nx = x + dx[s.dir], ny = y + dy[s.dir];
                    if (ok[nx][ny]) {
                        State ns = new State(s.dir, nx, ny, s.more - 1, s.cost);
                        if (d[s.dir][nx][ny] == null || d[s.dir][nx][ny].compareTo(ns) > 0) {
                            d[s.dir][nx][ny] = ns;
                            pq.add(ns);
                        }
                    }
                }
                {
                    State ns = new State(4, x, y, 0, s.cost);
                    if (d[ns.dir][x][y] == null || d[ns.dir][x][y].compareTo(ns) > 0) {
                        d[ns.dir][x][y] = ns;
                        pq.add(ns);
                    }
                }
            }
        }
        State s = d[4][x2][y2];
        out.println(s == null ? -1 : s.cost);
    }

    class State implements Comparable<State> {
        int dir;
        int x, y;
        int more;
        int cost;

        public State(int dir, int x, int y, int more, int cost) {
            this.dir = dir;
            this.x = x;
            this.y = y;
            this.more = more;
            this.cost = cost;
        }

        @Override
        public int compareTo(State o) {
            if (cost != o.cost) {
                return Integer.compare(cost, o.cost);
            }
            if (more != o.more) {
                return Integer.compare(o.more, more);
            }
            if (x != o.x) {
                return Integer.compare(x, o.x);
            }
            if (y != o.y) {
                return Integer.compare(y, o.y);
            }
            return Integer.compare(dir, o.dir);
        }

        @Override
        public String toString() {
            return "State{" +
                    "dir=" + dir +
                    ", x=" + x +
                    ", y=" + y +
                    ", more=" + more +
                    ", cost=" + cost +
                    '}';
        }
    }


    final int mod = 988244353;

    int mul(int x, int y) {
        return (int) ((x * 1L * y) % mod);
    }

    int add(int x, int y) {
        x += y;
        return x >= mod ? (x - mod) : x;
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();
        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}