
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int result = 0;

			for (int a = 1; a < n; a++) {
				for (int b = 1; a * b < n; b++) {
					result++;
				}
			}
			System.out.println(result);
		}
	}
}
