import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double[] p=new double[n];
		for (int i=0;i<n;++i)
			p[i]=in.nextDouble();
		double[][] dp=new double[n+1][n+1];
		dp[0][0]=1;
		for (int i=0;i<=n;++i)
			for (int j=0;j<=n;++j) {
				if (i+j>=n) break;
				int t=i+j;
				dp[i+1][j]+=dp[i][j]*p[t];
				dp[i][j+1]+=dp[i][j]*(1-p[t]);
			}
		double res=0;
		for (int i=n/2+1;i<=n;++i)
			res+=dp[i][n-i];
		System.out.printf("%.12f\n",res);
	}
}