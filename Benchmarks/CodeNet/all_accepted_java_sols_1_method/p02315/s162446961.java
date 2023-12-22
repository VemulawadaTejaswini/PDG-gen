import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int c = stdIn.nextInt();

        int[] v = new int[n];
        int[] w = new int[n];
        for(int i=0; i<n; i++){
            v[i] = stdIn.nextInt();
            w[i] = stdIn.nextInt();
        }

        int[][] dp = new int[n+1][c+1];
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=c; j++){
                if(j < w[i-1]){
                    dp[i][j] = dp[i-1][j];
                }else{
                    int a = v[i-1] + dp[i-1][j-w[i-1]];
                    int b = dp[i-1][j];
                    dp[i][j] = (a > b) ? a : b;
                }
            }
        }

        System.out.println(dp[n][c]);
    }
}
