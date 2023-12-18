import java.util.*;
public class Main {
    static int max(int a,int b){
        if(a<b)return b;
        else return a;
    }
    static int DP(int N,int W,int[] v,int[] w){
        int[][] dp=new int[101][10001];
        for(int i=N-1;i>=0;i--){
            for(int j=0;j<=W;j++){
                if(j<w[i])dp[i][j]=dp[i+1][j];
                else dp[i][j]=max(dp[i+1][j],dp[i+1][j-w[i]]+v[i]);
            }
        }
        return dp[0][W];
    }
    public static void main(String[] args) {
        int N,W;
        int[] w=new int[100],v=new int[100];
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        W=sc.nextInt();
        for(int i=0;i<N;i++){
            v[i]=sc.nextInt();
            w[i]=sc.nextInt();
        }
        System.out.println(DP(N,W,v,w));
    }
}

