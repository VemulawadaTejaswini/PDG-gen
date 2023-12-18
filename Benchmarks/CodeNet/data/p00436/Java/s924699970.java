import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int card[] = new int[2 * n];
		int card2[] = new int [2 * n];
		int m = scanner.nextInt();
		int k;
		
		for (int i = 0; i < 2 * n; i++) {
			card[i] = i + 1;
		}
		for (int i = 0; i < m; i++) {
			k = scanner.nextInt();
			if (k == 0) {
				for (int j = 0; j < n; j++) {
					card2[2 * j]    = card[j];
					card2[2 * j + 1] = card[j + n];
				}
				for (int j = 0; j < 2 * n; j++) {
					card[j] = card2[j];
				}
			} else {
				for (int j = 0; j < k; j++) {
					card2[j] = card[j];
				}
				for (int j = 0; j < 2 * n - k; j++) {
					card[j] = card[k + j];
				}
				for (int j = 0; j < k; j++) {
					card[j + (2 * n - k)] = card2[j];
				}
			}
		}
		for (int i = 0; i < 2 * n; i++) {
			System.out.println(card[i]);
		}
	}
}