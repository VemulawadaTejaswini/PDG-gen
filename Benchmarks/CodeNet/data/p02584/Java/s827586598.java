import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		long min1 = x % d;
		if(min1 < 0)
			min1 += d;
		long min2 = min1 - d;
		long ans = Long.MAX_VALUE / 2;
		if(Math.abs(x - min1) / d <= k && Math.abs(x - min1) / d % 2 == k % 2) {
			ans = min1;
		}
		if(Math.abs(x - min2) / d <= k && Math.abs(x - min2) / d % 2 == k % 2) {
			ans = Math.abs(min2);
		}

		ans = Math.min(ans, Math.abs(x - k * d));


		sc.close();
		System.out.println(ans);

	}
}

