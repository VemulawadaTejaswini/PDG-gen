


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int t = 0;
		int room[][][] = new int[4][3][10];
		int f = 0;
		int n = 0;
		int h = 0;
		for (int i = 0; i < 4; i++) {
			for (int c = 0; c < 3; c++) {
				for (int q = 0; q < 10; q++) {
					room[i][c][q] = 0;
				}
			}
		}
		for (int w = 0; w < num; w++) {
			t = scanner.nextInt();
			f = scanner.nextInt();
			n = scanner.nextInt();
			h = scanner.nextInt();
			room[t - 1][f - 1][n - 1] = room[t - 1][f - 1][n - 1]+h;
		}
		for (int i = 0; i < 4; i++) {
			for (int c = 0; c < 3; c++) {
				for (int q = 0; q < 10; q++) {
					System.out.print(" " + room[i][c][q]);
				}
				System.out.println();
			}
			if (i < 3) {
				System.out.println("####################");

			}
		}

	}
}

