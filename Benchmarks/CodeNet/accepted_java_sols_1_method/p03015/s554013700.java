import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		int n = s.length;
		int mod = 1000000007;
		long[] dp0 = new long[n + 1];
		long[] dp1 = new long[n + 1];
		dp0[0] = 1;
		for (int i = 0; i < n; i++) {
			int d = s[i] - '0';
			dp0[i + 1] = dp0[i] * (d + 1);
			dp0[i + 1] %= mod;
			dp1[i + 1] = dp1[i] * 3 + dp0[i] * d;
			dp1[i + 1] %= mod;
		}
		System.out.println((dp0[n] + dp1[n]) % mod);
	}
}
