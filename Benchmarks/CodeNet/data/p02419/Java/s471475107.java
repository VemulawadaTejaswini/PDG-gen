/**
 * 図のようなリング状の文字列 s  の任意の位置から、時計回りに連続した文字をいくつか選んで、
 * 文字列 p  が作れるかを判定するプログラムを作成してください。
 */

//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		//入力される二つの文字列を受け取る
		String strW = sc.nextLine();
		strW.toUpperCase();
		int intCounter = 0;
		while(true){
			String strT = sc.nextLine();
			strT.toUpperCase();
			if(strT.contains("END_OF_TEXT")){
				break;
			}else if (strT.contains(strW)){
				intCounter ++;
			}

		}
		System.out.println(intCounter);
	}
}