import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();

				if (a == 0 && b == 0) {
					break;
				}
			hasLeapYear(a, b);

		}
	sc.close();
	}

	private static void hasLeapYear(int a, int b) {
		boolean hasLeapYear = false;
		System.out.println();
		for (int i = a; i <= b; i++) {

			boolean res = isLeapYear(i);
				if (res) {
					if (hasLeapYear == false) {
						hasLeapYear = true;
					}
					System.out.println(i);
				}
		}

		if (hasLeapYear == false) {
			System.out.println("NA");
		}

	}

	private static boolean isLeapYear(int i) {
		if (i % 4 == 0) {
			if (i % 100 == 0) {

				if (i % 400 == 0) {
					return true;
				} else {
					return false;
				}

			}
			return true;
		} else {
			return false;
		}
	}
}
