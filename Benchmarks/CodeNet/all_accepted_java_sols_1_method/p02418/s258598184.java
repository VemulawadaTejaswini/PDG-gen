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
		Scanner sc = new Scanner(System.in);
		//入力される二つの文字列を受け取る
		String strs = sc.nextLine();
		String strItti = sc.nextLine();
		//比較対象になる文字列をつくる
		String strMoji = strs + strs;
		// System.out.println(strMoji);
		//strMoji のなかにstrIttiがあればYes,なければNoを表示
		if (strMoji.contains(strItti)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}