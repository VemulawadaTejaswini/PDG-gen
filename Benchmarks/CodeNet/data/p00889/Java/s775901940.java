import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int S = sc.nextInt();
			int W = sc.nextInt();
			int Q = sc.nextInt();
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
			long ans = 0;
			HashMap<Long, Integer> map = new HashMap<Long, Integer>();
			long sum = 0;
			long base = 1;
			for (int i = 0; i < N; ++i) {
				sum += A[N - 1 - i] * base;
				sum %= Q;
				base *= 10;
				base %= Q;
				int c = map.containsKey(sum) ? map.get(sum) : 0;
				if (A[N - 1 - i] != 0) {
					ans += c;
					if (sum == 0) ans++;
				}
				if (c != 0) {
					map.put(sum, c + 1);
				} else {
					map.put(sum, 1);
				}
			}
			System.out.println(ans);
		}
	}

}