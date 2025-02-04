import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		final int INF = 999999;
		char[][] maze = new char[H][W];
		int[][] dp = new int[H][W];
			
		for(int i=0; i<H; i++) {
			String s = sc.next();
			for(int j=0; j<W; j++) {
				maze[i][j] = s.charAt(j);
				dp[i][j] = INF;
			}
		}
		
		if(maze[0][0] == '.') 
			dp[0][0] =0;
		else 
			dp[0][0] = 1;
		//ある升目に到達する経路の最短値
		for(int i=1; i<W; i++) {
			dp[0][i] = dp[0][i-1];
			if (maze[0][i-1] == '.' && maze[0][i] == '#') {
				dp[0][i]++;
			}
		}
		for(int i=1; i<H; i++) {
			dp[i][0] = dp[i-1][0];
			if(maze[i-1][0] == '.' && maze[i][0]  == '#') {
				dp[i][0]++;
			}
		}
		for(int i=1; i<H; i++) {
			for(int j=1; j<W; j++) {
				int up = dp[i-1][j];
				if(maze[i-1][j] == '.' && maze[i][j] == '#') {
					up++;
				}
				int left = dp[i][j-1];
				if(maze[i][j-1] == '.' && maze[i][j] == '#') {
					left++;
				}
				dp[i][j] = min(dp[i][j], up);
				dp[i][j] = min(dp[i][j], left);
			}
		}
out.println(dp[H-1][W-1]);	
	}
}
