import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		solve(a, b);

	}

	static void solve(int a, int b) {

		switch (a) {
		case 0:
			if (b == 100) {
				System.out.println(b + 1);
			} else {
				System.out.println(b);
			}
			break;
		case 1:
			int c = 100 * b;
			if (c == 10000) {
				System.out.println(c + 100);
			} else {
				System.out.println(c);
			}
			break;
		case 2:
			int d = 10000 * b;
			if (d == 1000000) {
				System.out.println(d + 10000);
			} else {
				System.out.println(d);
			}
			break;
		default:
			break;
		}
	}
}