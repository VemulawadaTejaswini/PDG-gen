
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int result = 1;
			for (int i = 0; i < m; i++) {
				result *= 2;
			}
			result *= (1900 * m + 100 * (n - m));


			System.out.println(result);

		}
	}
}
