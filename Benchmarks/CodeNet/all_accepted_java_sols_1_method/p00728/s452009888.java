import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int dataSet = scanner.nextInt();
			if (dataSet == 0) {
				break;
			}
			int[] scoreArray = new int[dataSet];
			for (int i = 0; i < dataSet; i++) {
				scoreArray[i] = scanner.nextInt();
			}

			Arrays.sort(scoreArray);

			int sum = 0;
			for (int i = 1; i < scoreArray.length - 1; i++) {
				sum += scoreArray[i];
			}

			System.out.println(sum / (dataSet - 2));
		}
	}
}