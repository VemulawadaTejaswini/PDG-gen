import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		//コマンドライン引数取得部分
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> valList = new ArrayList<>();
		ArrayList<Integer> roundUpList = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			valList.add(scanner.nextInt());
			BigDecimal bd = new BigDecimal(valList.get(i));
			//１の位を切り上げる
			roundUpList.add(bd.setScale(-1, BigDecimal.ROUND_UP).intValue());
		}
		scanner.close();

		//最大差分値
		int maxVal = 0;
		//最大差分値となる配列番号
		int maxSeqNo = 0;
		//最小提供時間
		int time = 0;

		//配列同士の差分が一番大きい配列番号を取得する
		for (int i = 0; i < valList.size(); i++) {
			if (maxVal < roundUpList.get(i) - valList.get(i)) {
				maxVal = roundUpList.get(i) - valList.get(i);
				maxSeqNo = i;
			}
		}

		//最小提供時間を計算する
		for (int i = 0; i < valList.size(); i++) {
			if (i == maxSeqNo) {
				time += valList.get(maxSeqNo);
			} else {
				time += roundUpList.get(i);
			}
		}

		System.out.println(time);
	}

}
