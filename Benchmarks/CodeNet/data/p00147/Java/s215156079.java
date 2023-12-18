import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

public class Main {

	/**グループ人数周期表*/
	private static final int[] MEMBER_CYCLE = { 2, 5, 2, 2, 2 };
	/**グループ食事時間周期表*/
	private static final int[] EATING_TIME_CYCLE = { 19, 39, 25, 36, 22, 42 };

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 128);//おまじない付

		ArrayList<Integer> groupNumList = new ArrayList<Integer>();//入力値
		String singleLine;//1行分
		int maxGroupNum = 0; //入力中の最大グループ→99です。。。

		//一括で読み込み格納
		while ((singleLine = reader.readLine()) != null) {
			int groupNum = Integer.parseInt(singleLine);
			groupNumList.add(groupNum);
			if (groupNum > maxGroupNum) {
				maxGroupNum = groupNum;
			}
		}
		reader.close();
		//読み込み後計算
		int[] result = calculate(maxGroupNum);

		//グループ番号に対応する待ち時間を入力順で出力
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < groupNumList.size(); i++) {
			out.println(result[groupNumList.get(i)]);
		}
		out.flush();//まとめてflush
	}

	/**
	 *メイン処理
	 */
	private static int[] calculate(int lastGroupNum) {
		int time = -1; //時刻
		int lastGroupArriveTime = lastGroupNum * 5; //最終グループ到着時刻
		int[] waitingTimeArray = new int[lastGroupNum + 1]; //グループ毎待ち時間
		ArrayList<Integer> waitingQueue = new ArrayList<Integer>(); //待ち行列(到着時刻を格納)
		int[] endTimePerSeat = new int[17]; //食事終了予定時刻(席毎に保持)

		/** なんとなく早そう！*/
		BitSet vacantSeatList = new BitSet(17); //空席表(true:空席 false:満席)

		//待ち行列無しかつ、最終グループ到着後なら終了
		while (!(waitingQueue.isEmpty() && time > lastGroupArriveTime)) {

			time++; //時間を進める

			//待ち無しかつ、当該時刻に新規到着が無い場合は食事終了判定スキップ
			if (waitingQueue.isEmpty() && time % 5 != 0) {
				continue;
			}

			//食事終了時刻を過ぎた座席を見つけたら空席表を更新
			for (int e = 0; e < 17; e++) {
				if (!vacantSeatList.get(e) && endTimePerSeat[e] <= time) {
					vacantSeatList.set(e, true);
				}
			}

			//待ち行列への追加
			if (time % 5 == 0 && time <= lastGroupArriveTime) {
				waitingQueue.add(time);
			}

			//待ち行列が無くなる、または先頭グループが入店出来ない場合はループ終了
			while (!waitingQueue.isEmpty()) {
				int currentGroupNum = waitingQueue.get(0) / 5;
				int memberCount = MEMBER_CYCLE[currentGroupNum % 5];

				//空席がメンバ数未満
				if (memberCount > vacantSeatList.cardinality()) {
					break;
				}

				boolean isEnter = false;
				//空席がメンバ数以上の場合は、連続して空いているか確認
				for (int firstVacant = vacantSeatList.nextSetBit(0); firstVacant < 16 && firstVacant != -1;) {
					int endVacant = vacantSeatList.nextClearBit(firstVacant) - 1; //並びでの最後の空席位置

					//着席可能の場合
					if (endVacant >= firstVacant + memberCount - 1) {
						vacantSeatList.set(firstVacant, firstVacant + memberCount, false);//空席表を更新
						Arrays.fill(endTimePerSeat, firstVacant, firstVacant + memberCount, time
								+ EATING_TIME_CYCLE[currentGroupNum % 6]); //食事終了予定時刻を更新
						waitingTimeArray[currentGroupNum] = time - waitingQueue.get(0); //待ち時間結果表に追加
						waitingQueue.remove(0);//待ち行列減処理

						//次グループの入店可能判定へ移る
						isEnter = true;
						break;

					}
					//着席不可の場合、次の空席開始位置を探す
					isEnter = false;
					firstVacant = vacantSeatList.nextSetBit(endVacant + 3);

				}
				//先頭グループが入店出来なかった場合はループを終了し時刻を進める
				if (!isEnter) {
					break;
				}
			}

		}
		return waitingTimeArray;
	}
}