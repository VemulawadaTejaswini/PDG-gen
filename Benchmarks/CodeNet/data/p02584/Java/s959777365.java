import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();

		long ans;
		x = Math.abs(x);

		if (x >= k * d) {
			ans = x - k * d;
		} else {
			long tmp = x % d;
			long remain = k - x / d;

			if (remain % 2 == 0) {
				ans = tmp;
			} else {
				ans = Math.abs(tmp - d);
			}

		}

		System.out.println(ans);

		sc.close();
	}

}