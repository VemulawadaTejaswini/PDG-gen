package Lesson11B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Lesson11B サイコロを転がすシミュレーションを行うプログラム
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

		// 答えの格納場所
		ArrayList<Integer> intAryAnswer = new ArrayList<Integer>();

		// 1行目取得
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

		try {
			String strLine = insBR.readLine();

			// １つのサイコロを作成
			DiceNum insDiceDiceNum = new DiceNum(strLine);

			// 2行目取得
			strLine = insBR.readLine();

			// 数を取得
			int intNum = Integer.parseInt(strLine);

			// 3行目以降取得
			for (int i = 0; i < intNum; i++) {

				strLine = insBR.readLine();

				// 上面と前面が引数の数字になるように転がす
				insDiceDiceNum.determine(strLine);

				// 答えを取得
				int intAnswer = insDiceDiceNum.getRightNum();

				// 答えを格納
				intAryAnswer.add(intAnswer);

			}

			// 答えが何個あるか取得
			int intSize = intAryAnswer.size();

			// 出力
			for (int i = 0; i < intSize; i++) {
				System.out.println(intAryAnswer.get(i));
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

/**
 * サイコロの目が保存されている。
 *
 */
class DiceNum {

	// フィールド値
	int[] intDice = new int[6];

	// コンストラクタ
	DiceNum() {

	}

	DiceNum(String strLine) {

		// 分解
		String[] strAryLine = strLine.split(" ");

		// さいころの面の各数字を格納
		for (int i = 0; i < strAryLine.length; i++) {
			intDice[i] = Integer.parseInt(strAryLine[i]);
		}
	}

	// メソッド

	/**
	 * サイコロの右面を返す
	 */
	int getRightNum() {
		return intDice[2];
	}

	/**
	 * サイコロの上面と前面を引数を持ち,その通りになるように転がす
	 *
	 * @param strLine
	 *
	 */
	void determine(String strLine) {
		// 分解
		String[] strAryLine = strLine.split(" ");

		// 上面の数を取得
		int intUnder = Integer.parseInt(strAryLine[0]);

		// 前面の数を取得
		int intFront = Integer.parseInt(strAryLine[1]);

		// 上面をintDice[0]になるように転がす
		adjustTop(intUnder);

		// 上面が固定された
		// 上面が最終的変わらないよう、前面が同じなるように転がす
		MaintainTopadjustFront(intFront);

	}

	/**
	 * 上面の数字を引数に持ち、その数字が上面に来るように転がす
	 *
	 * @param intNum
	 *
	 */
	void adjustTop(int intNum) {

		// 前面にきているので
		if (intNum == intDice[1]) {

			// Nへ転がす
			goNorth(intDice);
		}

		// 右面にきているので
		if (intNum == intDice[2]) {

			// Wへ転がす
			goWest(intDice);
		}

		// 左面にきているので
		if (intNum == intDice[3]) {

			// Eへ転がす
			goEast(intDice);
		}

		// 底面にきているので
		if (intNum == intDice[3]) {

			// EEへ転がす
			goEast(intDice);
			goEast(intDice);
		}

	}

	/**
	 * サイコロの上面が最終的に変わらないように前面が引数の数字になるように転がす
	 *
	 * @param intNum 前面がなってほしい値
	 */
	void MaintainTopadjustFront(int intNum) {

		// 右面にきているので
		if (intNum == intDice[2]) {

			// ENWへ転がす
			goEast(intDice);
			goNorth(intDice);
			goWest(intDice);
		}

		// 左面にきているので
		if (intNum == intDice[3]) {

			// WNEへ転がす
			goWest(intDice);
			goNorth(intDice);
			goEast(intDice);
		}

		// 後面にきているので
		if (intNum == intDice[3]) {

			// SSEEへ転がす
			goSouth(intDice);
			goSouth(intDice);
			goEast(intDice);
			goEast(intDice);
		}

	}

	/**
	 * Nの方へ転がした時にサイコロ目が変わる。 変わった状態へするメソッド
	 *
	 * @param intDice
	 */

	void goNorth(int[] intDice) {

		// サイコロ目を移動後のサイコロ
		int[] intAfter = new int[intDice.length];

		// サイコロ目を移す
		System.arraycopy(intDice, 1, intAfter, 0, 1);
		System.arraycopy(intDice, 5, intAfter, 1, 1);
		System.arraycopy(intDice, 2, intAfter, 2, 1);
		System.arraycopy(intDice, 3, intAfter, 3, 1);
		System.arraycopy(intDice, 0, intAfter, 4, 1);
		System.arraycopy(intDice, 4, intAfter, 5, 1);

		// 元のサイコロへコピー
		System.arraycopy(intAfter, 0, intDice, 0, 6);

	}

	/**
	 * Eの方へ転がした時にサイコロ目が変わる。 変わった状態へするメソッド
	 *
	 * @param intDice
	 */
	void goEast(int[] intDice) {

		// サイコロ目を移動後のサイコロ
		int[] intAfter = new int[intDice.length];

		// サイコロ目を移す
		System.arraycopy(intDice, 3, intAfter, 0, 1);
		System.arraycopy(intDice, 1, intAfter, 1, 1);
		System.arraycopy(intDice, 0, intAfter, 2, 1);
		System.arraycopy(intDice, 5, intAfter, 3, 1);
		System.arraycopy(intDice, 4, intAfter, 4, 1);
		System.arraycopy(intDice, 2, intAfter, 5, 1);

		// 元のサイコロへコピー
		System.arraycopy(intAfter, 0, intDice, 0, 6);

	}

	/**
	 * Wの方へ転がした時にサイコロ目が変わる。 変わった状態へするメソッド
	 *
	 * @param intDice
	 */
	void goWest(int[] intDice) {

		// サイコロ目を移動後のサイコロ
		int[] intAfter = new int[intDice.length];

		// サイコロ目を移す
		System.arraycopy(intDice, 2, intAfter, 0, 1);
		System.arraycopy(intDice, 1, intAfter, 1, 1);
		System.arraycopy(intDice, 5, intAfter, 2, 1);
		System.arraycopy(intDice, 0, intAfter, 3, 1);
		System.arraycopy(intDice, 4, intAfter, 4, 1);
		System.arraycopy(intDice, 3, intAfter, 5, 1);

		// 元のサイコロへコピー
		System.arraycopy(intAfter, 0, intDice, 0, 6);

	}

	/**
	 * Sの方へ転がした時にサイコロ目が変わる。 変わった状態へするメソッド
	 *
	 * @param intDice
	 */
	void goSouth(int[] intDice) {

		// サイコロ目を移動後のサイコロ
		int[] intAfter = new int[intDice.length];

		// サイコロ目を移す
		System.arraycopy(intDice, 4, intAfter, 0, 1);
		System.arraycopy(intDice, 0, intAfter, 1, 1);
		System.arraycopy(intDice, 2, intAfter, 2, 1);
		System.arraycopy(intDice, 3, intAfter, 3, 1);
		System.arraycopy(intDice, 5, intAfter, 4, 1);
		System.arraycopy(intDice, 1, intAfter, 5, 1);

		// 元のサイコロへコピー
		System.arraycopy(intAfter, 0, intDice, 0, 6);

	}
}