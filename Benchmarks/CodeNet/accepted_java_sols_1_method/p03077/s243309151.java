import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		long n = stdin.nextLong();
		long x = Long.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			long l = stdin.nextLong();
			if (l < x) {
				x = l;
			}
		}
		if ((double) n / x <= 1) {
			System.out.println(5);
		} else {
			if (n % x == 0) {
				System.out.println(4 + n / x);
			} else {
				System.out.println(5 + n / x);
			}
			;
		}
	}

}
