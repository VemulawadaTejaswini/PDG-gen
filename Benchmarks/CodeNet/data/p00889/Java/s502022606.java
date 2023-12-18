import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, Q;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			int S = sc.nextInt();
			int W = sc.nextInt();
			Q = sc.nextInt();
			int[] A = new int[N];
			int g = S;
			for (int i = 0; i < N; ++i) {
				A[i] = (g / 7) % 10;
				if (g % 2 == 0) {
					g = g / 2;
				} else {
					g = (g / 2) ^ W;
				}
			}
			System.out.println(solve(A));
		}
	}

	static long solve(int[] A) {
		long ans = 0;
		if (Q == 2 || Q == 5) {
			int nonzero = 0;
			for (int i = 0; i < N; ++i) {
				if (A[i] != 0) ++nonzero;
				if (A[i] % Q == 0) {
					ans += nonzero;
				}
			}
			return ans;
		}
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		long sum = 0;
		long base = 1;
		for (int i = 0; i < N; ++i) {
			sum += A[N - 1 - i] * base;
			sum %= Q;
			base *= 10;
			base %= Q;
			Integer ci = map.get(sum);
			int c = ci == null ? 0 : ci.intValue();
			if (A[N - 1 - i] != 0) {
				ans += c;
				if (sum == 0) ans++;
			}
			map.put(sum, c + 1);
		}
		return ans;
	}

}