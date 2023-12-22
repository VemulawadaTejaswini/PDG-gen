import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lesson6B 太郎が花子と一緒にトランプ遊びをしようとしたところ 52枚あるはずのカードが n 枚のカードしか手元にありません。 これらの n
 * 枚のカードを入力として、足りないカードを出力するプログラム
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

		// スペード
		int[] intMarkS = new int[13];

		// ハート
		int[] intMarkH = new int[13];

		// クローバー
		int[] intMarkC = new int[13];

		// ダイヤ
		int[] intMarkD = new int[13];

		// カードの数字
		int intNum = 0;

		// 1行目を読み込む
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(
					System.in));

			int intFirstLine = Integer.parseInt(insBR.readLine());

			// 2行目以降を読み込む
			for (int i = 0; i < intFirstLine; i++) {
				String strLine = insBR.readLine();

				// 分解する
				String[] strAry = strLine.split(" ");

				// S 1
				// H 3
				// H 7
				// C 12
				// D 8

				// 配列に格納する　そのカードがあったら、そのカードの数字枠に１を入れる
				// 例　スペードの5　→　intMarkS[5] = 1
				// 最後にないカードの数字枠には0が入っていることになる

				// スペード
				if (strAry[0].equals("S")) {
					intNum = Integer.parseInt(strAry[1]);

					intMarkS[intNum - 1] = 1;

					// ハート
				} else if (strAry[0].equals("H")) {
					intNum = Integer.parseInt(strAry[1]);

					intMarkH[intNum - 1] = 1;

					// クローバー
				} else if (strAry[0].equals("C")) {
					intNum = Integer.parseInt(strAry[1]);

					intMarkC[intNum - 1] = 1;

					// ダイヤ
				} else if (strAry[0].equals("D")) {
					intNum = Integer.parseInt(strAry[1]);

					intMarkD[intNum - 1] = 1;
				}

			}

			// 出力
			for (int i = 0; i < intMarkS.length; i++) {
				if (intMarkS[i] == 0) {
					System.out.println("S " + (i + 1));
				}
			}

			for (int i = 0; i < intMarkH.length; i++) {
				if (intMarkH[i] == 0) {
					System.out.println("H " + (i + 1));
				}
			}

			for (int i = 0; i < intMarkC.length; i++) {
				if (intMarkC[i] == 0) {
					System.out.println("C " + (i + 1));
				}
			}

			for (int i = 0; i < intMarkD.length; i++) {
				if (intMarkD[i] == 0) {
					System.out.println("D " + (i + 1));
				}
			}

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}