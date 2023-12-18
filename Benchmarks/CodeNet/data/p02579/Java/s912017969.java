import java.util.*;
import java.io.*;

public class Main {
    static int h, w;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        h = sc.nextInt(); w = sc.nextInt();
        int rs = sc.nextInt() - 1; int cs = sc.nextInt() - 1;
        int re = sc.nextInt() - 1; int ce = sc.nextInt() - 1;
        int [][] grid = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) if (s.charAt(j) == '#') grid[i][j] = 1;
        }
        int [][] dp = new int[h][w];
        int [] dx = new int[]{0, 1, -1, 2, -2};
        int [] dy = new int[]{0, 1, -1, 2, -2};
        PriorityQueue<State> q = new PriorityQueue<>(Comparator.comparingInt(x -> x.t));
        q.add(new State(rs, cs, 0));
        for (int [] arr: dp) Arrays.fill(arr, Integer.MAX_VALUE);
        while (!q.isEmpty()) {
            State next = q.poll();
            int r = next.r; int c = next.c; int t = next.t;
            dp[r][c] = Math.min(dp[r][c], t);
            for (Integer mx: dx) {
                for (Integer my: dy) {
                    if (mx == 0 && my == 0) continue;
                    int nr = r + mx; int nc = c + my;
                    if (!inBounds(nr, nc)) continue;
                    if (grid[nr][nc] == 1) continue;
                    if ((mx == 0 && my == 1) || (mx == 1 && my == 0) || (mx == -1 && my == 0) || (mx == 0 && my == -1)) {
                        if (t < dp[nr][nc]) {
                            dp[nr][nc] = t;
                            if (nr == re && nc == ce) continue;
                            q.add(new State(nr, nc, t));
                        }
                    } else {
                        if (t + 1 < dp[nr][nc]) {
                            dp[nr][nc] = t + 1;
                            if (nr == re && nc == ce) continue;
                            q.add(new State(nr, nc, t + 1));
                        }
                    }
                }
            }
        }
        out.println(dp[re][ce] == Integer.MAX_VALUE ? -1 : dp[re][ce]);
        out.close();
    }

    static boolean inBounds(int r, int c) {
        return (r >= 0 && r < h)  && (c >= 0 && c < w);
    }

    static class State {
        int r; int c; int t;
        State (int r, int c, int t) {
            this.r = r; this.t = t; this.c = c;
        }
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}