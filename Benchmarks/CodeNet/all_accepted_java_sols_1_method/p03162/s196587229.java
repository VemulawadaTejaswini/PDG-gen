import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }
        int[][] dp = new int[N+1][3];
        for(int i=1 ;i<=N;i++ ){
            dp[i][0]= A[i-1] + Math.max(dp[i-1][1],dp[i-1][2]);
            dp[i][1]= B[i-1] + Math.max(dp[i-1][0],dp[i-1][2]);
            dp[i][2]= C[i-1] + Math.max(dp[i-1][0],dp[i-1][1]);
        }
        int res = Math.max(dp[N][0],dp[N][1]);
        res = Math.max(res,dp[N][2]);
        System.out.println(res);
    }
}
