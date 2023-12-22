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
		//文字列を受け取る
		String moji = sc.nextLine();
		//受け取った文字数の配列の宣言
		char [] chmoji = new char [moji.length()];
		//受け取った文字の数処理を繰り返す
		for (int i =0; i<moji.length(); i++){

			chmoji[i]   = moji.charAt(i);
			//受け取った文字が大文字ならtrue 小文字ならfalse
			//booleanの変数kekkaに文字を入れる
			  boolean kekka = Character.isUpperCase(chmoji[i]);
			  //kekkaがtrue なら小文字に、falseなら大文字に変換
			 if (kekka == true ){
				 chmoji[i] = Character.toLowerCase(chmoji[i]);
			 }else {
				 chmoji[i] = Character.toUpperCase(chmoji[i]);
			 }
			 //結果を表示して並べる
			 System.out.print(chmoji[i]);

		}
		//改行
		System.out.println();
	}
}