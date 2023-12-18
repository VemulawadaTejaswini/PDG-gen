
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if( (w|h) == 0 ) break;
			int[][] dp = new int [h+1][w+1];
			int n = sc.nextInt();
			
			for(int i=0;i<n;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				dp[y][x] = -1;
			}
			dp[1][0] = 1;
//			for(int i=0;i<=w;i++) dp[1][i] = (dp[1][i] < 0)? -1:1; 
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
				if(dp[i][j] < 0 ) continue;
				dp[i][j] = max(0, dp[i-1][j]) + max(0, dp[i][j-1]);
//				for(int[] a: dp) debug(a);
//				debug();
			}
			System.out.println(dp[h][w]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}
}