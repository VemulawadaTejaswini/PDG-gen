import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力
		int N = sc.nextInt();
		int A[] = new int[N];
		int x[][] = new int[N][N];
		int y[][] = new int[N][N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			for (int j = 0; j < A[i]; j++) {
				x[i][j] = sc.nextInt();
				y[i][j] = sc.nextInt();
			}
		}
		sc.close();

		// bit全探索
		// 誰が正直者で誰が不親切なのかを完全に決め打ちすると、
		// 全員の証言が整合しているかどうかを簡単に確認できる
		int ans = 0;
		for (int bit = 1; bit < (1 << N); bit++) {
			boolean flg = true;
			for (int i = 0; i < N; i++) {
				// 不親切な人の証言は見ない
				if ((bit & (1 << i)) == 0) {
					continue;
				}
				// 正直な人の証言
				for (int j = 0; j < A[i]; j++) {
					// 値と証言が一致しなかった場合にflgをfalseにする
					if ((((bit >> x[i][j] - 1) & 1) ^ y[i][j]) == 1) {
						flg = false;
					}
				}
			}

			// 全部の証言がOKだった場合
			if (flg) {
				int cnt = 0;
				for (int j = 0; j < N; j++) {
					if ((bit >> j) % 2 == 1) {
						cnt++;
						ans = Math.max(ans, cnt);
					}
				}
			}
		}
		System.out.println(ans);
	}
}
