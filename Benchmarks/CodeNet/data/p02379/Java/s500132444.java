
//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成

		Scanner sc = new Scanner(System.in);
		// 4つの数字を受け取る
		double dbX1 = sc.nextDouble();
		double dbX2 = sc.nextDouble();
		double dbY1 = sc.nextDouble();
		double dbY2 = sc.nextDouble();
		double dbKekka = ((dbX1 - dbX2) * (dbX1 - dbX2) + (dbY1 - dbY2)
				* (dbY1 - dbY2));
		System.out.println(dbKekka);
	}
}