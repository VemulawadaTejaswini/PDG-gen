import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static double max = 0.0;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();

			double[] array = new double[N];
			for (int i = 0; i < N; i++) {
				array[i] = scanner.nextDouble();
			}
			Arrays.sort(array);

			double result = array[0];
			for (int i = 0; i < N; i++) {
				result = (result + array[i]) / 2;
			}
			System.out.println(result);
		}
	}
}
