/**


太郎と花子がカードゲームをする。二人はそれぞれn枚のカードを持っており、nターンの勝負を行う。
各ターンではそれぞれ１枚ずつカードを出す。カードにはアルファベットからなる動物の名前が書かれており
辞書順で大きいものがそのターンの勝者となる。
勝者には３ポイント、引き分けの場合にはそれぞれ１ポイントが加算される。
太郎と花子の手持ちのカードの情報を読み込み、ゲーム終了後のそれぞれの得点を出力するプログラムを作成せよ。

 */

//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成

		Scanner sc = new Scanner(System.in);
		//ターン数を受け取る
		int intTrun = sc.nextInt();
		//受け取る文字、保持するポイントの変数宣言
		String Hanaco;
		String Taro;
		int intHanacop = 0;
		int intTarop = 0;
		//ターンの数だけ処理を繰り返す
		for (int i = 0; i < intTrun; i++) {
			//数値を受け取る
			Taro = sc.next();
			Hanaco = sc.next();

			// System.out.println(Taro + Hanaco + intHanacop);
			//文字列TaroがHanacoより辞書順で早い場合
			if (Taro.compareToIgnoreCase(Hanaco) > 0) {
				intTarop += 3;
			//文字列TaroがHanacoより辞書順で遅い場合
			}else if (Taro.compareToIgnoreCase(Hanaco) < 0 ){
				intHanacop += 3;
			//文字列TaroとHanacoが同じ文字列の場合
			}else if (Taro.compareToIgnoreCase(Hanaco) == 0){
				intTarop ++;
				intHanacop ++;
			}

		}
		//結果表示
		System.out.println( intTarop + " " + intHanacop);
	}
}