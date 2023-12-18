import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();

		final String POSITIVE = "Positive";
		final String NEGATIVE = "Negative";
		final String ZERO = "Zero";
		String ans = null;
		if (a > 0) {
			ans = POSITIVE;
		} else if (b >= 0) {
			ans = ZERO;
		} else if ( (b - a) % 2 == 0 ) {
			ans = NEGATIVE;
		} else {
			ans = POSITIVE;
		}
		System.out.println(ans);
	}
}
