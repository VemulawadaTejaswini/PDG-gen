import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if (N == 0 && M == 0) break;
			int[] T = new int[N + M + 1];
			for (int i = 0; i < N; ++i) {
				T[i] = sc.nextInt();
			}
			for (int i = 0; i < M; ++i) {
				T[N + i] = sc.nextInt();
			}
			Arrays.sort(T);
			int ans = 0;
			for (int i = 0; i < T.length - 1; ++i) {
				ans = Math.max(ans, T[i + 1] - T[i]);
			}
			System.out.println(ans);
		}
	}

}