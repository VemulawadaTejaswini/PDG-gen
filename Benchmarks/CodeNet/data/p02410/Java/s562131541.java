import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int A[][] = new int[n][m];
		int b[] = new int[m];
		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			b[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				c[i] = A[i][j] * b[j] + c[i];
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(c[i]);
		}

	}
}

