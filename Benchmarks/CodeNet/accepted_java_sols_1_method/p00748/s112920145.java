import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int MAX = 1000000;
		int[][] ans = new int[2][MAX];
		Arrays.fill(ans[0], MAX * 2);
		Arrays.fill(ans[1], MAX * 2);
		ans[0][0] = ans[1][0] = 0;
		for (int i = 1;; ++i) {
			int tetra = i * (i + 1) * (i + 2) / 6;
			if (tetra >= MAX) break;
			for (int j = 0; j + tetra < MAX; ++j) {
				ans[0][j + tetra] = Math.min(ans[0][j] + 1, ans[0][j + tetra]);
			}
			if (tetra % 2 != 0) {
				for (int j = 0; j + tetra < MAX; ++j) {
					ans[1][j + tetra] = Math.min(ans[1][j] + 1, ans[1][j + tetra]);
				}
			}
		}
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			System.out.println(ans[0][N] + " " + ans[1][N]);
		}
	}
}