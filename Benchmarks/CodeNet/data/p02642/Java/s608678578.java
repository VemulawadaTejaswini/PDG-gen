import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n;
	static int[] numberArray;

	static final long DIVIDE_NUMBER = 1000000007;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();

		numberArray = new int[n];

		for (int i = 0; i < n; i++) {

			numberArray[i] = scan.nextInt();
		}

		Arrays.sort(numberArray);

		int answer = 0;

		for (int i = 0; i < n; i++) {

			boolean result = check(i);

			if (result) {

				answer++;
			}
		}

		println(answer);
	}

	public static boolean check(int i) {

		int numberI = numberArray[i];

		for (int j = 0; j < i; j++) {

			int numberJ = numberArray[j];

			if (numberI % numberJ == 0) {
				return false;
			}

			if (numberI / 2 <= numberJ) {
				return true;
			}
		}

		if (i != n - 1 && numberI == numberArray[i + 1]) {
			return false;
		}

		return true;
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
