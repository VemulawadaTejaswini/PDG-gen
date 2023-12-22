import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt()-1;
		int h = scanner.nextInt()-1;
		int n = scanner.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] a = new int[n];
		String[][] s = new String[w + 1][h + 1];

		for (int i = 0; i < n; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
			a[i] = scanner.nextInt();

		}

		for (int k = 0; k < n; k++) {
			if (a[k] == 1) {
				for (int i = 0; i <= h; i++) {
					for (int j = 0; j < x[k]; j++) {
						s[j][i] = "B";
					}
				}
			} else if (a[k] == 2) {
				for (int i = 0; i <= h; i++) {
					for (int j = x[k]; j <= w; j++) {
						s[j][i] = "B";
					}
				}
			} else if (a[k] == 3) {
				for (int i = 0; i < y[k]; i++) {
					for (int j = 0; j <= w; j++) {
						s[j][i] = "B";
					}
				}
			} else if (a[k] == 4) {
				for (int i = y[k]; i <= h; i++) {
					for (int j = 0; j <= w; j++) {
						s[j][i] = "B";
						
					}
				}
			}
		}

		int ans = 0;
		for (int i = 0; i <= h; i++) {
			for (int j = 0; j <= w; j++) {
				if (s[j][i] == null) {
					ans++;
				}
			}
		}

		System.out.println(ans);

	}
}
