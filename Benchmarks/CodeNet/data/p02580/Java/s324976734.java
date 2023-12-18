import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int M = sc.nextInt();
			int[] h = new int[H];
			int[] w = new int[W];
			boolean[][] map = new boolean[H][W];
			for (int i = 0; i < M; i++) {
				int tmph = sc.nextInt() - 1;
				int tmpw = sc.nextInt() - 1;
				h[tmph]++;
				w[tmpw]++;
				map[tmph][tmpw] = true;
			}
			int max = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					int tmp = h[i] + w[j];
					if (map[i][j]) {
						tmp--;
					}
					max = Math.max(max, tmp);
				}
			}
			System.out.println(max);
		}
	}
}