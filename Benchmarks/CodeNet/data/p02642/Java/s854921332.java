import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(A);

		boolean[] ng = new boolean[N];
		Arrays.fill(ng, false);
		int ans = N;
		// 小さい順に見ていく
		for (int i = 0; i < N - 1; i++) {
			if (ng[i]) {
				continue;
			}

			// 同じ値があったらOUT
			if (A[i] == A[i + 1]) {
				ans--;
			}

			// 割り切れるものを消していく
			for (int j = i + 1; j < N; j++) {
				if (ng[j]) {
					continue;
				}

				if (A[j] % A[i] == 0) {
					ans--;
					ng[j] = true;
				}
			}
		}

		System.out.println(ans);
	}
}
