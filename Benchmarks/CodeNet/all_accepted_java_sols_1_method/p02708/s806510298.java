import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		long[] small = new long[n + 10];
		long[] big = new long[n + 10];
		for (int i = 1; i <= n + 1; ++i) {
			small[i] = small[i - 1] + (i - 1);
			big[i] = big[i - 1] + n - (i - 1);
		}

		final long mod = 1000000007;
		long ans = 0;
		for (int i = k; i <= n + 1; ++i) {
			ans += big[i] - small[i] + 1;
			ans %= mod;
		}

		System.out.println(ans);
	}

}
