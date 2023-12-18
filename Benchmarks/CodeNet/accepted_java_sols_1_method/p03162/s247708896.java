import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[][] a=new int[n+1][3];
		for (int i=1;i<=n;++i)
			for (int j=0;j<3;++j)
				a[i][j]=in.nextInt();
		int[][] dp=new int[n+1][3];
		for (int i=1;i<=n;++i)
			for (int j=0;j<3;++j)
				for (int k=0;k<3;++k) if (k!=j)
					dp[i][j]=Math.max(dp[i][j],dp[i-1][k]+a[i][k]);
		int res=0;
		for (int i=0;i<3;++i) res=Math.max(res,dp[n][i]);
		System.out.println(res);
	}
}