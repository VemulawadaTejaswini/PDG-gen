
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int length = Integer.toString(n).length();
			int result = 0;

			if (1 < length) {
				result += 9;
			}
			if (3 < length) {
				result += 900;
			}
			if (5 < length) {
				result += 90000;
			}

			if (1 == length) {
				System.out.println(n);
				return;
			}
			if (3 == length) {
				result += n - 100 + 1;
			}
			if (5 == length) {
				result += n - 10000 + 1;
			}
			System.out.println(result);
		}
	}
}
