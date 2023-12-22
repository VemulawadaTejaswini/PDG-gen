import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] H = new long[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextLong();
		}
		boolean[] isGood = new boolean[N];
		Arrays.fill(isGood, true);
		for (int i = 0; i < M; i++) {
			int from = sc.nextInt() - 1;
			int to = sc.nextInt() - 1;
			if (H[from] < H[to]) {
				isGood[from] = false;
			} else if (H[from] > H[to]) {
				isGood[to] = false;
			} else {
				isGood[from] = false;
				isGood[to] = false;
			}
		}
		sc.close();

		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (isGood[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
