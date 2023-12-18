import java.util.Scanner;

public class Main {
    static public void main(String args[]){
        final int INF = (int)1e10;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[][] hapi = new long[n][3];

        long[][] dp = new long[n][3];
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < 3 ; j++) {
                hapi[i][j] = sc.nextLong();
                dp[i][j] = INF;
            }
        }
        for(int i = 0 ; i < 3 ; i++){
            dp[0][i] = hapi[0][i];
        }

        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0 ; j < 3 ; j++) {
                dp[i + 1][j] = Math.max(dp[i][(j+1)%3]+hapi[i+1][j], dp[i][(j+2)%3]+hapi[i+1][j]);
            }
        }

        long ans = Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
        System.out.println(ans);
    }
}
