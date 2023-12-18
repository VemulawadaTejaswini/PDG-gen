import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[] triple = new boolean[n];
		for (int i = 0; i < m; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();

			for (int j = c; j < d; j++) {
				triple[j] = true;
			}
		}

		int ans = 0;
		for (int i = 0; i < triple.length; i++) {
			if (triple[i]) {
				ans += 2;
			}
		}

		System.out.println(ans + n + 1);
		sc.close();

	}

}