

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO NとKをうけとる。
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		// TODO NとNの関係性を判定
		if (n % 2 == 1) {
			// TODO Nが奇数のとき
			// TODO ①KがNの商＋１か
			if (k <= n / 2 + 1) {
				// TODO ①がYだったらYESと出力
				System.out.println("YES");
			} else {
				// TODO ①がNだったらNOと出力
				System.out.println("NO");
			}
		} else {
			// TODO Nが偶数のとき
			// TODO ②KがNの商か
			if (k <= n / 2) {
				// TODO ②がYだったらYESと出力
				System.out.println("YES");
			} else {
				// TODO ②がNだったらNOと出力
				System.out.println("NO");
			}
		}
		sc.close();
	}

}
