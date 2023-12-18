
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			
			int[][]	a = new int[n + 1][n + 1];
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
					sum += a[i][j];
				}
				a[i][n] = sum;
			}
			
			for (int j = 0; j <= n; j++) {
				int sum = 0;
				for (int i = 0; i < n; i++) {
					sum += a[i][j];
				}
				a[n][j] = sum;
			}
			
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n; j++) {
					System.out.printf("%5d", a[i][j]);
				}
				System.out.println();
			}
			
		}
	}
}