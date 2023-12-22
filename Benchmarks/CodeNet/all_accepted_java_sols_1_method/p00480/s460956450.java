import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[][] dp = new long[n-1][21];
		dp[0][sc.nextInt()] = 1;
		for(int i=1;i<n-1;i++){
			int t = sc.nextInt();
			for(int j=0;j<=20;j++){
				if(j-t>=0) dp[i][j] += dp[i-1][j-t];
				if(j+t<=20) dp[i][j] += dp[i-1][j+t];
			}
		}
		System.out.println(dp[n-2][sc.nextInt()]);
	}
}