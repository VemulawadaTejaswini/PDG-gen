/**
 * 与えられた英文に含まれる、
 * 各アルファベットの数を数えるプログラムを作成して下さい。 なお、小文字と大文字は区別しません。
 */

//スキャナつかうため

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		// アルファベットの数配列を作る
		int[] cou = new int[26];

		// 処理を繰り返す
		while (sc.hasNext()) {
			// 受け取った文字列を受け取り、小文字にする
			String stralf = sc.nextLine();
			stralf = stralf.toLowerCase();
			// 文字列をcharに変換して配列に入れていく
			char[] chalf = stralf.toCharArray();
			// 受け取った文字列の長さだけ繰り返す
			for (int i = 0; i < chalf.length; i++) {
				// chalfにアルファベットはいっていた場合、couの配列の数字に＋１していく
				if (chalf[i] >= 'a' && chalf[i] <= 'z')
					cou[chalf[i] - 'a']++;
			}
		}
		// アルファベット＋１でつ次の文字表示
		// アルファベトに対応している数値表示
		for (int k = 0; k < 26; k++) {
			System.out.println((char) ('a' + k) + " : " + cou[k]);
		}

	}
}