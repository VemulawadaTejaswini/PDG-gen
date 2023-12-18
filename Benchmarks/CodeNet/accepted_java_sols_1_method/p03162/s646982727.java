import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n+1][3];
        for(int i=1 ; i<=n ;++i){
            for (int j = 0 ; j<3 ; ++j){
                arr[i][j] = scanner.nextInt();
            }
        }
        int[][] dp= new int[n+1][3];
        for(int i=1 ; i<=n ; ++i){
            dp[i][0] = arr[i][0] + Math.max(dp[i-1][1],dp[i-1][2]);
            dp[i][1] = arr[i][1] + Math.max(dp[i-1][0],dp[i-1][2]);
            dp[i][2] = arr[i][2] + Math.max(dp[i-1][1],dp[i-1][0]);
        }
        System.out.println(Math.max(dp[n][0],Math.max(dp[n][1],dp[n][2])));
    }
}
