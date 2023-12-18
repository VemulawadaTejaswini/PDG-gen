import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int length = Integer.parseInt(scanner.nextLine());

		String numbers = scanner.nextLine();

		int quantity = Integer.parseInt(scanner.nextLine());

		String[] numbersForChange = new String[quantity];

		for (int i = 0; i < quantity; i++) {
			numbersForChange[i] = scanner.nextLine();

		}
		
		SumSum sussm = new SumSum(length, numbers, quantity, numbersForChange);

	}

}
 class SumSum {

	private String[] array;
	private int[] arrayNumbers = new int[100001];
	private String[] numbersForChange;
	private long sum;

	public SumSum(int length, String numbers, int quantity, String... numbersForChange) {
		this.array = numbers.split(" ");
		this.numbersForChange = numbersForChange;
		run();
	}

	public static void main(String[] args) {
		Va.main(null);
	}

	public String run() {
		long[] res = new long[numbersForChange.length];
		createIntArray();
		String[] twoNumber;
		int[] twoIntNumber = new int[2];
		int i = 0;
		for (String s : numbersForChange) {
			twoNumber = s.split(" ");
			twoIntNumber[0] = Integer.parseInt(twoNumber[0]);
			twoIntNumber[1] = Integer.parseInt(twoNumber[1]);
			int n = arrayNumbers[twoIntNumber[0]];
			if (n == 0) {
				res[i] = sum;
				
									System.out.println(sum);
				i++;
				continue;
			}
			sum -= twoIntNumber[0] * n;
			arrayNumbers[twoIntNumber[0]] = 0;
			arrayNumbers[twoIntNumber[1]] += n;
			sum += twoIntNumber[1] * n;
			res[i] = sum;

									System.out.println(sum);

			i++;
		}

		return Arrays.toString(res);
	}

	private void createIntArray() {
		for (String s : array) {
			int number = Integer.parseInt(s);
			arrayNumbers[number] += 1;
			sum += number;
		}
	}

}
