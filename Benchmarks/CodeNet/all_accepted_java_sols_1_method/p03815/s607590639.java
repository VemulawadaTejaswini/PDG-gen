import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long x = scanner.nextLong();
			long remander = x % 11L;
			System.out.println(x / 11L * 2L + ((remander == 0) ? 0 : (remander > 6) ? 2 : 1));
		}
	}
}
