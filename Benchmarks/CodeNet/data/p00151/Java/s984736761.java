
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0) {
				break;
			}
			int max = 0;
			int[][][] map = new int[n + 1][n + 2][4];
			for (int i = 1; i < n + 1; i++) {
				char[] line = scanner.next().toCharArray();
				for (int j = 1; j < n + 1; j++) {
					int a = line[j - 1] - '0';
					if (a == 1) {
						map[i][j][0] = map[i - 1][j - 1][0] + 1;
						map[i][j][1] = map[i - 1][j][1] + 1;
						map[i][j][2] = map[i - 1][j + 1][2] + 1;
						map[i][j][3] = map[i][j - 1][3] + 1;
						for (int k = 0; k < 4; k++) {
							max = Math.max(max, map[i][j][k]);
						}

					}
				}
			}
			System.out.println(max);
		}
	}
}