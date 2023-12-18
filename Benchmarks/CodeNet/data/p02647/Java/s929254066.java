
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next()); // 電球の個数
		int k = Integer.parseInt(sc.next()); // 操作回数
		int x[] = new int[n + 1]; // 光の強さ
		for (int i = 1; i <= n; i++) {
			x[i] = Integer.parseInt(sc.next());
		}

		// 当たっている光の数を配列にする
		int light[] = new int[n + 1];

		// ★解説を読んでちょっと改造　ここから
		// 今回の問題の n は最大で20万個なので、42回以上loopしても結果は変わらないらしい
		k = Math.min(k, 41);
		// ★解説を読んでちょっと改造　ここまで
		
		// 操作をk回やる
		for (int loop = 0; loop < k; loop++) {

			// 当たっている光の数を配列にする
			for (int i = 1; i <= n; i++) {
				light[i] = 0;
			}

			// 各々の電球について
			for (int i = 1; i <= n; i++) {

				// 光を当てていく
				int left = Math.max(i - x[i], 1);
				int right = Math.min(i + x[i], n);
				for (int j = left; j <= right; j++) {
					light[j]++;
				}
				// System.out.println("電球" + i + "の照らす範囲→" + left + "～" + right);
			}

			// 光の強さを更新
			System.arraycopy(light, 0, x, 0, x.length);

		}

		// 結果
		for (int i = 1; i <= n; i++) {
			System.out.print(x[i]);
			if (i < n) {
				System.out.print(" ");
			}
		}
	}

}