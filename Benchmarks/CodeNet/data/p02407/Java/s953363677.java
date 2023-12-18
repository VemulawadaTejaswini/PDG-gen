import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * Lesson6A　与えられた数列を逆順に出力するプログラム
 *
 * @author 前島佑介
 * @version 2014/12/1
 */
class Main{

	/**
	 * プログラムのエントリポイント
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// 1行目読み込む
		try {

			BufferedReader insBR = new BufferedReader(new InputStreamReader(
					System.in));

			insBR.readLine();

			//2行目読み込む
			String strLine = insBR.readLine();

			// リストに詰める
			String[] strAry = strLine.split(" ");

			//リストに詰めたものを Integer配列にキャスト後に詰める
			Integer[] inteAry = new Integer[strAry.length];

			for (int i = 0; i < strAry.length; i++) {
				inteAry[i] = Integer.parseInt(strAry[i]);
			}

			//降順にする
			Arrays.sort(inteAry,Collections.reverseOrder());

			// 出力
			for (int i = 0; i < inteAry.length; i++) {
				System.out.print(inteAry[i] + " ");
			}

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数値で入力して下さい");
		}



	}

}