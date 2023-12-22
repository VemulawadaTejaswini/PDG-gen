import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] h = new long[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextLong();
		}
		sc.close();

		Arrays.sort(h);

		long min = h[K - 1] - h[0];

		for (int i = K; i < N; i++) {
			long val = h[i] - h[i - K + 1];
			min = Math.min(min, val);
		}

		System.out.println(min);
	}
}
