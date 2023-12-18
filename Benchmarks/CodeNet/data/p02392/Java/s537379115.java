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

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		/* aとbで大小関係を比較 */
		if (a < b) {
			/* bとcで大小関係を比較 */
			if (b < c) {
				System.out.println ("Yes");
			} else {
				System.out.println ("No");
			}
		} else {
			System.out.println ("No");
		}
	}
}

