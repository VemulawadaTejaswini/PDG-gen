

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	// アルファベットの配列
	public static String[] alphabet_all = { "a", "b", "c", "d", "e", "f", "g",
			"h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
			"u", "v", "w", "x", "y", "z" };

	public static void main(String[] args) {

		// アルファベットbeanのリスト
		ArrayList<alphabet> alpha_beans = new ArrayList<alphabet>();
		// 各アルファベットのbeanを作る
		for (String val : alphabet_all) {
			//
			alphabet hoge = new alphabet(val);
			alpha_beans.add(hoge);
		}

		// ファイル入力
		Scanner sc = new Scanner(System.in);

		//

		while (sc.hasNext()) {
			String input_sentence = sc.nextLine();

			// 入力文字を1文字ずつに変換
			char ch[] = input_sentence.toCharArray();

			// 入力文字列がある分、まわす
			for (int i = 0; i < ch.length; i++) {

				// それぞれのアルファベットについて
				for (alphabet val : alpha_beans) {

					// 入力文字の一文字ずつとアルファベットの文字(大文字も小文字は区別しない)が一致したら
					if (val.getString().equals(
							String.valueOf(ch[i]).toLowerCase())) {
						// 一致したアルファベットの数字を増やす
						val.setNumber(1);

					}
				}
			}
		}

		// 出力
		for (alphabet val : alpha_beans) {
			//
			System.out.println(val.getString() + " : " + val.getNumber());
		}
	}
}

// 各アルファベットクラス
class alphabet {
	//
	private int number = 0;
	private String alphabet = "";

	// コンストラクタ
	alphabet(String a) {
		alphabet = a;
	}

	// セッター
	public void setNumber(int n) {
		number = n + number;
	}

	// ゲッター
	public int getNumber() {
		return number;
	}

	public String getString() {
		return alphabet;
	}
}