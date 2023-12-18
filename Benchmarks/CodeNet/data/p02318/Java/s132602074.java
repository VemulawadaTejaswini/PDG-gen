import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int n = s.length();
		int m = t.length();
		int[][] dp = new int[n+1][m+1];
		for(int i=1; i<=n; i++){
			dp[i][0] = i;
		}
		for(int j=1; j<=m; j++){
			dp[0][j] = j;
		}
		for(int i=1; i<=n; i++){
			for(int j=1; j<=m; j++){
				if(s.charAt(i-1)==t.charAt(j-1)){
					dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]+1);
					dp[i][j] = Math.min(dp[i][j], dp[i][j-1]+1);
				}
				else{
					dp[i][j] = Math.min(dp[i-1][j-1]+1, dp[i-1][j]+1);
					dp[i][j] = Math.min(dp[i][j], dp[i][j-1]+1);
				}
			}
		}
		System.out.println(dp[n][m]);
	}
}
