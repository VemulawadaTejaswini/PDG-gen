
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			long m = sc.nextLong();

			long max = m / n;

			for (long i = max; 0 < i; i--) {
				if (m % i == 0) {
					System.out.println(i);
					return;
				}
			}
		}
	}
}
