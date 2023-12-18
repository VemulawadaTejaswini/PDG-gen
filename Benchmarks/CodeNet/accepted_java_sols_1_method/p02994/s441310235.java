import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int l = sc.nextInt();
		int sum = 0;

		if (l > 0) {
			for (int i = 2; i <= n; i++) {
				sum += l + i - 1;
			}
		} else if (l < (1 - n)) {

			for (int i = 1; i <= n - 1; i++) {
				sum += l + i - 1;
			}
		} else {
			for (int i = 1; i <= n; i++) {
				sum += l + i - 1;
			}
		}

		System.out.println(sum);

	}
}
