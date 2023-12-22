import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Long[] X = new Long[M];
		for (int i = 0; i < M; i++) {
			X[i] = sc.nextLong();
		}
		sc.close();

		// corner case
		if (N >= M) {
			System.out.println(0);
			return;
		}

		Arrays.sort(X);
		long sum = 0;
		Long[] d = new Long[M - 1];
		for (int i = 0; i < M; i++) {
			if (i + 1 < M) {
				d[i] = X[i + 1] - X[i];
				sum += d[i];
			}
		}
		Arrays.sort(d, Collections.reverseOrder());

		long ans = sum;
		for (int i = 0; i < N - 1; i++) {
			ans -= d[i];
		}
		System.out.println(ans);

	}
}
