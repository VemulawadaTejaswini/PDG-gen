
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int setCount = in.nextInt();

		if (isValidEntry(setCount)) {

			boolean[] result = new boolean[setCount];
			for (int c = 0; c < setCount; c++) {

				if (isRightTriangle(in.nextInt(), in.nextInt(), in.nextInt())) {
					result[c] = true;
				}
			}
			for (int c = 0; c < setCount; c++) {
				System.out.println(result[c]);
			}
		} else {
			System.out.println("Invalid input. Please try again!!");
		}
		in.close();
	}

	static boolean isRightTriangle(int a, int b, int c) {

		if (!isValidEntry(a) || !isValidEntry(b) || !isValidEntry(c)) {
			return false;
		} else if (a * a + b * b == c * c || a * a + c * c == b * b
				|| c * c + b * b == a * a) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isValidEntry(int input) {

		if (input > 0 && input <= 1000)
			return true;
		else
			return false;
	}
}