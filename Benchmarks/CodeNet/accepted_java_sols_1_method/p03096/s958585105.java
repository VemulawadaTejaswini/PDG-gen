import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] rec=new int[200000];
		Arrays.fill(rec,n);
		long[] dp=new long[n+1];
		long mod=1000000007;
		dp[0]=1;
		for(int i=1; i<=n; i++){
			int c=sc.nextInt()-1;
			if(rec[c]<i-1){
				dp[i]=dp[rec[c]];
			}
			dp[i]+=dp[i-1];
			dp[i]%=mod;
			rec[c]=i;
		}
		System.out.println(dp[n]);
	}
}
