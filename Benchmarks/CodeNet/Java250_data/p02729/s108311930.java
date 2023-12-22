import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			int n = scanner.nextInt();
			int m = scanner.nextInt();

			int[][] combination = combination();

			int N = 0;
			int M = 0;

			if (n >= 2) {
				N = combination[n][2] % 1000000007;
			}

			if (m >= 2) {
				M = combination[m][2] % 1000000007;
			}

			int RES = N + M;

			System.out.println(RES);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int[][] combination() {
		int combination[][] = new int[1001][1001];
		for (int i = 0; i < 1001; i++)
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					combination[i][j] = 1;
				else
					combination[i][j] = combination[i - 1][j - 1] % 1000000007 + combination[i - 1][j] % 1000000007;
			}
		return combination;
	}
}