import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		long list[] = new long[n + 1];

		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				list[i] = 2;
			} else if (i == 1) {
				list[i] = 1;
			} else {
				list[i] = list[i - 2] + list[i - 1];
			}
		}

		System.out.print(list[n]);

	}

}
