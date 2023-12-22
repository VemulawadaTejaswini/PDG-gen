import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String t=in.next();
		int n=s.length();
		int m=t.length();
		int[][] dp=new int[n+1][m+1];
		for (int i=1;i<=n;++i)
			for (int j=1;j<=m;++j)
				if (s.charAt(i-1)==t.charAt(j-1)) dp[i][j]=dp[i-1][j-1]+1;
				else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
		String res="";
		while (n>0&&m>0) {
			if (dp[n][m]==dp[n-1][m]) --n;
			else if (dp[n][m]==dp[n][m-1]) --m;
			else {
				--n;
				--m;
				res=s.charAt(n)+res;
			}
		}
		System.out.println(res);
	}
}