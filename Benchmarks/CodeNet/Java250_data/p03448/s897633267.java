import java.util.Scanner;

/**
 * 【問題概要】 500 円玉を AA 枚、100 円玉を BB 枚、50 円玉を CC 枚持っています。これらの硬貨の中から何枚かを選び、合計金額をちょうど
 * XX 円にする方法は何通りあるでしょうか？
 *
 * @author tsuch
 *
 */
public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Main instance = new Main();
		instance.solve();
	}

	private void solve() {
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();

			int count = 0;

			for (int i = 0; i < x / 500 + 1 && i <= a; i++) {
				for (int j = 0; j < x / 100 + 1 && j <= b; j++) {
					for (int k = 0; k < x / 50 + 1 && k <= c; k++) {
						if (x == 500 * i + 100 * j + 50 * k) {
							count++;
						}
					}
				}
			}
			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}