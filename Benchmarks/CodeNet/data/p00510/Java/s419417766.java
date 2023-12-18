import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		tunnel(n, m);
		sc.close();
	}

	private static void tunnel(int n, int m) {
		int c = m;
		int in = 0;
		int out = 0;
		int max = m;

		for (int i = 0; i < n; i++) {
			in = sc.nextInt();

			out = sc.nextInt();

			c += in - out;

			max = Math.max(max, c);


				if (c < 0) {
					max = 0;
					break;
				}

		}

		System.out.println(max);
	}

}

