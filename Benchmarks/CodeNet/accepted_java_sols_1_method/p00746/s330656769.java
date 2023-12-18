import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] nn = new int[200];
		int[] d = new int[200];

		int[][] field = new int[420][420];

		int w;
		int h;
		int blockNum;

		while (true) {
			int n = scan.nextInt();

			if (n == 0)
				break;

			w = 1;
			h = 1;

			int minW = 500;
			int maxW = 0;
			int minH = 500;
			int maxH = 0;

			for (int i = 0; i < 420; i++) {
				Arrays.fill(field[i], -1);
			}

			blockNum = 0;

			field[210][210] = blockNum;

			for (int i = 0; i < n - 1; i++) {
				nn[i] = scan.nextInt();
				d[i] = scan.nextInt();
			}

			for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < 420; j++) {
					for (int k = 0; k < 420; k++) {
						if (field[j][k] == nn[i]) {
							if (d[i] == 0) {
								field[j][k - 1] = blockNum + 1;
							}
							if (d[i] == 1) {
								field[j + 1][k] = blockNum + 1;
							}
							if (d[i] == 2) {
								field[j][k + 1] = blockNum + 1;
							}
							if (d[i] == 3) {
								field[j - 1][k] = blockNum + 1;
							}
							blockNum++;
						}
					}
				}
			}

			for (int i = 0; i < 420; i++) {
				for (int j = 0; j < 420; j++) {
					if (field[i][j] != -1 && minW > j) {
						minW = j;
						break;
					}
				}
			}

			for (int i = 0; i < 420; i++) {
				for (int j = 419; j >= 0; j--) {
					if (field[i][j] != -1 && maxW < j) {
						maxW = j;
						break;
					}
				}
			}
			for (int i = 0; i < 420; i++) {
				for (int j = 0; j < 420; j++) {
					if (field[j][i] != -1 && minH > j) {
						minH = j;
						break;
					}
				}
			}
			for (int i = 0; i < 420; i++) {
				for (int j = 419; j >= 0; j--) {
					if (field[j][i] != -1 && maxH < j) {
						maxH = j;
						break;
					}
				}
			}

			w = maxW - minW + 1;
			h = maxH - minH + 1;
			System.out.println(w + " " + h);
		}

		scan.close();
	}
}