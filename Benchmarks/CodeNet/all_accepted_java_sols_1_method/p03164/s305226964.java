import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        // dp[i][j]：ｉ番目までの品物からいくつか選んで価値がｊとなるときの最小の重さ
        int[][] dp = new int[N+1][N * 1000 +1];
        int max = 0;
        Arrays.fill(dp[0], (int)Math.pow(10, 9)+1);
        dp[0][0] = 0;
        for(int i = 0; i < N; i++){
            int w = sc.nextInt();
            int v = sc.nextInt();
            for(int j = 0; j <= N * 1000; j++){
                if(j < v) dp[i+1][j] = dp[i][j];
                else dp[i+1][j] = Math.min(dp[i][j], dp[i][j-v] + w);
                if(dp[i+1][j] <= W && j > max) max = j;
            }
        }
        System.out.println(max);
        sc.close();

    }

}
