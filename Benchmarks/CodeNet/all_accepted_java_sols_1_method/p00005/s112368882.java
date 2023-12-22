import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (stdIn.hasNext()) {
			long a = stdIn.nextLong();
			long b = stdIn.nextLong();
			long c = 0;
			long d = a * b;
			if (a < b) {
				outside: for (;;) {
					c = b % a;
					if (c == 0)
						break outside;
					b = a;
					a = c;

				}
				c = a;
			} else {
				outside: for (;;) {
					c = a % b;
					if (c == 0)
						break outside;
					a = b;
					b = c;

				}
				c = b;
			}
			System.out.println(c + " " + d/c);
		}
	}
}