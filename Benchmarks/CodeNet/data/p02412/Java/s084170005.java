import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int x;
		while (true) {
			n = sc.nextInt();
			x = sc.nextInt();
			if (n == 0 && x == 0)
				break;
			calcWays(n, x);
		}

	}

	public static void calcWays(int n, int x) {
		int ways = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					if (i > j && j > k && i + j + k == x) {
						ways++;
					}
				}
			}
		}
		System.out.println(ways);
	}
}