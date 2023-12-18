import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] s = new int[n];
        int[] l = new int[n];
        int[] p = new int[n];
        for(int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            s[i] = Integer.parseInt(in[0]);
            l[i] = Integer.parseInt(in[1]);
            p[i] = Integer.parseInt(in[2]);
        }

        int m = Integer.parseInt(br.readLine());
        int[] w = new int[m];
        int maxw = 0;
        for(int i = 0; i < m; i++) {
            w[i] = Integer.parseInt(br.readLine());
            maxw = Math.max(maxw, w[i]);
        }

        int[][] dp = new int[n + 1][maxw + 1];
        for(int i = 0; i <= n; i++) {
            for(int j = 1; j <= maxw; j++) {
                dp[i][j] = -1;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= maxw; j++) {
                dp[i + 1][j] = dp[i][j];
                int min = Math.max(0, j - l[i]);
                int max = j - s[i];
                for(int k = min; k <= max; k++) {
                    if(dp[i + 1][k] != -1) {
                        dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i + 1][k] + p[i]);
                    }
                }
            }
        }

        boolean flag = true;
        for(int i = 0; i < m; i++) {
            if(dp[n][w[i]] == -1) {
                flag = false;
                break;
            }
        }

        if(flag) {
            for(int i = 0; i < m; i++) {
                System.out.println(dp[n][w[i]]);
            }
        }else {
            System.out.println(-1);
        }

        br.close();
    }
}
