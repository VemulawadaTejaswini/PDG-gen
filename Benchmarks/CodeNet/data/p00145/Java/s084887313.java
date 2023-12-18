import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] m = new int[n][2];
		int[][] dp = new int[n][n];
		for(int i=0;i<n;i++){
			Arrays.fill(dp[i], Integer.MAX_VALUE);
			dp[i][i] = 0;
			m[i][0] = sc.nextInt();
			m[i][1] = sc.nextInt();
		}
		
		for(int w=1;w<n;w++){
			for(int i=w;i<n;i++){
				for(int j=i-w;j<i;j++){
					int c = m[i-w][0]*m[j][1]*m[j+1][0]*m[i][1];
					dp[i-w][i] = Math.min(dp[i-w][i], dp[i-w][j]+dp[j+1][i]+c);
				}
			}
		}
		System.out.println(dp[0][n-1]);
	}
}