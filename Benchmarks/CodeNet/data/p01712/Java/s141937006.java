import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();// 親機の数
		int W = scanner.nextInt();
		int H = scanner.nextInt();

		int[] width = new int[W + 1];
		int[] height = new int[H + 1];
		for (int i = 0; i < N; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int w = scanner.nextInt();

			int lowx = Math.max(0, x - w);
			int highx = Math.min(W, x + w);

			width[lowx]++;
			width[highx]--;

			int lowy = Math.max(0, y - w);
			int highy = Math.min(H, y + w);

			height[lowy]++;
			height[highy]--;

		}
		scanner.close();

		int cover = 0;
		boolean isCovered = true;
		for (int i = 0; i < W; i++) {
			cover += width[i];
			if (cover <= 0) {
				isCovered = false;
			}
		}

		cover = 0;
		for (int i = 0; i < H; i++) {
			cover += height[i];
			if (cover <= 0 && !isCovered) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");

	}
}