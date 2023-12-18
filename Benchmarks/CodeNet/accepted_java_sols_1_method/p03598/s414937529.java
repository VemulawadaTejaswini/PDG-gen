import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N + 1];
		int ans = 0;

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (x[i] <= Math.abs(K - x[i])) {
				ans += x[i] * 2;
			} else {
				ans += Math.abs(K - x[i]) * 2;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
