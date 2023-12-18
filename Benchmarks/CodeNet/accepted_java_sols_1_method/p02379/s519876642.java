/**


２点 P1(x1, y1), P2(x2, y2) の距離を求めるプログラムを作成せよ。

 */

//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成

		Scanner sc = new Scanner(System.in);
		// 4つの数字を受け取る
		double dbX1 = sc.nextDouble();
		double dbY1 = sc.nextDouble();
		double dbX2 = sc.nextDouble();
		double dbY2 = sc.nextDouble();
		//計算する
		double dbKekka = Math.sqrt(Math.pow(dbX2 - dbX1,2)  + Math.pow(dbY2 - dbY1,2));

		//結果表示
		System.out.println(dbKekka);
	}
}