import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		sc.close();

		long ans = 0;

		for (int i = 1; i <= K; i++) {
			for (int j = 1; j <= K; j++) {
				for (int k = 1; k <= K; k++) {
					ans += threeGCD(i, j, k);
				}
			}
		}

		System.out.println(ans);
	}

	public static long GCD(long a, long b) {
		if (b == 0) {
			return a;
		}
		return GCD(b, a % b);
	}

	public static long threeGCD(long a, long b, long c) {
		long d = GCD(a, b);
		return GCD(c, d);
	}
}
