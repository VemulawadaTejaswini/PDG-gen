import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ss = br.readLine().trim().split("\\s+");
        int mod = (int)Math.pow(10, 9) + 7;
        int n = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);
        char[][] matrix = new char[n][m];
        long[][] dp = new long[n][m];
        for (int i=0; i<n; i++) {
            String s = br.readLine().trim();
            for (int j=0; j<m; j++) {
                matrix[i][j] = s.charAt(j);
            }
        }
        dp[0][0] = 1;
        for (int i=1; i<m; i++) {
            if (matrix[0][i] == '.') {
                dp[0][i] = 1;
            } else {
                break;
            }
        }
        for (int i=1; i<n; i++) {
            if (matrix[i][0] == '.') {
                dp[i][0] = 1;
            } else {
                break;
            }
        }
        for (int i=1; i<n; i++) {
            for (int j=1; j<m; j++) {
                if (matrix[i][j] == '#') {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = ((dp[i-1][j]%mod) + (dp[i][j-1]%mod)) % mod;
                }
            }
        }
        System.out.println(dp[n-1][m-1]);
    }
}