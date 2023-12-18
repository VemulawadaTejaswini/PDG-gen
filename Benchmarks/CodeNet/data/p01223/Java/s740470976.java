import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		// 標準入力で情報を取ってくる
		Scanner sc = new Scanner(System.in);

		int nowBlock = 0;
		int gap = 0;
		int mostUpGap = 0;
		int mostDownGap = 0;
		StringBuffer strb = new StringBuffer();

		// 全体試行回数
		int AllattemptCount = sc.nextInt();

		// 試行回数分プレイ
		for (int i = 0; i < AllattemptCount; i++) {

			// リスト
			ArrayList<Integer> gapList = new ArrayList<Integer>();

			// 各セッションの試行回数
			int sessionAttemptCount = sc.nextInt();

			// 最初のブロックを格納
			int pastBlock = sc.nextInt();

			// 各セッションの試行回数
			for (int t = 0; t < (sessionAttemptCount - 1); t++) {

				// 入力された値を現在のブロックとする
				nowBlock = sc.nextInt();

				// 差分を計算
				gap = (nowBlock - pastBlock);

				// リストに追加
				gapList.add(gap);

				// リストに追加し終わったので、現在のブロックを一つ前のブロックとして登録し、次回に備える
				pastBlock = nowBlock;
			}

			// 並び替え
			Collections.sort(gapList);

			// 段差がない場合を考慮し、一番登りが高い段差と、下りが高い段差を決定
			if (gapList.get(0) > 0) {
				mostDownGap = 0;
			} else {
				mostDownGap = (gapList.get(0) * -1);
			}

			if (gapList.get(gapList.size()-1) < 0) {
				mostUpGap = 0;
			} else {
				mostUpGap = gapList.get(gapList.size()-1);
			}

			String row = mostUpGap + " " + mostDownGap + "\n";
			strb.append(row);
		}

		System.out.print(strb);
	}
}