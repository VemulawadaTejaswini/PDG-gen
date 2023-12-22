import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputS = br.readLine().toCharArray();
        char[] inputT = br.readLine().toCharArray();

        int m = inputS.length;
        int n = inputT.length;
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= n; i++) dp[0][i] = 0;
        for (int j = 0; j <= m; j++) dp[j][0] = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (inputS[i - 1] == inputT[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(m > 0 &&  n > 0) {
            if (inputS[m - 1] == inputT[n - 1]){
                sb.append(inputS[m - 1]);
                m--;n--;
            }
            else if (dp[m][n - 1] > dp[m - 1][n]) n--;
            else m--;
        }
        System.out.println(sb.reverse());
    }
}
