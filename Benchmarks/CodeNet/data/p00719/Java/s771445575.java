
import java.util.*;
import java.lang.*;
import java.math.*;

/*
 n m p a b
 t1 t2 ... tn
 x1 y1 z1
 x2 y2 z2
 ...
 xp yp zp 

 nÍCnÔÌÅ éD 1Èã8ÈºÆ¼èµÄæ¢D mÍCssÌÅ éD 2Èã30ÈºÆ¼èµÄæ¢D
 pÍCssÔ¹HÌ{Å éD ¹HÌ{ª0Ì±Æà éD
 */
public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if ((n | m | p | a | b) == 0) {
				break;
			}
			a -= 1;
			b -= 1;

			int[][] cost = new int[m][m];
			for (int i = 0; i < m; i++) {
				Arrays.fill(cost[i], Integer.MAX_VALUE);
			}
			int[] ticket = new int[n];
			for (int i = 0; i < n; i++) {
				ticket[i] = sc.nextInt();
			}
			for (int i = 0; i < p; i++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				int z = sc.nextInt();
				cost[x][y] = cost[y][x] = z;
			}

			int left = (1 << n) - 1;
			double[][] dp = new double[1<<n][m];
			for (int i = 0; i < 1<<n; i++) {
				Arrays.fill(dp[i], Double.MAX_VALUE);
			}
			int now = a;
			dp[left][now] = 0;
			for (; left >= 0; left--) {
				for (int i = 0; i < n; i++) {
					int sh = 1 << i;
					if ((left & sh) != 0) {
						continue;
					}
					int previous = left | sh;
					for (int j = 0; j < m; j++) {
						for (int k = 0; k < m; k++) {
							if (cost[j][k] == Integer.MAX_VALUE) {
								continue;
							}
							dp[left][j] = Math.min(dp[left][j], dp[previous][k]
									+ (double)(cost[j][k]) / (double)ticket[i]);
						}
					}
				}
			}
			double res = Double.MAX_VALUE;
			for(int i = 0; i< 1<<n;i++){
//				System.out.println(dp[i][b]);
				res = Math.min(dp[i][b], res);
			}
			if(res > 1e6){
				System.out.println("Impossible");
			}else{
				System.out.println(res);
			}
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}