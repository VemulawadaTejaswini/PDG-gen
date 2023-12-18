import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, sum, count = 0;
		int n, x;
		while (true) {
			n = sc.nextInt();
			x = sc.nextInt();
			if (n == 0 & x == 0)
				break;
			for (i = 1; i <= n - 2 ; i++) {
				for (j = i +1; j <= n - 1 ; j++) {
					for (k = j + 1; k <= n; k++) {
							sum = i + j + k;
							if (sum == x)
								count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}