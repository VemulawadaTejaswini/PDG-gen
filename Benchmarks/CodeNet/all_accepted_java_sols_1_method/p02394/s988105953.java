import java.util.Scanner;

/**
 * コンソールテスト用Main クラス
 *
 */
public class Main {

	/* コンストラクタ */
	Main() {
	//何もしない
	}

	/**
	 * 提出
	 *
	 */

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();

		/* 水平方向を調べる */
		/* 円が長方形の内側にない場合 */
		if (x - r < 0 || x + r > W) {
			System.out.println("No");
		} else {

			/* 垂直方向を調べる */
			if (y - r <  0 || y + r > H) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}

		}
	}
}

