import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Largest_Square {
    int h, w;
    int[][] board;

    public static void main(String args[]) {
        new Largest_Square().run();
    }

    void run() {
        FastReader sc = new FastReader();
        h = sc.nextInt();
        w = sc.nextInt();
        board = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        solve();
    }

    void solve() {
        int[][] dp = new int[h][w];
        if (board[0][0] == 1) {
            dp[0][0] = 0;
        } else {
            dp[0][0] = 1;
        }
        int maxWidth = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j] == 1) {
                    continue;
                }
                if (i == 0 && j == 0) {
                    continue;
                }
                int temp = Integer.MAX_VALUE;
                if (i > 0 && j > 0 && board[i][j] == 0) {
                    temp = Math.min(temp, dp[i - 1][j - 1] + 1);
                }
                if (i > 0 && board[i][j] == 0) {
                    temp = Math.min(temp, dp[i - 1][j] + 1);
                }
                if (j > 0 && board[i][j] == 0) {
                    temp = Math.min(temp, dp[i][j - 1] + 1);
                }
                dp[i][j] = temp == Integer.MAX_VALUE ? 1 : temp;
                maxWidth = Math.max(maxWidth, dp[i][j]);
            }
        }
        System.out.println(maxWidth * maxWidth);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}

