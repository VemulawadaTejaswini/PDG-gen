
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			StringBuilder result = new StringBuilder();
			long tmp = 0;
			do {
				tmp = n % 26;
				result.append((char)('a' + tmp - 1));
				n /= 26;
			} while(1 <= n);
			System.out.println(result.reverse().toString());
		}
	}
}
