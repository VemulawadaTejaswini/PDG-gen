import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayMax = new ArrayList<Integer>();
		ArrayList<Integer> arraySum = new ArrayList<Integer>();

		int intCount = 0;
		int intMax;
		int intSum;
		int intLine = 0;
		//int intInput[][];
		//intInput = new int[intLine + 1000][2];

		while (true) {

			// 最大値intMaxと和intSumを定義
			intMax = scanner.nextInt();
			intSum = scanner.nextInt();

			// intMaxとintSumが0のとき中断
			if (intMax == 0 && intSum == 0) {
				break;
			}

			// 配列に入力した数値を格納
			arrayMax.add(intMax);
			arraySum.add(intSum);


		// 1～intMaxの数字をすべて試行

		for (int intI = 1; intI <= arrayMax.get(intLine) - 2; intI++) {
			for (int intJ = intI + 1; intJ <= arrayMax.get(intLine) - 1; intJ++) {
				for (int intK = intJ + 1; intK <= arrayMax.get(intLine); intK++) {
					// それぞれ異なる数値の時
					if (!(intI == intJ) || !(intI == intK) || !(intJ == intK)) {
						int intSumIJK = intI + intJ + intK;
						if (arraySum.get(intLine) == intSumIJK) {
							intCount++;
						}
					}
				}
			}
		}
		System.out.println(intCount);
		intCount = 0;
		intLine++;
		}
	}
}

