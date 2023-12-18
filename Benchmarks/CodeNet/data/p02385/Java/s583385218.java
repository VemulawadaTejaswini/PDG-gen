/**

サイコロの各面には図のとおりに 1 から 6 のラベルが割りあてられています。

入力としてサイコロの各面のラベルに対応する数字と、転がす命令の列が与えられるので、サイコロの上面の数字を出力してください。シミュレーションの初期状態は、図のとおりのラベルの位置でサイコロが置かれているものとします。

 */

//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成

		Scanner sc = new Scanner(System.in);
		// 6桁の数字を受け取る配列diceを作る
		int[] dice1 = new int[6];
		int[] dice2 = new int[6];
		char[] Roll = { 'E', 'E', 'E', 'N', 'W', 'W', 'W', 'S' };
		String Kekka = "No";
		int irekae = 0;
		// 6個入力された数字を受け取る
		for (int i = 0; i < 6; i++) {
			dice1[i] = sc.nextInt();

		}
		for (int i = 0; i < 6; i++) {
			dice2[i] = sc.nextInt();
		}
		sc.close();

		System.out.println(dice1[0] + "" + dice1[1] + "" + dice1[2] + ""
				+ dice1[3] + "" + dice1[4] + "" + dice1[5] + "" + dice2[0] + ""
				+ dice2[1] + "" + dice2[2] + "" + dice2[3] + "" + dice2[4] + ""
				+ dice2[5]);

		if(true){
			System.out.println(Kekka);
			for (int i = 0; i < 8; i++) {
			if (Roll[i] == 'S') {
				irekae = dice2[0];
				dice2[0] = dice2[4];
				dice2[4] = dice2[5];
				dice2[5] = dice2[1];
				dice2[1] = irekae;
				// 文字列がNだった場合
			} else if (Roll[i] == 'N') {
				irekae = dice2[0];
				dice2[0] = dice2[1];
				dice2[1] = dice2[5];
				dice2[5] = dice2[4];
				dice2[4] = irekae;
				// 文字列がWだった場合
			} else if (Roll[i] == 'W') {
				irekae = dice2[0];
				dice2[0] = dice2[2];
				dice2[2] = dice2[5];
				dice2[5] = dice2[3];
				dice2[3] = irekae;
				// 文字列がEだった場合
			} else if (Roll[i] == 'E') {
				irekae = dice2[0];
				dice2[0] = dice2[3];
				dice2[3] = dice2[5];
				dice2[5] = dice2[2];
				dice2[2] = irekae;

				for (int j = 0; j < 6; i++) {
					if (dice1[j] == dice2[j]) {
						Kekka = "Yes";
						System.out.println(Kekka);
					}

				}
			}
		}

		}
	}
}