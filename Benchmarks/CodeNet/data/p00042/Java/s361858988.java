/**
 * @author yuichirw
 *
 */
import java.util.*;
import static java.lang.Math.*;

public class Main {
	static int W, N, C;
	static int[] v, w;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		W = sc.nextInt();
		if(W == 0) return false;
		
		N = sc.nextInt();
		v = new int[N]; w = new int[N];
		String[] tmp = null;
		for(int i = 0; i < N; i++) {
			tmp = sc.next().split(",");
			v[i] = Integer.parseInt(tmp[0]); w[i] = Integer.parseInt(tmp[1]);
		}
		return true;
	}
	
	static void solve() {
		int[][] dp = new int[N+1][W+1], weight = new int[N+1][W+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= W; j++) {
				if(j < w[i-1]) {
					dp[i][j] = dp[i-1][j];
					weight[i][j] = weight[i-1][j];
				} else {
					if(dp[i-1][j] <= (dp[i-1][j - w[i-1]] + v[i-1])) {
						dp[i][j] = dp[i-1][j - w[i-1]] + v[i-1];
						weight[i][j] = weight[i-1][j - w[i-1]] + w[i-1];
					} else {
						dp[i][j] = dp[i-1][j];
						weight[i][j] = weight[i-1][j];
					}
				}
			}
		}
		System.out.println("Case " + (C++) + ":");
		System.out.println(dp[N][W]);
		System.out.println(weight[N][W]);
		
	}
	
	public static void main(String[] args) {
		C = 1;
		while(read()) {
			solve();
		}
	}

}