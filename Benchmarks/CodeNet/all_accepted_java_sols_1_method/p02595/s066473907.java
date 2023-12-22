
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int result = 0;

			for (int i = 0; i < n; i++) {
				long x = sc.nextInt();
				long y = sc.nextInt();
				if (Math.sqrt((x * x) + (y * y)) <= d) {
					result++;
				}
			}
			System.out.println(result);
		}
	}
}
