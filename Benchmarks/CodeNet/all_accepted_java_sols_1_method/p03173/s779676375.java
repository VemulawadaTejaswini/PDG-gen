
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		long[] arr=new long[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextLong();
		long[][] dp=new long[n][n];
		for(int i=0;i<n;i++) {
			dp[i][i]=0;
		}
		long[] pre=new long[n];
		pre[0]=arr[0];
		for(int i=1;i<n;i++)
			pre[i]=pre[i-1]+arr[i];
		for(int len=2;len<=n;len++) {
			int i=0;
			int j=i+len-1;
			while(i<n && j<n) {
			if(len==2) {
				dp[i][j]=arr[i]+arr[j];
			}
			else {
				long best=Long.MAX_VALUE;
				for(int k=i;k<j;k++) {
					long cand=dp[i][k]+dp[k+1][j]+((i==0)?pre[j]:pre[j]-pre[i-1]);
					best=Math.min(best, cand);
				}
				dp[i][j]=best;
			}
			i++;
			j++;
			}
		}
		
		System.out.println(dp[0][n-1]);
	}
	
	
	
}
