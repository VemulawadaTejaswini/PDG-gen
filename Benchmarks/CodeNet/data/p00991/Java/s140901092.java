
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	long MOD = (long)1e8+7;
	double EPS = 1e-10;
	

	void run() {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(), h = sc.nextInt();
		int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
		int dx = abs(x1-x2), dy = abs(y1-y2);
		dx = min(dx + 1, w - dx + 1); dy = min(dy + 1, h - dy + 1);
//		debug(dx, dy);
		long[][] dp = new long[dx+1][dy+1]; dp[1][0] = 1;
		for(int x=1;x<=dx;x++) for(int y=1;y<=dy;y++) {
			dp[x][y] = (dp[x-1][y] + dp[x][y-1]) % MOD;
		}
//		for(long[] a: dp)debug(a);
		if( dx == w - dx + 1 ) dp[dx][dy] = dp[dx][dy] * 2 % MOD;
		if( dy == h - dy + 1 ) dp[dx][dy] = dp[dx][dy] * 2 % MOD;
		System.out.println(dp[dx][dy]);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}