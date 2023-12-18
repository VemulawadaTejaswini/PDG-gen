import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int[][] multi;
	static int[] matR;
	static int[] matC;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int n = scan.nextInt();
		multi = new int[n][n];
		matR = new int[n];
		matC = new int[n];

		for (int i = 0; i < n; i++) {
			matR[i] = scan.nextInt();
			matC[i] = scan.nextInt();
		}

		System.out.println(Mat(0, n - 1));

		scan.close();
		System.exit(0);
	}

	private static int Mat(int fr, int to) {
		if (fr == to)
			return 0;
		if (multi[fr][to] == 0) {
			int min = Integer.MAX_VALUE;
			for (int i = fr; i < to; i++) {
				int r = Mat(fr, i) + Mat(i + 1, to) + (matR[fr] * matC[i] * matC[to]);
				if (r < min)
					min = r;
			}
			multi[fr][to] = min;
		}
		return multi[fr][to];
	}
}