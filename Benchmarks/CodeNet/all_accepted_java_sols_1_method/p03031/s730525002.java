import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // スイッチ
		int M = sc.nextInt(); // 電球
		int[] k = new int[M]; // 電球iはk個のスイッチとつながる
		int[][] s = new int[M][N];
		for (int i = 0; i < M; i++) {
			k[i] = sc.nextInt();
			for (int j = 0; j < k[i]; j++) {
				s[i][sc.nextInt() - 1] = 1;
			}
		}
		int[] p = new int[M];
		for (int i = 0; i < M; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();

		// bit全探索
		int ans = 0;
		for (int i = 0; i < (Math.pow(2, N)); i++) {
			int[] sw = new int[N];
			boolean isOk = true;
			for (int j = 0; j < N; j++) { // スイッチの点灯
				if ((1 & i >> j) == 1) {
					sw[j] = 1;
				}
			}
			for (int m = 0; m < M; m++) { // 各電球
				int cnt = 0;
				for (int n = 0; n < N; n++) { // 各スイッチ
					if (s[m][n] == 1 && sw[n] == 1)
						cnt++;
				}
				if (cnt % 2 != p[m]) {
					isOk = false;
				}
			}
			if (isOk) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}
