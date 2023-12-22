import java.util.Scanner;

public class Main {

	public static void main(String... nui) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt();

		System.out.println((a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) ? "Possible" : "Impossible");

	}

}