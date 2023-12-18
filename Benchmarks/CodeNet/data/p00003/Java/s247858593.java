import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int loopNum = scanner.nextInt();
		for (int i = 0; i < loopNum; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			if (isTriangle(a, b, c)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static boolean isTriangle(int a, int b, int c) {
		if ((a + b + c) % 4 != 0 && (a + b + c) % 12 != 0) {
			return false;
		}

		if (a >= b && a >= c) {
			return a * a == b * b + c * c;
		} else {
			if (b >= c) {
				return b * b == a * a + c * c;
			} else {
				return c * c == a * a + b * b;
			}
		}
	}
}