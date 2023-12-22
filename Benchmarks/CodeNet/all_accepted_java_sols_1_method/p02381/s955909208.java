import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Lesson10C n 人の学生を含むクラスでプログラミングの試験を行った。
 * それぞれの得点をs1, s2 ...
 * snとしたときの、標準偏差を求めるプログラム
 *  得点の平均値をｍとすれば、
 *  分散α2は以下の式で得られる：
 *   α2 = (?ni=1(si - m)2)/n
 * 分散の正の平方根が標準偏差αとなる。
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

		// 平均M　全部足して/個数で割る
		double dbAverage = 0.0;

		// 標準偏差
		// aa = (s1-m)2乗 + (s2-m)2乗 + ・・・
		//あとでNで割る
		// a = ・・・
		double dbStandarddeviatio = 0.0;

		// 答えの格納場所
		ArrayList<Double> dbAryAnswer = new ArrayList<Double>();

		// 1行目を取得
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			while (true) {

				String strLine = insBR.readLine();

				// 数字を取得
				int intNum = Integer.parseInt(strLine);

				if (intNum == 0) {
					break;
				}

				// 2行目を取得
				strLine = insBR.readLine();

				// 分解
				String[] strAryLine = strLine.split(" ");

				// 配列に全部格納しておく
				int[] intLine = new int[strAryLine.length];

				for (int i = 0; i < strAryLine.length; i++) {
					intLine[i] = Integer.parseInt(strAryLine[i]);

					// 平均M　全部足して/個数で割る
					dbAverage += intLine[i];

				}

				// 平均M　全部足して/個数で割る
				dbAverage = dbAverage / strAryLine.length;

				// 標準偏差
				// aa = (s1-m) + (s2-m) + ・・・

				for (int i = 0; i < strAryLine.length; i++) {

					dbStandarddeviatio += (intLine[i] - dbAverage) * (intLine[i] - dbAverage);

				}

				// aaをnで割る
				dbStandarddeviatio /= strAryLine.length;

				// a ＝・・・・
				dbStandarddeviatio = Math.sqrt(dbStandarddeviatio);

				dbAryAnswer.add(dbStandarddeviatio);

				//初期化
				dbAverage = 0.0;
				
				dbStandarddeviatio =0.0;

			}

			// 答えが何個あるか取得
			int intSize = dbAryAnswer.size();

			// 出力
			for (int i = 0; i < intSize; i++) {
				System.out.println(dbAryAnswer.get(i));
			}

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}