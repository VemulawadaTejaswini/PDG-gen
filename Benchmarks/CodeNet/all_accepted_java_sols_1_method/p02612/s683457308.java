import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in);) {

			final long n = sc.nextLong();

			long ceil = (long) (n/1000);
			if(ceil*1000<n) {
				ceil++;
			}
			System.out.println((ceil*1000)-n);
		}
	}
}