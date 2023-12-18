import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in);) {

			final long n = sc.nextLong();

			final long ceil = (long) (n/1000) + 1L;
			System.out.println((ceil*1000)-n);
		}
	}
}