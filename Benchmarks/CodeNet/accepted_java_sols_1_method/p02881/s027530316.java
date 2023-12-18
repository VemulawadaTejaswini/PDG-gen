import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		double d = Math.sqrt(n);

		long ans1 = 0;
		long ans2 = 0;

		for (long i = (long) d; i > 0; i--) {

			double tmp = (double) n / i;
			if (tmp == (long) tmp) {

				ans1 = (long) tmp;
				ans2 = i;
				break;

			}
		}

		long ans = ans1 + ans2 - 2;

		System.out.println(ans);

	}

}