import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		int[] a = new int[3];
		int[] b = new int[3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = sc.nextInt();
			}
		}

		// Initialize a & b
		for (int i = 0; i < 3; i++) {
			int max = 0;
			for (int j = 0; j < 3; j++) {
				max = Math.max(c[i][j], max);
			}
			a[i] = max;
		}
		for (int j = 0; j < 3; j++) {
			int max = 0;
			for (int i = 0; i < 3; i++) {
				max = Math.max(c[i][j], max);
			}
			b[j] = max;
		}

		while (true) {
			if (check(a, b, c)) {
				System.out.println("Yes");
				return;
			}

			for (int i = 0; i < 3; i++) {
				boolean[] bigger = new boolean[3];
				for (int j = 0; j < 3; j++) {
					bigger[j] = (a[i] + b[j] > c[i][j]);
				}
				if (bigger[0] == bigger[1] && bigger[1] == bigger[2]) {
					if (bigger[0]) {
						a[i]--;
					}
				}
			}
			for (int j = 0; j < 3; j++) {
				boolean[] bigger = new boolean[3];
				for (int i = 0; i < 3; i++) {
					bigger[i] = (a[i] + b[j] > c[i][j]);
				}
				if (bigger[0] == bigger[1] && bigger[1] == bigger[2]) {
					if (bigger[0]) {
						b[j]--;
					}
				} else {
					System.out.println("No");
					return;
				}
			}
		}
	}

	private static boolean check(int[] a, int[] b, int[][] c) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (c[i][j] != a[i] + b[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
