import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int w = Integer.parseInt(tmp[1]);
        int[] vi = new int[n];
        int[] wi = new int[n];
        for(int i = 0; i < n; i++) {
            tmp = br.readLine().split(" ");
            vi[i] = Integer.parseInt(tmp[0]);
            wi[i] = Integer.parseInt(tmp[1]);
        }
 
        int[][] dp = new int[n + 1][w + 1];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= w; j++) {
                if(j >= wi[i]) dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - wi[i]] + vi[i]);
                else dp[i + 1][j] = dp[i][j];
            }
        }
 
        System.out.println(dp[n][w]);
    }
}
