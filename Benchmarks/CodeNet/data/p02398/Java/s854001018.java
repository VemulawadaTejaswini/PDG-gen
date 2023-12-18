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
		Scanner scanner= new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int count = 0;

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		for (int i = a; i <= b; i++) {
			/* 約数の場合 */
			if (c % i == 0) {
				count++;
			}
		}
		System.out.println(count);

	}
}

