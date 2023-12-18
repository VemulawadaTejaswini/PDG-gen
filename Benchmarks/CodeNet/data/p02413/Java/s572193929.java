import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();

		int[][] Aay_rc;
		Aay_rc = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				Aay_rc[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(Aay_rc[i][j] + " ");
			}

			int sum_r = 0;
			for (int k = 0; k < c; k++) {
				sum_r = sum_r + Aay_rc[i][k];
			}
			System.out.println(sum_r);
		}

		int sum_all = 0;
		for (int L = 0; L < c; L++) {
			int sum_c = 0;
			for (int m = 0; m < r; m++) {
				sum_c = sum_c + Aay_rc[m][L];
				sum_all = sum_all + Aay_rc[m][L];
			}
			System.out.print(sum_c + " ");
		}
		System.out.println(sum_all);
	}
}