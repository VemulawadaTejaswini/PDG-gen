import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int W=in.nextInt();
		int[] w=new int[n];
		long[] v=new long[n];
		for (int i=0;i<n;++i) {
			w[i]=in.nextInt();
			v[i]=in.nextLong();
		}
		long[] dp=new long[W+1];
		for (int i=0;i<n;++i)
			for (int j=W;j>=w[i];--j)
				dp[j]=Math.max(dp[j],dp[j-w[i]]+v[i]);
		System.out.println(dp[W]);
	}
}