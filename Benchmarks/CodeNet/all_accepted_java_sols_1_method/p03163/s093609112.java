import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];

        for(int i=0;i<N;i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        long[][] dp = new long[N+1][W+1];
        for(int i=1 ;i<=N;i++ ){//items
            for(int j=1;j<=W;j++){
                long m ;
                if(j-w[i-1]>=0){
                    m = Math.max(dp[i-1][j-w[i-1]]+v[i-1], dp[i-1][j]);
                }else{
                    m =  dp[i-1][j];
                }
                dp[i][j]=m;
            }
        }
        System.out.println(dp[N][W]);
    }
}
