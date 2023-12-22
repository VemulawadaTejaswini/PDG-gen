
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ABC11X_A();
		ABC11X_B();
		// ABC11X_C();
		// ABC11X_D();
	}

	private static void ABC11X_A() {
		Scanner scanner = null;
		int nenrei = 0;

		try {
			scanner = new Scanner(System.in);
			nenrei = scanner.nextInt();

			switch (nenrei) {
			case 1:
				System.out.println("Hello World");
				break;
			case 2:
				int numA = scanner.nextInt();
				int numB = scanner.nextInt();
				System.out.println(numA + numB);
				break;
			default:
				break;
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC11X_B() {
		Scanner scanner = null;
		int numN = 0;
		int numT = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numT = scanner.nextInt();

			int[] costArray = new int[numN];
			int[] timeArray = new int[numN];
			int minCost = Integer.MAX_VALUE;
			for (int i = 0; i < numN; i++) {
				costArray[i] = scanner.nextInt();
				timeArray[i] = scanner.nextInt();
				if (numT >= timeArray[i] && minCost > costArray[i]) {
					minCost = costArray[i];
				}
			}

			if (minCost == Integer.MAX_VALUE) {
				System.out.println("TLE");
			} else {
				System.out.println(minCost);
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC11X_C() {
		Scanner scanner = null;
		int lineAB = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println();

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC11X_D() {
		Scanner scanner = null;
		int lineAB = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println();

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}