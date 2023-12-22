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
		int a = 0;
		int b = 0;
		int c = 0;
		int tmpB = 0;
		int tmpC = 0;

		/* ３つの整数を読み込み、それらを値が小さい順に並べて出力するプログラムを作成する */
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		if (a > b) {
			tmpB = b;
			b = a;
			a = tmpB;
		}
		if (b > c) {
			tmpC = c;
			c = b;
			b = tmpC;
		}
		if (a > b) {
			tmpB = b;
			b = a;
			a = tmpB;
		}

		System.out.println(a + " " + b + " " + c );

	}
}

