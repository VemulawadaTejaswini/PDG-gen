import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static int m = sc.nextInt();
	public static void main(String[] args) {
		tunnel();

	}

	private static void tunnel() {
		int c = m;

		for (int i = 0; i < n; i++) {
			int in = sc.nextInt();
			int out = sc.nextInt();
			int v = in - out;

			c += v;

				if (c < 0) {
					c = 0;
					break;
				}
				System.out.println(c);

		}

		System.out.println(c);
	}

}
