import java.util.Scanner;

public class Main {

	static long solve(int n, int[] a) {
		long sum = 0;
		long ans = 0;
		long mod = (long) Math.pow(10, 9) + 7;

		for (int i = 0; i < n; i++) {
			sum += a[i];
			sum %= mod;
		}

		for (int i = 0; i < n; i++) {
			sum -= a[i];
			if (sum < 0)
				sum += mod;
			ans += a[i] * sum;
			ans %= mod;
		}

		return ans;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		long result = solve(n, a);
		System.out.println(result);

		stdIn.close();
	}
}
