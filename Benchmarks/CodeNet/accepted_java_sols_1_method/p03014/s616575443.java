import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int H = s.nextInt();
			final int W = s.nextInt();

			char[][] map = new char[H][];
			for (int h = 0; h < H; h++) {
				map[h] = s.next().toCharArray();
			}

			int[][] counter = new int[H][W];
			for (int h = 0; h < H; h++) {
				int from = 0;
				int straight = 0;
				for (int w = 0; w < W; w++) {
					if (map[h][w] == '#') {
						for (int i = from; i < w; i++) {
							counter[h][i] = straight;
						}
						from = w + 1;
						straight = 0;
						continue;
					}
					straight++;
				}
				for (int i = from; i < W; i++) {
					counter[h][i] = straight;
				}
			}

			int max = 0;
			for (int w = 0; w < W; w++) {
				int from = 0;
				int straight = 0;
				for (int h = 0; h < H; h++) {
					if (map[h][w] == '#') {
						for (int i = from; i < h; i++) {
							max = Math.max(max, counter[i][w] + straight - 1);
						}
						from = h + 1;
						straight = 0;
						continue;
					}
					straight++;
				}
				for (int i = from; i < H; i++) {
					max = Math.max(max, counter[i][w] + straight - 1);
				}
			}
			System.out.println(max);
		}
	}
}
