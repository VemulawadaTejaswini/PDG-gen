
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			int[][] num = new int[9][9];
			boolean[][] map = new boolean[9][9];
			for (int i = 0; i < 9; i++) {
				int[] x = new int[10];
				for (int j = 0; j < 9; j++) {
					int y = scanner.nextInt();
					num[i][j] = y;
					x[y]++;
				}
				for (int k = 0; k < 9; k++) {
					int c = num[i][k];
					if (x[c] > 1) {
						map[i][k] = true;
					}
				}
			}
			for (int i = 0; i < 9; i++) {
				int[] x = new int[10];
				for (int j = 0; j < 9; j++) {
					int y = num[j][i];
					x[y]++;
				}
				for (int j = 0; j < 9; j++) {
					int c = num[j][i];
					if (x[c] > 1) {
						map[j][i] = true;
					}
				}
			}
			for (int i = 0; i < 9; i += 3) {
				for (int j = 0; j < 9; j += 3) {
					int[] x = new int[10];
					for (int k = i; k < i + 3; k++) {
						for (int l = j; l < j + 3; l++) {
							int y = num[k][l];
							x[y]++;
						}
					}
					for (int k = i; k < i + 3; k++) {
						for (int l = j; l < j + 3; l++) {
							int c = num[k][l];
							if (x[c] > 1) {
								map[k][l] = true;
							}
						}
					}
				}
			}
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(map[i][j] ? "*" : " ");
					System.out.print(num[i][j]);
				}
				System.out.println();
			}
		}
	}
}