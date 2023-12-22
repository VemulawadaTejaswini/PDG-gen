import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();

		int Ai[] = new int[M];

		int i;
		for (i = 0; i < M; i++) {
			Ai[i] = sc.nextInt();

		}

		if (X == 1 || N - X == 1) {
			// 最短だったらおしまい
			System.out.println("0");

		} else {

			int cost_l = 0;
			// 左側チェック
			for (i = 0; i < X; i++) {

				for (int n = 0; n < M; n++) {
					// 料金所は小さい順ではいっているけれど・・・全部比べちゃう。
					if (i == Ai[n]) {
						cost_l++;
						break;
					}
				}
			}

			int cost_r = 0;
			// 右側チェック
			for (i = X + 1; i < N; i++) {

				for (int n = 0; n < M; n++) {
					// 料金所は小さい順ではいっているけれど・・・全部比べちゃう。
					if (i == Ai[n]) {
						cost_r++;
						break;
					}
				}
			}

			if (cost_r < cost_l) {

				System.out.println(cost_r);
			} else {
				System.out.println(cost_l);
			}
		}

	}
}
