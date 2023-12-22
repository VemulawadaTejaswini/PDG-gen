
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int result = 0;

			for (int i = 105; i <= n; i++) {
				if (i % 2 == 0) {
					continue;
				}
				int count = 0;
				for (int j = 1; j <= i; j+=2) {
					if (i % j == 0) {
						count++;
					}
				}
				if (8 <= count) {
					result++;
				}
			}

			System.out.println(result);
		}
	}
}
