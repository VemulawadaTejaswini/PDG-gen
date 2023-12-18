/**

つのデータがどれだけ似ているかを、それらの距離で測る手法は、クラスタリングや分類など、様々なところで使われています。
ここでは、２つの n  次元ベクトル x={x 1 ,x 2 ,...,x n }  と y={y 1 ,y 2 ,...,y n }  の距離を計算してみましょう。

このようなデータの距離を測る指標のひとつとして、次のミンコフスキー距離が知られています。

D xy =(? i=1 n |x i −y i | p ) 1p

p=1  のとき

D xy =|x 1 −y 1 |+|x 2 −y 2 |+...+|x n −y n |

となり、これはマンハッタン距離とよばれます。

p=2  のとき

D xy =  √(|x 1 −y 1 |) 2 +(|x 2 −y 2 |) 2 +...+(|x n −y n |) 2

となり、これは一般的に使われるユークリッド距離になります。

p=∞  のとき


D xy =max n i=1 (|x i −y i |)


となり、これはチェビシェフ距離と呼ばれます。

２つの n  次元ベクトルが与えられるので、p  がそれぞれ 1、2、3、∞  のミンコフスキー距離を求めるプログラムを作成してください。


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
		// 6個入力された数字を受け取る
		for (int i = 0; i < 6; i++) {
			dice[i] = sc.nextInt();
		}
		// 命令の文字列を受け取る
		String mei = sc.next();
		// 受け取った文字列をcharの配列に入れていく
		char[] Roll = mei.toCharArray();
		for (int i = 0; i < mei.length(); i++) {
			int irekae = 0;
			if (Roll[i] == 'S') {
				irekae = dice[0];
				dice[0] = dice[4];
				dice[4] = dice[5];
				dice[5] = dice[1];
				dice[1] = irekae;

			} else if (Roll[i] == 'N') {
				irekae = dice[0];
				dice[0] = dice[1];
				dice[1] = dice[5];
				dice[5] = dice[4];
				dice[4] = irekae;

			} else if (Roll[i] == 'W') {
				irekae = dice[0];
				dice[0] = dice[2];
				dice[2] = dice[5];
				dice[5] = dice[3];
				dice[3] = irekae;

			} else if (Roll[i] == 'E') {
				irekae = dice[0];
				dice[0] = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[2];
				dice[2] = irekae;

			}

		}
		System.out.println(dice[0]);
	}
}