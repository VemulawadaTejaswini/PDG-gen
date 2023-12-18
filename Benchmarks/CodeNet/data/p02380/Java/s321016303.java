import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lesson10B 三角形の２辺 a, b とその間の角 C から、
 * その三角形の面積 S、周の長さ L, a を底辺としたときの高さ h を求めるプログラム
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

		// 1行目を取得
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strLine = insBR.readLine();

			// 分解
			String[] strAryLine1 = strLine.split(" ");

			// intにキャスト
			// Aの値
			double dbA = Double.parseDouble(strAryLine1[0]);

			// Bの値
			double dbB = Double.parseDouble(strAryLine1[1]);

			// 角度
			int intAngle = Integer.parseInt(strAryLine1[2]);

			//面積S
			double dbAreaS = 0.0;

			//周囲L
			double dbSurroundingsL = 0.0;

			//高さH
			double dbHeight = 0.0;

			// 計算

			//sin値
			double dbSin = Math.sin(Math.toRadians(intAngle));

			dbAreaS = dbA * dbB / 2 * dbSin;

			double dbAnswer = (dbA * dbA) + (dbB * dbB);

			dbAnswer = Math.sqrt(dbAnswer);

			dbSurroundingsL = dbA + dbB + (dbAnswer);

			dbHeight = dbAreaS / dbA * 2;

			System.out.println(dbAreaS);

			System.out.println(dbSurroundingsL);

			System.out.println(dbHeight);


		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}