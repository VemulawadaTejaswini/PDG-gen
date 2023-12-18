import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[1000];
		while (true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int p = sc.nextInt();
			if (m == 0) {
				break;
			}
			int sum = 0;
			for (int i = 0; i < m; i++) {
				x[i] = sc.nextInt();
				sum += x[i];
			}
			int gold = 100 * sum;
			int haito;
			if (x[n - 1] == 0) {
				System.out.println(0);
			} else {
				haito = gold * (100 - p) / 100 / x[n - 1];
				System.out.println(haito);
			}
		}

	}
}