import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		final int INF = 1000000;
		char[][] s = new char[H][];
		for(int i=0; i<H; i++)
			s[i] = sc.next().toCharArray();
		
		int[][][] dp = new int[H][W][2];
		
		for(int i=0; i<H; i++)
			for(int j=0; j<W; j++)
				Arrays.fill(dp[i][j], INF);
		
		if(s[0][0]=='.') {
			dp[0][0][0]=0;
		} else {
			dp[0][0][1]=1;
		}
		
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				if(i+1<H) {
					if(s[i+1][j]=='.') {
						dp[i+1][j][0] = Math.min(dp[i+1][j][0], dp[i][j][0]);
						dp[i+1][j][0] = Math.min(dp[i+1][j][0], dp[i][j][1]);
					} else {
						dp[i+1][j][1] = Math.min(dp[i+1][j][1], dp[i][j][1]);
						dp[i+1][j][1] = Math.min(dp[i+1][j][1], dp[i][j][0]+1);
					}
				}
				if(j+1<W) {
					if(s[i][j+1]=='.') {
						dp[i][j+1][0] = Math.min(dp[i][j+1][0], dp[i][j][0]);
						dp[i][j+1][0] = Math.min(dp[i][j+1][0], dp[i][j][1]);
					} else {
						dp[i][j+1][1] = Math.min(dp[i][j+1][1], dp[i][j][1]);
						dp[i][j+1][1] = Math.min(dp[i][j+1][1], dp[i][j][0]+1);
					}
				}
			}
		}
		
		System.out.println(Math.min(dp[H-1][W-1][0], dp[H-1][W-1][1]));
		
		sc.close();
	}
}
