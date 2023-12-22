import java.util.Scanner;

public class Main{
	public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		//dp[重さ]=価値
    		int N=sc.nextInt();
    		int W=sc.nextInt();
    		int[] v=new int[N+1];
    		int[] w=new int[N+1];
    		for(int i=1; i<=N; i++) {
    			v[i]=sc.nextInt();
    			w[i]=sc.nextInt();
    		}
    		int[][] dp=new int[N+2][W+1];
    		for(int i=1; i<=N; i++) {
    			for(int j=1; j<=W; j++) {
    				if(w[i]<=j) {
    					dp[i+1][j]=Math.max(dp[i][j-w[i]]+v[i], dp[i][j]);
    				}
    				else
    					dp[i+1][j]=dp[i][j];
    			}
    		}
    		System.out.println(dp[N+1][W]);
    	}
    }
}
