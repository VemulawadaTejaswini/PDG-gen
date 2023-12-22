/** ３つの整数a b cを読み込みaからbまでの整数の中に、
 * cの約数がいくつあるかを求めるプログラムを作成してください。
 */

/**sucannerクラス使うためにインポート
 */
import java.util.Scanner;

class Main {
	/*
	 * プログラムのエントリポイント
	 */
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		// 数字を３つ受け取る
		int inta = sc.nextInt();
		int intb = sc.nextInt();
		int intc = sc.nextInt();
		// 約数の数を決める変数
		int yakusuu = 0;

		//
		for (int i = inta; i <= intb; i++) {

			if (intc % i == 0) {
				yakusuu++;
			}
		}
		System.out.println(yakusuu);
	}
}