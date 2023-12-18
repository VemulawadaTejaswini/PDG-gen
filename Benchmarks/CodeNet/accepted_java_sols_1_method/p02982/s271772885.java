import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());

		int[][] num = new int[n][d];
		double pos = 0.0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				num[i][j] = Integer.parseInt(sc.next());
			}
		}

		for (int i = 0; i < n - 1; i++) {
			for (int k = i + 1; k < n; k++) {
				pos = 0.0;
				double tmp = 0.0;
				for (int j = 0; j < d; j++) {
					tmp = Math.abs(num[i][j] - num[k][j]);
					tmp *= tmp;
					pos += tmp;
				}
				if (Math.sqrt(pos) % 1.0 == 0.0) {
					count++;
				}
			}
		}

		System.out.println(count);

	}
}