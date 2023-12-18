import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int[] P = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt() - 1;
		}
		long[] C = new long[N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextLong();
		}
		sc.close();

		long max = Long.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			long score = Long.MIN_VALUE;
			long s = 0;
			int next = P[i];
			for (int k = 0; k < K; k++) {
				s = s + C[next];
				score = Math.max(score, s);
				next = P[next];
			}
			max = Math.max(max, score);
		}

		System.out.println(max);
	}
}
