import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(gcd(a, b));

		scan.close();
		System.exit(0);
	}

	private static int gcd(int a, int b) {
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}