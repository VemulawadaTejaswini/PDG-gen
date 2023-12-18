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

			//System.out.println("REMAIN:" + remain);

			if (d - tmp < tmp) {
				ans = d - tmp;
				remain--;
			} else {
				ans = tmp;
			}

			if (remain != 0 && remain % 2 == 1) {
				ans = d - ans;
			}

		}

		System.out.println(ans);

		sc.close();
	}

}