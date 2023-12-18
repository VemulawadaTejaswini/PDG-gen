import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.util.Deque;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BJoker solver = new BJoker();
        solver.solve(1, in, out);
        out.close();
    }

    static class BJoker {
        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] perm = in.nextIntArray(n * n);

            int INF = Integer.MAX_VALUE / 2;
            int[][] ans = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ans[i][j] = Math.min(Math.min(i, n - 1 - i), Math.min(j, n - 1 - j));
                }
            }
            boolean[][] free = new boolean[n][n];
            long result = 0;
            Deque<Integer> deq = new ArrayDeque<>();
            for (int i = 0; i < perm.length; i++) {
                perm[i]--;
                int r = perm[i] / n, c = perm[i] % n;
                result += ans[r][c];
                free[r][c] = true;
                deq.add(perm[i]);
                while (!deq.isEmpty()) {
                    int cur = deq.pollFirst();
                    r = cur / n;
                    c = cur % n;
                    for (int d = 0; d < 4; d++) {
                        int nr = r + dx[d], nc = c + dy[d];
                        if (0 <= nr && nr < n && 0 <= nc && nc < n) {
                            int newAns = ans[r][c] + (free[r][c] ? 0 : 1);
                            if (newAns < ans[nr][nc]) {
                                ans[nr][nc] = newAns;
                                if (free[r][c]) {
                                    deq.addFirst(nr * n + nc);
                                } else {
                                    deq.addLast(nr * n + nc);
                                }
                            }
                        }
                    }
                }
            }
            out.println(result);
        }

    }

    static class FastScanner {
        public BufferedReader br;
        public StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        public int[] nextIntArray(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

    }
}

