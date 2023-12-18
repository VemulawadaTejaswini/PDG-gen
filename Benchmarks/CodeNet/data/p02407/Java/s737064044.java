import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Lesson6A　与えられた数列を逆順に出力するプログラム
 *
 * @author 前島佑介
 * @version 2014/12/1
 */
public class Lesson6A {

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

			//反転させる
			StringBuffer sb = new StringBuffer(strLine);
			strLine = sb.reverse().toString();

			//出力
			System.out.print(strLine);

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数値で入力して下さい");
		}
	}
}