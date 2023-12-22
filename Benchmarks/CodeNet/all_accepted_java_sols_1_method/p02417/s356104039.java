// 自端末のシェル上で動作確認をする際には下記を用いること
// ただの実行では入力を終了できない

// ヒアドキュメント： 区切文字列が入力されるまで，標準入力する．
// $ コマンド << 区切文字列
// 実行例)java Main << EOF
// 入力終了したいときにEOFを入力　など

import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		// アルファベットごとのカウント変数
		int count[] = new int[26];
		int i = 0;
		int s = 0;
		String str_scan = null;
		//char c = '0';

		// 複数行にまたがる文字列連結（終了条件は？）
		while(scan.hasNext()){
			str_scan = scan.nextLine();
			char[] c = str_scan.toCharArray();
			for(i=0; i<str_scan.length(); i++){
				if('a' <= c[i] && c[i] <= 'z'){
					// 文字の差に応じたカウンタをプラス
					s = c[i] - 'a';
					count[s] += 1;
				} else if('A' <= c[i] && c[i] <= 'Z'){
					// 文字の差に応じたカウンタをプラス
					s = c[i] - 'A';
					count[s] += 1;
				} else{
					// 何もしない
				}
			}
		}
		// 大文字小文字それ以外判定

		// 出力
		for(i=0; i<26; i++){
			System.out.println((char)('a' + i ) + " : " + count[i]);
		}
	}
}
