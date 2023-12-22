import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[2][n];

		for (int i = 0; i < n; i++) {
			a[0][i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			a[1][i] = sc.nextInt();
		}

		int max = 0;
		int first = 0;
		for (int i = 0; i < n; i++) {
			first += a[0][i];
			int second = 0;
			for (int j = i; j < n; j++) {
				second += a[1][j];
			}
			max = Math.max(max, first + second);
		}

		System.out.println(max);

		sc.close();

	}

}