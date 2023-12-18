import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a_n = new int[n];

			for (int i = 0; i < n; i++) {
				a_n[i] = sc.nextInt();
			}

		int lcm = lcm(a_n[0], a_n[1]);

			for (int i = 2; i < n ; i++) {
				lcm = lcm(lcm, a_n[i]);
			}

			System.out.println(lcm);

		sc.close();

	}

	private static int lcm(int i, int j) {
		int lcm = i * j / gcd(i, j);
		return lcm;
	}

	private static int gcd(int x, int y) {
		int x_tmp = 0;

		do {
			x_tmp = x;

			x = y;
			y = x_tmp % y;
		}while(y > 0);

		return x;
	}

}
