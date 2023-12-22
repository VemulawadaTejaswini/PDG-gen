import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		boolean canK = false;

		outer:
		for (int row = 0; row <= n; row++) {
			for (int clm = 0; clm <= m ; clm++) {
				int black = (m - clm) * row + (n - row) * clm;
				if (black == k) {
					canK = true;
					break outer;
				}
			}
		}

		System.out.println(canK ? "Yes" : "No");
		sc.close();
	}

}
