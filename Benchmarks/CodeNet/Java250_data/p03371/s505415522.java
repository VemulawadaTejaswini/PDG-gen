
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		String topping = "";

		try {
			scanner = new Scanner(System.in);
			topping = scanner.next();

			int res = 700;

			for (int i = 0; i < topping.length(); i++) {
				switch (topping.charAt(i)) {
				case 'o':
					res += 100;
					break;
				case 'x':
					break;

				}
			}

			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numN = 0;
		int numX = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numX = scanner.nextInt();

			int[] wk = new int[numN];

			int res = 0;
			for (int i = 0; i < numN; i++) {
				wk[i] = scanner.nextInt();
				res++;
				numX -= wk[i];
			}

			Arrays.sort(wk);

			boolean isExit = false;
			while (!isExit) {
				if (numX >= wk[0]) {
					numX -= wk[0];
					res++;
				} else {
					isExit = true;
				}
			}

			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {
		Scanner scanner = null;
		int numA = 0;
		int numB = 0;
		int numC = 0;
		int numX = 0;
		int numY = 0;

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();
			numC = scanner.nextInt();
			numX = scanner.nextInt();
			numY = scanner.nextInt();

			int sabun1 = Math.min(numX, numY);

			int res = 0;
			if (numA + numB >= numC * 2) {
				res += sabun1 * (numC * 2);
			} else if (numA + numB < numC * 2) {
				res += sabun1 * (numA + numB);
			}

			if (numX > numY) {
				if (numA <= numC * 2) {
					res += (numX - sabun1) * numA;
				} else {
					res += (numX - sabun1) * (numC * 2);
				}
			} else if (numX < numY) {
				if (numB <= numC * 2) {
					res += (numY - sabun1) * numB;
				} else {
					res += (numY - sabun1) * (numC * 2);
				}
			}

			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private int getCalo(int currentI, int nextI, int currentCal) {
		if (currentCal <= 0) {
			return 0;
		}

		int res = 0;
		if (wk[nextI][1] > (wk[nextI][0] - wk[currentI][0])) {
			res = getCalo(currentI, nextI + 1, currentCal);
		} else {
			int res1 = getCalo(currentI, nextI + 1, currentCal);
			int res2 = getCalo(nextI, nextI + 1, currentCal + (wk[nextI][0] - wk[currentI][0]) + wk[nextI][1])
					+ wk[nextI][1];
			res = Math.max(res1, res2);
		}
		return res;

	}

	private int numN = 0;
	private int numC = 0;

	private int[][] wk = null;
	private int[][] resWk = null;

	private void solveD() {
		Scanner scanner = null;
		numN = 0;
		numC = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numC = scanner.nextInt();

			wk = new int[numN][2];
			resWk = new int[numN + 1][2 + 1];
			for (int i = 0; i < numN; i++) {
				wk[i][0] = scanner.nextInt();
				wk[i][1] = scanner.nextInt();
			}

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}