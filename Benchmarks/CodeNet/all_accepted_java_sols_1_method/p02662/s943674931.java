import java.util.*;
import java.io.PrintWriter;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		long mod=998244353;
		long[][] dp=new long[n+1][s+1];
		dp[0][0]=1;
		for(int i=1; i<=n; i++){
			int a=sc.nextInt();
			for(int j=s; j>=0; j--){
				dp[i][j]=(2*dp[i-1][j])%mod;
				if(j+a<=s && dp[i-1][j]>0){
					dp[i][j+a]=(dp[i][j+a]+dp[i-1][j])%mod;
				}
			}
		}
		System.out.println(dp[n][s]);
	}
}
