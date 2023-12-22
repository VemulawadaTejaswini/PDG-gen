import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		Integer[] numbers = new Integer[n];
		int alice = 0;
		int bob = 0;

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		Arrays.sort(numbers, Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				alice += numbers[i];
			} else {
				bob += numbers[i];
			}
		}

		System.out.println(Math.abs(alice - bob));

		System.out.println();

		scanner.close();
	}
}