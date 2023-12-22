import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int[][] h = new int[N][N];
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					h[i][j] = sc.nextInt();
				}
			}
			int[] min = new int[N];
			Arrays.fill(min, Integer.MAX_VALUE);
			int[] max = new int[N];
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					min[i] = Math.min(h[i][j], min[i]);
					max[j] = Math.max(h[i][j], max[j]);
				}
			}
			int ans = 0;
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					if (h[i][j] == min[i] && h[i][j] == max[j] && h[i][j] > ans) ans = h[i][j];
				}
			}
			System.out.println(ans);
		}
	}

}