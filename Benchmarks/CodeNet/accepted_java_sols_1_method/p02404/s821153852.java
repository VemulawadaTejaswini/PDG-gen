/** 以下のような、たてH cm よこ W cm の枠を描くプログラムを作成して下さい。
##########
#........#
#........#
#........#
#........#
##########


上図は、たて 6 cm よこ 10 cm の枠を表しています。

 */

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;

class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		// 処理を繰り返す
		while (true) {
			// ２つの数字を受け取る
			int intH = sc.nextInt();
			int intW = sc.nextInt();
			// 受け取った数字が二つとも０の場合処理を終了する
			if (intH == 0 && intW == 0) {
				break;
			}
			// 受け取った縦の数字の?２回数改行する
			for (int i = 0; i < intH; i++) {
				// 受けとった横の数字の?２個数分・を表示する
				for (int j = 0; j < intW; j++) {
					if (i == 0 || j == 0 || i == intH - 1 || j == intW - 1) {
						System.out.print("#");
					} else {
						System.out.print(".");
					}
				}
				// 表示完了後改行する。
				System.out.println();
			}
			System.out.println();
		}
	}
}