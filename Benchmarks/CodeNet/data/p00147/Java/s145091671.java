import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	// 正午からの経過時間（分）
	private int time = 0;

	// 待ち時間を調査済みであるグループ数
	private int groupCount = 0;

	public static void main(String[] args) throws Exception {
		new Main().execute();
	}

	private void execute() throws Exception {

		// 標準入力を１行ずつ処理
		List<Integer> targetGroups = readInitialData();

		// 席数(17席)
		EatingVisitor[] seats = new EatingVisitor[17];

		// 待っている人の行列
		List<WaitingVisitor> waitingGroups = new ArrayList<WaitingVisitor>();

		// 各グループの待ち時間計算結果
		List<Integer> waitTimes = new ArrayList<Integer>();

		// 待ち時間を調べる必要がある最後のグループを取得
		int maxGroupNum = searchMaxGroupNum(targetGroups);

		// 要調査の最大グループが調べ終わったら終了
		while (groupCount <= maxGroupNum) {

			// 行列の更新
			waitingGroups.addAll(updateWaitLine());

			// 離席する
			leaveSeat(seats);

			// 着席する
			waitTimes.addAll(sitDown(seats, waitingGroups));

			time++;
		}

		// 結果出力
		for (int targetGroup : targetGroups) {
			System.out.println(waitTimes.get(targetGroup));
		}
	}

	/**
	 * 座席に着席する
	 * 
	 * @param seats
	 *            福縞軒の座席(17席)
	 * @param waitingGroups
	 *            外で待っているグループ
	 */
	private List<Integer> sitDown(EatingVisitor[] seats,
			List<WaitingVisitor> waitingGroups) {

		List<Integer> waitTimes = new ArrayList<Integer>();

		int removeCount = 0;
		for (WaitingVisitor waitingPerson : waitingGroups) {

			int emptySeatCount = 0;
			boolean isEmpty = false;
			for (int i = 0; i < seats.length; i++) {

				// 空席数を検知
				if (seats[i] == null) {
					emptySeatCount++;
				} else {
					emptySeatCount = 0;
				}

				if (waitingPerson.getNumber() == emptySeatCount) {

					// 席に座ったグループ数を更新
					groupCount++;
					removeCount++;
					isEmpty = true;

					// 所属グループの待ち時間を記録
					waitTimes.add(time - waitingPerson.getStartTime());

					// 食べ終わる時間を計算
					int endTime = 17 * (waitingPerson.getGroup() % 2) + 3
							* (waitingPerson.getGroup() % 3) + 19;

					for (int j = 0; j < emptySeatCount; j++) {
						seats[i - j] = new EatingVisitor(
								waitingPerson.getGroup(), endTime + time);
					}
					break;
				}
			}

			if (!isEmpty) {
				break;
			}

		}

		// 食事を始めた待ち人を削除
		for (int i = 0; i < removeCount; i++) {
			waitingGroups.remove(0);
		}

		return waitTimes;
	}

	/**
	 * 食事が終わった人を離席させる
	 * 
	 * @param seats
	 *            座席
	 */
	private void leaveSeat(EatingVisitor[] seats) {
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] != null && seats[i].getEndTime() == time) {
				seats[i] = null;
			}
		}
	}

	/**
	 * 待っている行列を更新
	 * 
	 * @return 待ち行列
	 */
	private List<WaitingVisitor> updateWaitLine() {

		List<WaitingVisitor> waitingGroups = new ArrayList<WaitingVisitor>();

		int nowGroup = time / 5;
		// グループがやってきたか判定
		if (time % 5 == 0) {
			// グループの人数を算出
			int number = 2;
			if (nowGroup % 5 == 1) {
				number = 5;
			}

			// 行列の後ろに追加。待ち始めた時間を記録
			waitingGroups.add(new WaitingVisitor(nowGroup, number, time));
		}

		return waitingGroups;
	}

	/**
	 * 標準入力からデータ取得
	 * 
	 * @return 要調査のグループ
	 */
	private List<Integer> readInitialData() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String line = null;
		List<Integer> groups = new ArrayList<Integer>();
		while ((line = reader.readLine()) != null) {
			groups.add(Integer.parseInt(line));
		}

		return groups;
	}

	/**
	 * 調査が必要な最大グループ番号を検索
	 * 
	 * @param targetGroups
	 *            調査対象のグループ
	 * @return グループ番号
	 */
	private int searchMaxGroupNum(List<Integer> targetGroups) {
		int maxGroupNum = 0;
		for (int targetGroup : targetGroups) {
			if (maxGroupNum < targetGroup) {
				maxGroupNum = targetGroup;
			}
		}
		return maxGroupNum;
	}

}

/**
 * お客さん
 */
abstract class Visitor {

	// 所属グループ
	private int group;

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

}

/**
 * 外で待っているお客さん
 */
class WaitingVisitor extends Visitor {

	public WaitingVisitor(int group, int number, int startTime) {
		setGroup(group);
		setNumber(number);
		setStartTime(startTime);
	}

	// 待ち始めた時刻
	private int startTime;

	// グループの人数
	private int number;

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}

/**
 * 食事中のお客さん
 */
class EatingVisitor extends Visitor {

	public EatingVisitor(int group, int endTime) {
		setGroup(group);
		setEndtTime(endTime);
	}

	// 食べ終わる時間
	private int endtTime;

	public int getEndTime() {
		return endtTime;
	}

	public void setEndtTime(int endtTime) {
		this.endtTime = endtTime;
	}

}