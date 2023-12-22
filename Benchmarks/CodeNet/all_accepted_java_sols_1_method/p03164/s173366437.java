import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int W=sc.nextInt();
		long[][] dp=new long[n+1][1000*n+1];
		Arrays.fill(dp[0],100000000001L);
		dp[0][0]=0;
		for(int i=1; i<=n; i++){
			int w=sc.nextInt();
			int v=sc.nextInt();
			for(int j=1000*n; j>=0; j--){
				if(j>=v){
					dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-v]+w);
				}else{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		for(int i=1000*n; i>=0; i--){
			if(dp[n][i]<=W){
				System.out.println(i);
				return;
			}
		}
	}
}
