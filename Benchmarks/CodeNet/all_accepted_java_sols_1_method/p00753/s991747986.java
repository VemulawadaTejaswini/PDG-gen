import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;

			int number = n - 1;

			for (int k = n + 1; k <= (2 * n) - 1; k++) {
				for (int d = 2; d <= Math.sqrt(k); d++) {
					if (k % d == 0) {
						number--;
						break;
					}
				}

			}
			if (n == 1)
				number = 1;
			System.out.println(number);
		}

	}

}
