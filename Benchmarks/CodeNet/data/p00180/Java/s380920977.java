
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (n == 0 && m == 0)
				break;
			int[][] map = new int[m][3];
			for (int i = 0; i < m; i++) {
				map[i][0] = scanner.nextInt();
				map[i][1] = scanner.nextInt();
				map[i][2] = scanner.nextInt();
			}
			Arrays.sort(map, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[2] - o2[2];
				}
			});
			int[] p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = i;
			}
			int ans = 0;
			for (int i = 0; i < m; i++) {
				int a = root(map[i][0], p);
				int b = root(map[i][1], p);
				if (a != b) {
					ans += map[i][2];
					p[a] = b;
				}
			}
			System.out.println(ans);
		}
	}

	private static int root(int a, int[] p) {
		if (a == p[a]) {
			return a;
		} else {
			return root(p[a], p);
		}
	}
}