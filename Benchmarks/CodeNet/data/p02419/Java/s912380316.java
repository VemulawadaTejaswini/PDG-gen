/**
 *１つの単語 W と文章 T が与えられます。T の中にある W の数を出力するプログラムを作成して下さい。 

文章 T に含まれるスペースまたは改行で区切られた文字列を単語 Ti とします。すべての Ti において単語 W と同じになるものを数えて下さい。 

なお、大文字と小文字は区別しません。 

 */

//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		// 単語を1つ受け取る
		String strW = sc.next();
		//受け取る文字、結果の数の変数宣言
		String strT;
		int intCounter = 0;
		
		//break があるまで処理を繰り返す
		while (true) {
			//入力を受け取る
			 strT = sc.next();
			 //受け取った文字がEND_OF_TEXTと一致した場合breakする
			if (strT.contains("END_OF_TEXT")) {
				break;
			//受け取った文字がstrWと一致するたびintCounterに＋１する
			//大文字小文字は区別しない。
			} else if (strW.equalsIgnoreCase(strT)) {
				intCounter++;
			}

		}
		//結果表示
		System.out.println(intCounter);
	}
}