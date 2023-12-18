import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        APondSkater solver = new APondSkater();
        solver.solve(1, in, out);
        out.close();
    }

    static class APondSkater {
        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[][] grid = new int[n][m];
            int[][] dist = new int[n][m];
            for (int[] x : dist) Arrays.fill(x, 1000000);
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, -1, 0, 1};
            int x1 = sc.nextInt() - 1;
            int y1 = sc.nextInt() - 1;
            int x2 = sc.nextInt() - 1;
            int y2 = sc.nextInt() - 1;
            for (int i = 0; i < n; i++) {
                char[] tmp = sc.nextLine().toCharArray();
                for (int j = 0; j < m; j++) {
                    grid[i][j] = (tmp[j] == '@' ? 1 : 0);
                }
            }
            boolean[][] vis = new boolean[n][m];
            Queue<pair> q = new LinkedList<>();
            q.add(new pair(x1, y1));
            dist[x1][y1] = 0;
            vis[x1][y1] = true;
            int ans = Integer.MAX_VALUE;
            while (q.size() > 0) {
                pair cur = q.poll();
                if (cur.a == x2 && cur.b == y2) {
                    ans = Math.min(ans, dist[x2][y2]);
                    break;
                }
                for (int i = 0; i < 4; i++) {
                    for (int c = 1; c <= k; c++) {
//                    if(cur.a ==0&&cur.b==3){
//                        pw.println(cur.a+c*dx[i]+" "+(cur.b+c*dy[i]));
//                    }
                        if (valid(cur.a + c * dx[i], cur.b + c * dy[i], n, m) && grid[cur.a + c * dx[i]][cur.b + c * dy[i]] == 0) {
                            if (!vis[cur.a + c * dx[i]][cur.b + c * dy[i]])
                                if (1 + dist[cur.a][cur.b] < dist[cur.a + c * dx[i]][cur.b + c * dy[i]]) {
                                    vis[cur.a + c * dx[i]][cur.b + c * dy[i]] = true;
                                    dist[cur.a + c * dx[i]][cur.b + c * dy[i]] = 1 + dist[cur.a][cur.b];
                                    q.add(new pair(cur.a + c * dx[i], cur.b + c * dy[i]));
                                } else break;
                        } else break;
                    }
                }
            }
//        for(int []x:dist){
//            for(int y :x){
//                pw.print((y==1000000?-1:y)+" ");
//            }pw.println();
//        }
            pw.println(ans == Integer.MAX_VALUE ? -1 : ans);

        }

        boolean valid(int i, int j, int n, int m) {
            if (i < 0) return false;
            if (i >= n) return false;
            if (j < 0) return false;
            if (j >= m) return false;
            return true;
        }

        public class pair implements Comparable<pair> {
            int a;
            int b;

            public pair(int a, int b) {
                this.a = a;
                this.b = b;
            }

            public int compareTo(pair pair) {
                return a - pair.a == 0 ? b - pair.b : a - pair.a;
            }

        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String nextLine() {
            try {
                return br.readLine();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}

