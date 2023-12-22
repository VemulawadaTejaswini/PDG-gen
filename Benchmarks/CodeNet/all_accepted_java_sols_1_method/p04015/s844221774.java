import java.util.*;

public class Main{
    static int N;
    static int A;
    static int[] x;
    static long count;
    static int sum;
    static int max;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        A = sc.nextInt();
        x = new int[N];
        max = A;
        for(int i = 0;i < N; i++){
            x[i] = sc.nextInt();
            max = Math.max(max, x[i]);
            x[i] -= A;
        }
        sc.close();
        long[][] dp = new long[N+1][2*N*max+1];
        for(int i = 0; i < N+1; i++){
            for(int j = 0; j < dp[i].length; j++){
                if(i == 0){
                    if(j == N*max)
                        dp[i][j] = 1;
                    else
                        dp[i][j] = 0;
                } else {
                    if(j-x[i-1] < 0 || j-x[i-1] > 2*N*max)
                        dp[i][j] = dp[i-1][j];
                    else
                        dp[i][j] = dp[i-1][j] + dp[i-1][j-x[i-1]];
                }
            }
        }
        System.out.println(dp[N][N*max]-1);
    }
}