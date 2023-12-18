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
		int sum = x;
		int ways = 0;
		int tempJ, tempK = 0;
		int i, j, k = 0;
		for (i = 1; i < n; i++) {
			sum = x;
			sum -= i;
			if (sum <= 0)
				break;
			for (j = i + 1, tempJ = sum; j < n; j++) {
				sum = tempJ;
				sum -= j;
				if (sum <= 0)
					break;
				for (k = i + 2, tempK = sum; k < n; k++) {
					sum -= k;
					if (sum == 0) {
						ways++;
						break;
					} else {
						sum = tempK;
					}
				}
			}
		}
		System.out.println(ways);
	}
}