import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// 人数入力
			int intNum = scanner.nextInt();
			int intInput[] = new int[intNum + 1];

			if (intNum == 0) {
				break;
			}
			// 得点合計値の初期化
			double intSum = 0;
			for (int intI = 0; intI < intNum; intI++) {
				// 得点入力と合計値計算
				int intScore = scanner.nextInt();
				intInput[intI] = intScore;
				intSum += intScore;
			}
			// System.out.println(dbSum);
			double dbAverage = (double)(intSum / intNum);
			// System.out.println(dbAverage);
			double dbHensaSum = 0;
			for (int intJ = 0; intJ < intNum; intJ++) {
				double dbHensa = (double)(intInput[intJ] - dbAverage);
				// System.out.println(dbHensa);
				double dbHensa2 = Math.pow(dbHensa, 2);
				dbHensaSum += dbHensa2;
			}
			// System.out.println(dbHensaSum);
			double dbBunsan = (double)(dbHensaSum / intNum);

			double dbStandard = Math.sqrt(dbBunsan);

			System.out.println(String.format("%.8f", dbStandard));
		}
	}

}

