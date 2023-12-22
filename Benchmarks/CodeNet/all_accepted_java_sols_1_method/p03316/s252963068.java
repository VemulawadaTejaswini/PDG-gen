
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		int n2 = 0;
		final String nStr[] = String.valueOf(n).split("");

		for (final String item : nStr) {
			n2 = n2 + Integer.parseInt(item);
		}

		if (n % n2 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
