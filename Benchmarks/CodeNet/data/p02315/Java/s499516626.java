import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	static int[][] dp=new int[101][10001];
	static int N, W;
    static int[] w=new int[101];
    static int[] v=new int[101];
	static void dp() {
    	for(int i=0; i<=W; i++) {
    		dp[0][i]=0;
    	}
    	for(int i=0; i<N; i++) {
    		for(int j=0; j<=W; j++) {
    			if(j<w[i]) {
    				dp[i+1][j]=dp[i][j];
    			}
    			else {
    				dp[i+1][j]=max(dp[i][j], dp[i][j-w[i]]+v[i]);
    			}
    		}
    	}
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        W=sc.nextInt();
        for(int i=0; i<N; i++) {
        	v[i]=sc.nextInt();
        	w[i]=sc.nextInt();
        }
        dp();
        System.out.println(dp[N][W]);
        
	}
}
