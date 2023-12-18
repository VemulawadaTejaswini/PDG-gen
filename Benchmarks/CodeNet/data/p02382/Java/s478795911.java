import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dimensionCount = Integer.parseInt(sc.nextLine());

		String[] input = sc.nextLine().split("[\\s]+");
		int[] vectorXArray = new int[dimensionCount];
		for (int i = 0; i < input.length; i++)
			vectorXArray[i] = Integer.parseInt(input[i]);

		input = sc.nextLine().split("[\\s]+");
		int[] vectorYArray = new int[dimensionCount];
		for (int i = 0; i < input.length; i++)
			vectorYArray[i] = Integer.parseInt(input[i]);

		double D[] = Distance(vectorXArray, vectorYArray);

		double max = Math.abs(vectorXArray[0] - vectorYArray[0]);
		for (int i = 0; i < dimensionCount; i++) {
			max = Math.max(Math.abs(vectorXArray[i] - vectorYArray[i]), max);
		}

		for (double dis : D) {
			System.out.println(dis);
		}
		System.out.println(max);

	}

	static double[] Distance(int[] x, int[] y) {
		double[] distance = new double[3];
		for (int p = 1; p <= distance.length; p++) {
			double sum = 0;
			for (int i = 0; i < x.length; i++)
				sum += Math.pow(Math.abs(x[i] - y[i]), p);
			distance[p - 1] = Math.pow(sum, 1.0/p);
		}
		return distance;
	}

}

