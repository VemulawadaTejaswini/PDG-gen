import java.io.*;

public class Main { 
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int n = str1.length();
		int m = str2.length();
		int[][] dp = new int[n+1][m+1];
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=m; j++) {
				if(i==0) dp[i][0] = 0;
				else if(j==0) dp[0][j] = 0;
				else if(j>0 && i>0 && str1.charAt(i-1)==str2.charAt(j-1)) dp[i][j] = dp[i-1][j-1]+1;
				else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		StringBuffer lcs = new StringBuffer("");
		int i=n, j = m;
		while(i>0 && j>0) {
			if(str1.charAt(i-1) == str2.charAt(j-1)) {
				i--;j--;
				lcs.append(str1.charAt(i));
			}
			else if(dp[i-1][j] > dp[i][j-1]) i-- ;
			else j--;
		}
		System.out.println(lcs.reverse().toString());
	}
}
