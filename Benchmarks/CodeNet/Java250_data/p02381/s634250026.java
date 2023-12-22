import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Double> standardDeviationList = new ArrayList<Double>();

		int inputCount;
		while (EndDecision(inputCount = sc.nextInt())) {
			int[] scores = new int[inputCount];
			for (int i = 0; i < inputCount; i++) {
				scores[i] = sc.nextInt();
			}
			standardDeviationList.add(StandardDeviationCalculation(scores));
		}

		for (double value : standardDeviationList) {
			System.out.println(value);
		}

	}

	private static double StandardDeviationCalculation(int[] scores) {
		double sum = 0;
		double standardDeviation = 0;
		for (int i : scores)
			sum += i;
		for (int i : scores)
			standardDeviation += Math.pow((sum / scores.length) - i, 2);
		standardDeviation = Math.sqrt(standardDeviation / scores.length);

		return standardDeviation;
	}

	private static boolean EndDecision(int i) {
		if (i == 0) {
			return false;
		} else {
			return true;
		}
	}

}

