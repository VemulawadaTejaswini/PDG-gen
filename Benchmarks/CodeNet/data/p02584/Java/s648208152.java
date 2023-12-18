import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();

		long ans;

		if (Math.abs(x) > k * d) {
			ans = Math.abs(x) - k * d;
		} else {
			long tmp = Math.abs(x) % d;
			long remain = k - Math.abs(x) / d;

			if (remain % 2 == 0) {
				if (d - tmp < tmp) {
					ans = d - tmp;
				} else {
					ans = tmp;
				}
			} else {
				if (d - tmp < tmp) {
					ans = d - tmp;
				} else {
					ans = tmp;
				}
				ans = d - ans;
			}
		}

		System.out.println(ans);

		sc.close();
	}

}