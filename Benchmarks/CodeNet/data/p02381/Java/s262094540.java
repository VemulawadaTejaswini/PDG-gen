import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static final int END_SIGN = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 標準偏差値のリスト
		ArrayList<Double> standardDeviationList = new ArrayList<Double>();

		int inputCount;
		// 得点の件数を入力、0で終了
		while (EndDecision(inputCount = sc.nextInt())) {
			// 得点リスト
			ArrayList<Double> scores = new ArrayList<Double>();
			for (int i = 0; i < inputCount; i++) {
				scores.add(sc.nextDouble());
			}
			// 標準偏差値を計算し、標準偏差値リストに追加
			standardDeviationList.add(StandardDeviationCalculation(scores));
		}

		// 出力
		for (double value : standardDeviationList) {
			System.out.println(value);
		}

	}

	// 得点リストを受け取り、標準偏差値を返す
	private static double StandardDeviationCalculation(ArrayList<Double> scores) {
		double standardDeviation = 0;
		ArrayList<Double> differenceFromAverageList = new ArrayList<Double>();
		for (double i : scores)
			differenceFromAverageList.add(Math.pow((Average(scores)) - i, 2));
		// 平均との差の２乗の合計から平均を平方根計算し標準偏差値を求める
		standardDeviation = Math.sqrt(Average(differenceFromAverageList));

		return standardDeviation;
	}

	// リストから平均を返す
	private static double Average(ArrayList<Double> List) {
		double sum = 0;
		for (double d : List) {
			sum += d;
		}
		return sum / List.size();
	}

	// 終了判定
	private static boolean EndDecision(int i) {
		if (i == END_SIGN) {
			return false;
		} else {
			return true;
		}
	}

}

