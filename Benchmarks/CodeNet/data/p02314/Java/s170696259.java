import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c[] = new int[m];
        for(int i = 0 ; i < m ; i++)
            c[i] = sc.nextInt();
        int dp[][] = new int[m+1][n+1];
        dp[0][0] = 0;
        for(int i = 1 ; i <= n ; i++)
            dp[0][i] = 100000;
        for(int i = 1 ; i <= m ; i++){
            for(int j = 0 ; j <= n ; j++){
                if(c[i-1] <= j)
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-c[i-1]] + 1);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(dp[m][n]);
    }
}
