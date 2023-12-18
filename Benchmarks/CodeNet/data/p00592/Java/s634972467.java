import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			int P = sc.nextInt();
			int Q = sc.nextInt();
			if (N == 0) break;
			int start = toMin(P);
			int end = toMin(Q);
			int[] cm = new int[end - start + 1];
			for (int i = 0; i < N; ++i) {
				int K = sc.nextInt();
				for (int j = 0; j < K; ++j) {
					int cms = toMin(sc.nextInt());
					int cme = toMin(sc.nextInt());
					for (int l = Math.max(cms, start); l < Math.min(cme, end); ++l) {
						++cm[l - start];
					}
				}
			}
			cm[end - start] = N;
			int ans = 0;
			int prev = -1;
			for (int i = start; i <= end; ++i) {
				if (cm[i - start] == N) {
					if (prev != -1) {
						ans = Math.max(ans, i - prev);
						prev = -1;
					}
				} else {
					if (prev == -1) prev = i;
				}
			}
			System.out.println(ans);
		}
	}

	static int toMin(int hourmin) {
		return hourmin / 100 * 60 + hourmin % 100;
	}

}