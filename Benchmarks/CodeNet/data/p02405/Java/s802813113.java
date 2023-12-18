/** 以下のような、たてH cm よこ W cm のチェック柄の長方形を描くプログラムを作成して下さい。
#.#.#.#.#.
.#.#.#.#.#
#.#.#.#.#.
.#.#.#.#.#
#.#.#.#.#.
.#.#.#.#.#


上図は、たて 6 cm よこ 10 cm の長方形を表しています。

長方形の左上が "#" となるように描いて下さい。


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
			// 受け取った縦の数字の回数改行処理を繰り返す
			for (int i = 0; i < intH; i++) {
				// 受けとった横の数字の個数分 処理を繰り返す
				for (int j = 0; j < intW; j++) {
					//縦奇数の場合横の奇数列に＃を表示
					//横偶数の場合横の偶数列に＃を表示する
					if ((i+j)%2 == 0) {
						System.out.print("#");
					//上の条件に当てはまらない場合.を表示する
					} else {
						System.out.print(".");
					}
				}
				// 表示完了後改行する。
				System.out.println();
			}
			//改行する。
			System.out.println();
		}
	}
}