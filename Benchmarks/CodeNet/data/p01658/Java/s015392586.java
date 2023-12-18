import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int M = sc.nextInt();
		int N = sc.nextInt();
		int ans = 0;
		int a[][] = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < M; i++) {
			int max = 0;
			for (int j = 0; j < N; j++) {
				int line[] = new int[N];
				for (int k = 0; k < N; k++) {
					line[k] = a[i][k];
				}
				int cnt = 0;
				int l = -1;
				int r = N;
				while (++l < j) {
					if (line[l] == 1) {
						cnt++;
					}
					if (l + 1 < N) {
						line[l + 1] = 1 ^ line[l + 1];
					}
				}
				while (--r > j) {
					if (line[r] == 1) {
						cnt++;
					}
					if (r - 1 >= 0) {
						line[r - 1] = 1 ^ line[r - 1];
					}
				}
				if (line[j] == 1) {
					cnt++;
				}
				max = Math.max(max, cnt);
			}

			for (int j = 0; j < N; j++) {
				if (i + 1 < M) {
					a[i + 1][j] = 1 ^ a[i + 1][j];
				}
			}
			ans += max;
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}