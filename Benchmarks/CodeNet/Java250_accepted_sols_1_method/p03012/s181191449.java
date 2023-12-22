import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vol = sc.nextInt();
		int sum = 0;
		int index = 0;
		int[] array = new int[vol];
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			sum += n;
			array[index] = n;
			index += 1;
		}

		int sum1 = 0;
		int sum2 = 0;
		index = 0;

		while (sum1 < sum / 2) {
			sum1 += array[index];
			index += 1;
		}

		sum2 = sum1 - array[index - 1];
		int result = Math.min(Math.abs(sum - 2 * sum1),Math.abs(sum - 2 * sum2));

		System.out.println(result);

	}

}
