/**


三角形の２辺 a, b とその間の角 C から、
その三角形の面積 S、周の長さ L, a を底辺としたときの高さ h を求めるプログラムを作成して下さい。

 */

//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成

		Scanner sc = new Scanner(System.in);
		// 3つの数字を受け取る
		double dbA = sc.nextDouble();
		double dbB = sc.nextDouble();
		double dbC = sc.nextDouble();

		//3つの数字の面積、周、高さを求める計算式
		double dbS = dbA * dbB * Math.sin(Math.toRadians(dbC)) / 2;
		double dbL = dbA + dbB + Math.sqrt(dbA*dbA + dbB * dbB - 2*dbA * dbB * Math.cos(Math.toRadians(dbC)));
		double dbH = dbB * Math.sin(Math.toRadians(dbC));
		//表示
		System.out.println(dbS);
		System.out.println(dbL);
		System.out.println(dbH);

	}
}