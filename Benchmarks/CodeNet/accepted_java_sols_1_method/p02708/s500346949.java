import java.util.Scanner;

public class Main {
	private static final int MOD = 1000000007;

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var k = sc.nextInt();
		sc.close();

		var l = new int[n + 1];
		for (var i = 0; i < n + 1; i++) {
			l[i] = i == 0 ? 1 : (l[i - 1] + (i + 1)) % MOD;
		}

		var r = new int[n + 1];
		for (var i = 0; i < n + 1; i++) {
			r[i] = i == 0 ? n + 1 : (r[i - 1] + (n + 1 - i)) % MOD;
		}

		var sum = 0L;
		for (var i = k; i <= n + 1; i++) {
			sum = (sum + r[i - 1] - l[i - 1] + 1 + MOD) % MOD;
		}

		System.out.println(sum);
	}
}