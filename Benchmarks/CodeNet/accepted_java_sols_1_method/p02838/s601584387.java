import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final long MOD = (long)1000000007;
		int n = in.nextInt();
		long[] ints = new long[n];
		for(int i = 0; i < n; i++) ints[i] = in.nextLong();
		int[][] solve = new int[n][61];
		for(int i = n - 1; i > 0; i--) {
			for(int j = 0; j < 61; j++) {
				if(((ints[i] >> j) & (1)) == 1) {
					solve[i][j] += 1;
					solve[i - 1][j] = solve[i][j];
				}else {
					solve[i - 1][j] = solve[i][j];
				}
			}
		}
		long ans = 0L;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < 61; j++) {
				if(((ints[i] >> j) & (1)) == 1) { 
					long save = ((long)(((1L << j) % MOD) * (((n - 1) - i - solve[i + 1][j]) % MOD))) % MOD;
					ans = ((ans % MOD) + (save % MOD)) % MOD;
				}else {
					long save = ((long)(((1L << j) % MOD) * ((solve[i + 1][j]) % MOD))) % MOD;
					ans = ((ans % MOD) + (save % MOD)) % MOD;
				}
			}
		}
		System.out.println(ans);
	}
}