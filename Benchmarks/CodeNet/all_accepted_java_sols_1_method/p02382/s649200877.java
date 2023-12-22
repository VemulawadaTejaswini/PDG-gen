import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Lesson10D ２つのデータがどれだけ似ているかを、
 * それらの距離で測る手法は、クラスタリングや分類など、
 * 様々なところで使われています。
 * ここでは、２つの n  次元ベクトル x={x 1 ,x 2 ,...,x n }  と y={y 1 ,y 2 ,...,y n }
 * の距離を計算してみましょう。
 * このようなデータの距離を測る指標のひとつとして、
 * 次のミンコフスキー距離が知られています。
 * D xy ・・=(? i=1 n |x i −y i | p ) 1p
 * p=1  のとき
 * D xy =|x 1 −y 1 |+|x 2 −y 2 |+...+|x n −y n |
 * となり、これはマンハッタン距離とよばれます。
 * p=2  のとき
 * D xy =(|x 1 −y 1 |) 2 +(|x 2 −y 2 |) 2 +...+(|x n −y n |) 2
 * − − − − − − − − − − − − − − − − − − − − − − − − − −  √
 * となり、これは一般的に使われるユークリッド距離になります。
 * p=∞  のとき
 * D xy =max n i=1 (|x i −y i |)
 * となり、これはチェビシェフ距離と呼ばれます。
 * ２つの n  次元ベクトルが与えられるので、
 * p  がそれぞれ 1、2、3、∞  のミンコフスキー距離を求めるプログラム
 *
 * @author Internship
 *
 */
public class Main{

	/**
	 * プログラムのエントリポイント
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// p = 1のとき
		// D xy =|x 1 −y 1 |+|x 2 −y 2 |+...+|x n −y n |
		double dbD1 = 0.0;

		// p = 2のとき
		// D xy =(|x 1 −y 1 |) 2乗 +(|x 2 −y 2 |) 2乗 +...+(|x n −y n |) 2乗
		// あとで平方根
		double dbD2 = 0.0;

		// p = 3のとき
		// D xy =(|x 1 −y 1 |) 3乗 +(|x 2 −y 2 |) 3乗 +...+(|x n −y n |) 3乗
		//あとで立方根をとる
		double dbD3 = 0.0;

		// p = ∞のとき
		// D xy =max n i=1 (|x i −y i |)
		// MAX値を取得
		double dbMax = 0.0;

		// 1行目を取得
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strLine = insBR.readLine();

			// 2行目を取得
			strLine = insBR.readLine();

			// 分解
			String[] strAryLineX = strLine.split(" ");

			// 配列に全部格納しておく
			int[][] intLine = new int[2][strAryLineX.length];

			// 3行目を取得
			strLine = insBR.readLine();

			// 分解
			String[] strAryLineY = strLine.split(" ");

			for (int i = 0; i < strAryLineY.length; i++) {

				// 格納
				intLine[0][i] = Integer.parseInt(strAryLineX[i]);
				intLine[1][i] = Integer.parseInt(strAryLineY[i]);

				// p = 1のとき
				// D xy =|x 1 −y 1 |+|x 2 −y 2 |+...+|x n −y n |
				dbD1 += Math.abs(intLine[0][i] - intLine[1][i]);

				// p = 2のとき
				// D xy =(|x 1 −y 1 |) 2乗 +(|x 2 −y 2 |) 2乗 +...+(|x n −y n |)
				// 2乗
				dbD2 += Math.abs(intLine[0][i] - intLine[1][i])
						* Math.abs(intLine[0][i] - intLine[1][i]);

				// p = 3のとき
				// D xy =(|x 1 −y 1 |) 3乗 +(|x 2 −y 2 |) 3乗 +...+(|x n −y n |)
				// 3乗
				dbD3 += Math.abs(intLine[0][i] - intLine[1][i])
						* Math.abs(intLine[0][i] - intLine[1][i])
						* Math.abs(intLine[0][i] - intLine[1][i]);

				if (i == 0) {
					// 最初の値を取得
					dbMax = Math.abs(intLine[0][i] - intLine[1][i]);
				} else {

					// より大きければ取得
					if (dbMax < Math.abs(intLine[0][i] - intLine[1][i])) {
						dbMax = Math.abs(intLine[0][i] - intLine[1][i]);
					}
				}

			}

			// 平方根をとる
			dbD2 = Math.sqrt(dbD2);

			//立方根をとる
			dbD3 = Math.cbrt(dbD3);

			// 小数6桁まで
			DecimalFormat insdf = new DecimalFormat("0.000000");

			// 結果を出力 double型は小数6桁まで表示
			System.out.println(insdf.format(dbD1));
			System.out.println(insdf.format(dbD2));
			System.out.println(insdf.format(dbD3));
			System.out.println(insdf.format(dbMax));

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}