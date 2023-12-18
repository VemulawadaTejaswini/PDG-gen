import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int r = sc.nextInt(); int c = sc.nextInt(); int k = sc.nextInt();
        long [][] item = new long[r][c];
        for (int i = 0; i < k; i++) {
            int row = sc.nextInt() - 1; int col = sc.nextInt() - 1;
            long val = sc.nextLong();
            item[row][col] = val;
        }
        long [][][] dp = new long[r][c][4];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int x = 0; x <= 3; x++) {
                    if (item[i][j] > 0) {
                        if (x > 0)
                            dp[i][j][x] = Math.max(dp[i][j][x], (j == 0 ? 0 : dp[i][j - 1][x - 1]) + item[i][j]);
                        for (int y = 0; y <= 3; y++) {
                            dp[i][j][1] = Math.max(dp[i][j][1], (i == 0 ? 0 : dp[i - 1][j][y]) + item[i][j]);
                        }
                    }
                    dp[i][j][x] = Math.max(dp[i][j][x], (j == 0 ? 0 : dp[i][j - 1][x]));
                    for (int y = 0; y <= 3; y++) {
                        dp[i][j][0] = Math.max(dp[i][j][0], (i == 0 ? 0 : dp[i - 1][j][y]));
                    }
                }
            }
        }
        long ans = 0;
        for (int x = 0; x <= 3; x++) ans = Math.max(ans, dp[r - 1][c - 1][x]);
        out.println(ans);
        out.close();
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