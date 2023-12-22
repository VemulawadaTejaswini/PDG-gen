import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lesson6A　与えられた数列を逆順に出力するプログラム
 *
 * @author 前島佑介
 * @version 2014/12/1
 */
class Main {

	/**
	 * プログラムのエントリポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// 1行目読み込む
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(
					System.in));

			String strNum = insBR.readLine();

			// 数値化
			int intNum = Integer.parseInt(strNum);

			// 2行目読み込む
			String strLine = insBR.readLine();

			// 2行目をばらけさせる
			String[] strAry = strLine.split(" ");

			// intにキャストして配列にいれる
			int[] intAry = new int[intNum];

			for (int i = 0; i < intNum; i++) {
				intAry[i] = Integer.parseInt(strAry[i]);
			}

			// 反転させる
			for (int i = 0; i < intNum / 2; i++) {

				int intChage = 0;
				intChage = intAry[i];
				intAry[i] = intAry[intNum - 1 - i];
				intAry[intNum - 1 - i] = intChage;

			}

			// 出力
			for (int i = 0; i < intNum; i++) {
				if(i ==0) {
					System.out.print(intAry[i]);
				} else {
					System.out.print(" " + intAry[i]);
				}
			}
			System.out.println("");


		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}

	}
}