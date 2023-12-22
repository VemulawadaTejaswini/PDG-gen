/** goto 文は、C/C++言語などで使うことのできる文で、実行されると無条件に指定されたラベルに処理が飛びます。
 * 例えば goto CHECK_NUM; という文が実行されると、プログラムの中で CHECK_NUM: と書かれた行に処理が移ります。
 * この機能を使って、繰り返し処理なども実現することができます。
 * 一方、goto 文は自由度が高すぎ、プログラムの可読性に影響するため、可能な限り使わないことが推奨されています。
 * 次のC++言語のプログラムと同じ動作をするプログラムを作成してください。ただし、goto 文は使わないで実装してみましょう。
 */

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;

class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		// 処理を繰り返す

		int intN = sc.nextInt();
		int i = 0;
		int x = 0;
		for (i = 1; i <= intN; i++) {
			if (i % 3 == 0) {
				System.out.print(" " + i);
			} else if (i % 10 == 3) {
				System.out.print(" " + i);
			} else if (i / 1000 == 3) {
				System.out.print(" " + i);
			} else if ((x = i % 1000) / 100 == 3) {
				System.out.print(" " + i);
			} else if ((x = x % 100) / 10 == 3) {
				System.out.print(" " + i);
			}
		}
		System.out.println();
	}
}