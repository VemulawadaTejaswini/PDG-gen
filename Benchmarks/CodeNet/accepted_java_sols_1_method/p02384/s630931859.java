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
		int[] dice = new int[6];
		int intUemen = 0;
		int intMaemen = 0;
		int intKekka = 0;
		// 6個入力された数字を受け取る
		for (int i = 0; i < 6; i++) {
			dice[i] = sc.nextInt();
		}
		int situ = sc.nextInt();
		for (int i = 0; i < situ; i++) {
			intUemen = sc.nextInt();
			intMaemen = sc.nextInt();

			if (intUemen == dice[0]) {
				if (intMaemen == dice[1]) {
					intKekka = dice[2];
				} else if (intMaemen == dice[2]) {
					intKekka = dice[4];
				} else if (intMaemen == dice[3]) {
					intKekka = dice[1];
				} else if (intMaemen == dice[4]) {
					intKekka = dice[3];
				}
			} else if (intUemen == dice[1]) {
				if (intMaemen == dice[0]) {
					intKekka = dice[3];
				} else if (intMaemen == dice[2]) {
					intKekka = dice[0];
				} else if (intMaemen == dice[3]) {
					intKekka = dice[5];
				} else if (intMaemen == dice[5]) {
					intKekka = dice[2];
				}
			} else if (intUemen == dice[2]) {
				if (intMaemen == dice[0]) {
					intKekka = dice[1];
				} else if (intMaemen == dice[1]) {
					intKekka = dice[5];
				} else if (intMaemen == dice[4]) {
					intKekka = dice[0];
				} else if (intMaemen == dice[5]) {
					intKekka = dice[4];
				}
			} else if (intUemen == dice[3]) {
				if (intMaemen == dice[0]) {
					intKekka = dice[4];
				} else if (intMaemen == dice[1]) {
					intKekka = dice[0];
				} else if (intMaemen == dice[4]) {
					intKekka = dice[5];
				} else if (intMaemen == dice[5]) {
					intKekka = dice[1];
				}
			} else if (intUemen == dice[4]) {
				if (intMaemen == dice[0]) {
					intKekka = dice[2];
				} else if (intMaemen == dice[2]) {
					intKekka = dice[5];
				} else if (intMaemen == dice[3]) {
					intKekka = dice[0];
				} else if (intMaemen == dice[5]) {
					intKekka = dice[3];
				}
			} else if (intUemen == dice[5]) {
				if (intMaemen == dice[1]) {
					intKekka = dice[3];
				} else if (intMaemen == dice[2]) {
					intKekka = dice[1];
				} else if (intMaemen == dice[3]) {
					intKekka = dice[4];
				} else if (intMaemen == dice[4]) {
					intKekka = dice[2];
				}
			}
			System.out.println(intKekka);
		}
	}
}