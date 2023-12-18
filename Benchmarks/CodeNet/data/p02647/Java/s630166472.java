
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 電球の個数
		int k = sc.nextInt(); // 操作回数
		int x[] = new int[n + 1]; // 光の強さ
		for (int i = 1; i <= n; i++) {
			x[i] = sc.nextInt();
		}

		// 操作をk回やる
		for (int loop = 0; loop < k; loop++) {

			// 当たっている光の数を配列にする
			int light[] = new int[n + 1];

			// 各々の電球について
			for (int i = 1; i <= n; i++) {

				// 光の強さが0だったら
				if (x[i] == 0) {
					light[i]++;
					continue;
				}

				// 光を当てていく
				int left = Math.max(i - x[i], 1);
				int right = Math.min(i + x[i], n);
				for (int j = left; j <= right; j++) {
					light[j]++;
				}
				// System.out.println("電球" + i + " →" + left + "～" + right);
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