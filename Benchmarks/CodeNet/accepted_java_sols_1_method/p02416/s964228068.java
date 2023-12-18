/**
 * 与えられた文字列の小文字と大文字を入れ替えるプログラムを作成してください。
 */

//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);

		while (true) {

			// 文字列を受け取る
			String moji = sc.nextLine();
			if (moji.equals("0")){
				break;
			} else {
				int intKekka = 0;
				// 受け取った文字数の配列の宣言
				char[] kowake = new char[moji.length()];
				// 受け取った文字の数処理を繰り返す
				for (int i = 0; i < moji.length(); i++) {

					kowake[i] = moji.charAt(i);
					intKekka += kowake[i] - 48;


				}
				System.out.println(intKekka);

			}

		}
	}
}