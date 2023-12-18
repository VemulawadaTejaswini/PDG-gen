import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    long d;
    long[] cost = new long[3];
    int[] divs = new int[]{2, 3, 5};

    Map<Long, Long> cache;

    long get(long n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        if (n == 1) {
            return d;
        }
        long res = Long.MAX_VALUE;
        if (n * 1.0 * d < 1e17) {
            res = n * d;
        }
        for (int it = 0; it < divs.length; it++) {
            int div = divs[it];
            for (long next = n - div + 1; next < n + div; next++) {
                if (next > 1 && next % div == 0) {
                    long curRes = Math.abs(next - n) * d + get(next / div) + cost[it];
                    res = Math.min(res, curRes);
                }
            }
        }
        cache.put(n, res);
        return res;
    }

    void solve() {
        int n = in.nextInt();
        int[][] d = new int[n + 2][n + 2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int dist = Math.min(Math.min(i, n - i - 1), Math.min(j, n - j - 1));
                d[i + 1][j + 1] = dist;
            }
        }
        boolean[][] occupied = new boolean[n + 2][n + 2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                occupied[i + 1][j + 1] = true;
            }
        }
        int res = 0;
        int[] checkX = new int[n * n];
        int[] checkY = new int[n * n];
        int[] dx = new int[]{0, 1, -1, 0};
        int[] dy = new int[]{-1, 0, 0, 1};
        for (int it = 0; it < n * n; it++) {
            int id = in.nextInt() - 1;
            int x = id / n + 1;
            int y = id % n + 1;
            occupied[x][y] = false;
            res += d[x][y];
            checkX[0] = x;
            checkY[0] = y;
            int checkSz = 1;
            for (int i = 0; i < checkSz; i++) {
                int cx = checkX[i], cy = checkY[i];
                int ncost = d[cx][cy] + (occupied[cx][cy] ? 1 : 0);
                for (int j = 0; j < dx.length; j++) {
                    int nx = cx + dx[j], ny = cy + dy[j];
                    if (d[nx][ny] > ncost) {
                        d[nx][ny] = ncost;
                        checkX[checkSz] = nx;
                        checkY[checkSz] = ny;
                        checkSz++;
                    }
                }
            }
        }
        out.println(res);
    }

    final int mod = 988244353;

    int mul(int x, int y) {
        return (int) ((x * 1L * y) % mod);
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