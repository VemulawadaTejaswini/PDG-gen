import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Double> standardDeviationList = new ArrayList<Double>();

		int inputCount;
		while (EndDecision(inputCount = sc.nextInt())) {
			int[] score = new int[inputCount];
			for (int i = 0; i < inputCount; i++) {
				score[i] = sc.nextInt();
			}
			standardDeviationList.add(StandardDeviationCalculation(score));
		}

		for (double value : standardDeviationList) {
			System.out.println(value);
		}

	}

	private static double StandardDeviationCalculation(int[] score) {
		int sum = 0;
		double standardDeviation = 0;
		for (int i : score)
			sum += i;
		for (int i : score)
			standardDeviation += Math.pow(i - (sum / score.length), 2);
		standardDeviation = Math.sqrt(standardDeviation / score.length);

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

