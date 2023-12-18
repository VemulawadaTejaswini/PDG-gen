
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			if (h == 0 && w == 0)
				break;
			int[][] map = new int[h][w + 1];

			int wid;
			int max = 0;
			for (int i = 0; i < h; i++) {
				char[] a = scanner.next().toCharArray();
				for (int j = 1; j < w + 1; j++) {
					if (a[j - 1] == '.') {
						wid = Integer.MAX_VALUE;
						map[i][j] = map[i][j - 1] + 1;
						for (int k = 0; k <= i; k++) {
							wid = Math.min(wid, map[i - k][j]);
							if (wid == 0) {
								break;
							}
							max = Math.max(max, wid * (k + 1));
						}
					}
				}
			}
			System.out.println(max);
		}
	}
}