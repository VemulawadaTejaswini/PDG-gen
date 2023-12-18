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

		// 整数を１受け取る
		int intN = sc.nextInt();
		// 受け取った数字の数の配列X,Yをつくる。
		int[] X = new int[intN];
		int[] Y = new int[intN];
		// intNの数だけ数字を配列Xに入れる
		for (int i = 0; i < intN; i++) {
			X[i] = sc.nextInt();
		}
		// intYの数だけ数字を配列Xに入れる
		for (int j = 0; j < intN; j++) {
			Y[j] = sc.nextInt();
		}
		// 計算結果を入れる変数を作成
		double dbP1 = 0;
		double dbP2 = 0;
		double dbP3 = 0;
		double dbPoo = 0;
		//intNの回数処理を繰り返す
		for (int i = 0; i < intN; i++) {
			//計算式
			dbP1 += Math.abs(X[i] - Y[i]);
			dbP2 += Math.pow(Math.abs(X[i] - Y[i]), 2);
			dbP3 += Math.pow(Math.abs(X[i] - Y[i]), 3);
			if (dbPoo < Math.abs(X[i] - Y[i])) {
				dbPoo = Math.abs(X[i] - Y[i]);
			}
		}
		//繰り返さない計算
		dbP2 = Math.pow(dbP2, 1.0 / 2.0);
		dbP3 = Math.pow(dbP3, 1.0 / 3.0);
		
		//結果表示
		System.out.println(dbP1);
		System.out.println(dbP2);
		System.out.println(dbP3);
		System.out.println(dbPoo);
	}
}