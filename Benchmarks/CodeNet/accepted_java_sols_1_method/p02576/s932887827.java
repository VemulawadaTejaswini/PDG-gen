
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int t = sc.nextInt();

			if (n % x != 0) {
				System.out.println(((n / x) + 1) * t);
			} else {
				System.out.println((n/x) * t);
			}
		}
	}
}
