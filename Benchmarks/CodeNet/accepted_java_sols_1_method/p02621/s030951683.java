import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in);) {
			final int a = sc.nextInt();
			System.out.println(a*(1+a + a*a));

		}
	}
}