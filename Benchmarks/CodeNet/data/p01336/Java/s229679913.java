import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static int[] w = new int[300], v = new int[300];
	static boolean read() {
		if (!sc.hasNextInt()) return false;
		N = sc.nextInt();
		M = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String str;
			do {
				str = sc.next();
			} while (!Character.isDigit(str.charAt(0)));
			int C = Integer.parseInt(str),
				V = sc.nextInt(),
				D = sc.nextInt(),
				L = sc.nextInt();
			w[i] = C; v[i] = max(V, max(D, L));
		}
		return true;
	}
	
	static int[][] dp = new int[301][301];
	static void solve() {
		for (int i = 0; i < N; i++) fill(dp[i], 0);
		
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= M; j++) {
				if (j >= w[i - 1]) {
					dp[i][j] = max(dp[i - 1][j], dp[i][j - w[i - 1]] + v[i - 1]); 
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		
		System.out.println(dp[N][M]);
	}
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
}