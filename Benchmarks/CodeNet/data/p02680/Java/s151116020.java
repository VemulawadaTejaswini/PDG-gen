
import java.io.*;
import java.util.*;

public class Main {

    private static final int[][] DIR = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} };

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] xs = new int[n][3];
        int[][] ys = new int[m][3];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                xs[i][j] = sc.nextInt();
            }
            if (xs[i][0] > xs[i][1]) {
                swap(xs[i], 0, 1);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                ys[i][j] = sc.nextInt();
            }
            swap(ys[i], 0,2);
            if (ys[i][0] > ys[i][1]) {
                swap(ys[i], 0, 1);
            }
        }

        Arrays.sort(xs, (a, b) -> a[2] == b[2] ? a[0] - b[0] : a[2] - b[2]);
        Arrays.sort(ys, (a, b) -> a[2] == b[2] ? a[0] - b[0] : a[2] - b[2]);

        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        xSet.add(Integer.MIN_VALUE);
        xSet.add(Integer.MAX_VALUE);
        ySet.add(Integer.MIN_VALUE);
        ySet.add(Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            xSet.add(xs[i][0]);
            xSet.add(xs[i][1]);
            ySet.add(xs[i][2]);
        }

        for (int i = 0; i < m; i++) {
            ySet.add(ys[i][0]);
            ySet.add(ys[i][1]);
            xSet.add(ys[i][2]);
        }

        List<Integer> x = new ArrayList<>(xSet);
        List<Integer> y = new ArrayList<>(ySet);
        Collections.sort(x);
        Collections.sort(y);

        int xn = x.size() - 1;
        int yn = y.size() - 1;

        long[][] area = new long[xn][yn];
        for (int i = 0; i < xn; i++) {
            for (int j = 0; j < yn; j++) {
                if (i == 0 || i == xn - 1 || j == 0 || j == yn - 1) {
                    area[i][j] = Long.MAX_VALUE;
                    continue;
                }

                long xl = x.get(i + 1) - x.get(i);
                long yl = y.get(j + 1) - y.get(j);
                area[i][j] = xl * yl;
            }
        }

        boolean[][][] g = new boolean[xn][yn][4];
        int cj = 1;
        for (int[] sg : xs) {
             while (sg[2] > y.get(cj)) {
                 ++cj;
             }
             for (int i = 1; i < xn; ++i) {
                 if (x.get(i + 1) <= sg[1] && x.get(i) >= sg[0]) {
                     g[i][cj][2] = true;
                     g[i][cj - 1][0] = true;
                 }
             }
        }

        int ci = 1;
        for (int[] sg : ys) {
            while (sg[2] > x.get(ci)) {
                ++ci;
            }
            for (int j = 1; j < yn; ++j) {
                if (y.get(j + 1) <= sg[1] && y.get(j) >= sg[0]) {
                    g[ci][j][3] = true;
                    g[ci - 1][j][1] = true;
                }
            }
        }

        boolean[][] vis = new boolean[xn][yn];
        Queue<int[]> q = new ArrayDeque<>();
        long ans = 0;
        for (int i = 0; i < xn; i++) {
            for (int j = 0; j < yn; j++) {
                if (x.get(i) <= 0 && x .get(i + 1) >= 0 && y.get(j) <= 0 && y.get(j + 1) >= 0) {
                    q.add(new int[] { i, j });
                    vis[i][j] = true;
                }
            }
        }

        while (!q.isEmpty()) {
            int[] u = q.poll();

            if (area[u[0]][u[1]] == Long.MAX_VALUE) {
                out.println("INF");
                return;
            }

            ans += area[u[0]][u[1]];

            for (int i = 0; i < DIR.length; ++i) {
                int[] d = DIR[i];
                if (g[u[0]][u[1]][i]) {
                    continue;
                }

                int[] v = new int[] { u[0] + d[0], u[1] + d[1] };
                if (v[0] >= 0 && v[0] < xn && v[1] >= 0 && v[1] < yn) {
                    if (!vis[v[0]][v[1]]) {
                        q.add(v);
                        vis[v[0]][v[1]] = true;
                    }
                }
            }
        }

        out.println(ans);
    }

    private static PrintWriter out;
    private static MyScanner sc;

    private static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        private MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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
        out = new PrintWriter(new BufferedOutputStream(System.out));
        sc = new MyScanner();
        new Main().solve();
        out.close();
    }
}
