import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 0;
		int sum = 0;

		for (int i = 1; i <= N; i++) {

			if (i % 2 == 0) {
				continue;
			}

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 8) {
				sum++;
			}
			count = 0;
		}

		System.out.print(sum);
	}
}