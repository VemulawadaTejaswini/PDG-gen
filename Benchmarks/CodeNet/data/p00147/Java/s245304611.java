import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * プログラミングコンテスト<br>
 * 0147:Fukushimaken
 *
 * @author t690593
 *
 */
public class Fukushimaken {

	/** 最大グループ数 */
	static final int MAX_GROUP_NUKMBER = 100;

	/** 客の到着間隔 */
	static final int TIME_INTERVAL = 5;

	/** 座席 */
	static int[] sheets = new int[17];

	/** 各グループの待ち時間 */
	static int[] waitTimes = new int[100];

	/** インプット */
	static List<Integer> inputs = new ArrayList<Integer>();

	/** インプットの最大グループ番号 */
	static int maxGroupNumber;

	/**
	 * メイン
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int inputNum = scanner.nextInt();
			if (maxGroupNumber < inputNum) {
				maxGroupNumber = inputNum;
			}
			inputs.add(inputNum);
		}

		// 先頭のグループ番号
		int frontGroup = 0;
		// 最後尾のグループ番号
		int endGroup = 0;
		// 経過時間：分単位
		int time = 0;

		while (true) {
			// 5分間隔でお店に客がくる（最後尾は最大グループ数より大きくならない）
			if (time % TIME_INTERVAL == 0 && endGroup < MAX_GROUP_NUKMBER) {
				endGroup++;
			}

			for (int i = frontGroup; i < endGroup; i++) {
				int ninzu = i % 5 == 1 ? 5 : 2;
				int startPos = getOpendSheetsPosition(ninzu);
				if (startPos >= 0) {
					// 座れる場合
					secureSheets(startPos, calcMealtime(i), ninzu);
					waitTimes[i] = time - i * 5;
					frontGroup++;
				} else {
					// 座れない場合
					break;
				}

			}

			// 入力されたグループ番号の最大番号が席に座るか、全てのグループが席に座ったら終了
			if (frontGroup == MAX_GROUP_NUKMBER || frontGroup > maxGroupNumber) {
				break;
			}

			// 座席の食事時間を時間経過とともに減らす
			for (int i = 0; i < sheets.length; i++) {
				if (sheets[i] > 0) {
					sheets[i] = sheets[i] - 1;
				}
			}

			time++;
		}

		for (int input : inputs) {
			System.out.println(waitTimes[input]);
		}
	}

	/**
	 * 空いている席の最初の席番号を返却する<br>
	 * 席が空いていない場合、-1を返却する
	 *
	 * @param peopleNum
	 *            グループの人数
	 * @return 空いている席の最初の席番号
	 */
	private static int getOpendSheetsPosition(int peopleNum) {
		int startPos = -1;
		int openedSheetNum = 0;
		for (int i = 0; i < sheets.length; i++) {
			if (sheets[i] == 0) {
				if (startPos == -1) {
					startPos = i;
				}
				openedSheetNum++;
			} else {
				startPos = -1;
				openedSheetNum = 0;
			}

			if (openedSheetNum == peopleNum) {
				return startPos;
			}
		}
		return -1;
	}

	/**
	 * 対象グループの食事時間を計算する
	 *
	 * @param targetGroup
	 *            対象グループ番号
	 * @return 食事間
	 */
	private static int calcMealtime(int targetGroup) {
		return 17 * (targetGroup % 2) + 3 * (targetGroup % 3) + 19;
	}

	/**
	 * 座席を確保する
	 *
	 * @param startPos
	 *            席確保する最初の席番号
	 * @param mealtime
	 *            確保する時間（食事時間）
	 * @param peopleNum
	 *            グループ人数
	 */
	private static void secureSheets(int startPos, int mealtime, int peopleNum) {
		for (int i = 0; i < peopleNum; i++) {
			sheets[i + startPos] = mealtime;
		}
	}
}