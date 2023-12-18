import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FSingleDot solver = new FSingleDot();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSingleDot {
        private int n;
        private int m;
        private int[] a;
        private int[] b;
        private int[] c;
        private int[] d;
        private int[] e;
        private int[] f;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            a = new int[n];
            b = new int[n];
            c = new int[n];
            d = new int[m];
            e = new int[m];
            f = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
                c[i] = in.nextInt();
            }
            for (int i = 0; i < m; i++) {
                d[i] = in.nextInt();
                e[i] = in.nextInt();
                f[i] = in.nextInt();
            }

            long res = solveOther();
            out.println(res == -1 ? "INF" : res);
        }

        public long solveOther() {
            TreeMap<Integer, Integer> mapx = new TreeMap<>();
            mapx.put(0, null);
            for (int i = 0; i < n; i++) {
                mapx.put(a[i], null);
                mapx.put(b[i], null);
            }
            for (int i = 0; i < m; i++) {
                mapx.put(d[i], null);
            }
            Integer[] arr = mapx.keySet().toArray(new Integer[0]);
            int cnt = 0;
            for (Integer i : arr) {
                mapx.put(i, cnt);
                cnt++;
            }
            int[] tox = new int[mapx.size()];
            for (Integer key : mapx.keySet()) {
                tox[mapx.get(key)] = key;
            }

            TreeMap<Integer, Integer> mapy = new TreeMap<>();
            mapy.put(0, null);
            for (int i = 0; i < n; i++) {
                mapy.put(c[i], null);
            }
            for (int i = 0; i < m; i++) {
                mapy.put(e[i], null);
                mapy.put(f[i], null);
            }
            arr = mapy.keySet().toArray(new Integer[0]);
            cnt = 0;
            for (Integer i : arr) {
                mapy.put(i, cnt);
                cnt++;
            }
            int[] toy = new int[mapy.size()];
            for (Integer key : mapy.keySet()) {
                toy[mapy.get(key)] = key;
            }


            boolean[][] ngy = new boolean[tox.length + 1][toy.length + 1];
            for (int i = 0; i < n; i++) {
                int x1 = mapx.get(a[i]);
                int x2 = mapx.get(b[i]);
                int y = mapy.get(c[i]);
                for (int j = x1 + 1; j <= x2; j++) {
                    ngy[j][y] = true;
                }
            }

            boolean[][] ngx = new boolean[tox.length + 1][toy.length + 1];
            for (int i = 0; i < m; i++) {
                int x = mapx.get(d[i]);
                int y1 = mapy.get(e[i]);
                int y2 = mapy.get(f[i]);
                for (int j = y1 + 1; j <= y2; j++) {
                    ngx[x][j] = true;
                }
            }


            boolean[][] visit = new boolean[tox.length + 1][toy.length + 1];
            int fx = mapx.get(0);
            int fy = mapy.get(0);
            if (fx == 0 || fx == tox.length - 1 || fy == 0 || fy == toy.length - 1) {
                //System.out.println("INF");
                return -1;
            }

            Queue<Integer> que = new ArrayDeque<>();
            que.add(fx * 10000 + fy);
            visit[fx][fy] = true;
            while (!que.isEmpty()) {
                int cur = que.poll();
                int cx = cur / 10000;
                int cy = cur % 10000;
                // 上
                int nx = cx - 1;
                int ny = cy;
                if (!ngx[nx][ny] && !visit[nx][ny]) {
                    if (nx == 0) {
                        //System.out.println("INF");
                        return -1;
                    }
                    que.add(nx * 10000 + ny);
                    visit[nx][ny] = true;
                }
                // 下
                nx = cx + 1;
                ny = cy;
                if (!ngx[cx][ny] && !visit[nx][ny]) {
                    if (nx == tox.length) {
                        //System.out.println("INF");
                        return -1;
                    }
                    que.add(nx * 10000 + ny);
                    visit[nx][ny] = true;
                }
                // 左
                nx = cx;
                ny = cy - 1;
                if (!ngy[nx][ny] && !visit[nx][ny]) {
                    if (ny == 0) {
                        //System.out.println("INF");
                        return -1;
                    }
                    que.add(nx * 10000 + ny);
                    visit[nx][ny] = true;
                }
                // 右
                nx = cx;
                ny = cy + 1;
                if (!ngy[nx][cy] && !visit[nx][ny]) {
                    if (ny == toy.length) {
                        //System.out.println("INF");
                        return -1;
                    }
                    que.add(nx * 10000 + ny);
                    visit[nx][ny] = true;
                }
            }

            long ans = 0;
            for (int i = 1; i < tox.length; i++) {
                for (int j = 1; j < toy.length; j++) {
                    if (visit[i][j]) {
                        long dx = tox[i] - tox[i - 1];
                        long dy = toy[j] - toy[j - 1];
                        ans += dx * dy;
                    }
                }
            }
            return ans;
        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

