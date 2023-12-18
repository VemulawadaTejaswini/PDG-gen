import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count[][][] = new int[5][4][11];

		// ?????????
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 10; k++) {
					count[i][j][k] = 0;
				}
			}
		}

		// ??????
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			count[b][f][r] += v;
		}

		// ??????
		for (int i = 1; i < 5; i++) {
			if (i != 1) {
				for (int x = 1; x < 21; x++) {
					if (x != 20) {
						System.out.print("#");
					} else {
						System.out.println("#");
					}
				}
			}
			for (int j = 1; j < 4; j++) {
				for (int k = 1; k < 11; k++) {
					if (k != 10) {
						System.out.print(" " + count[i][j][k]);
					} else {
						System.out.println(" " + count[i][j][k]);
					}
				}
			}

		}

	}

}