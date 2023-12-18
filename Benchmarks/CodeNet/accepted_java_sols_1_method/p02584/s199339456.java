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
		long sa1 = Math.abs(x - min1) / d % 2;
		if(sa1 < 0)
			sa1 += 2;
		long sa2 = Math.abs(x - min2) / d % 2;
		if(sa2 < 0)
			sa2 += 2;
		if(Math.abs(x - min1) / d <= k && sa1 == k % 2) {
			ans = Math.abs(min1);
		}
		if(Math.abs(x - min2) / d <= k && sa2 == k % 2) {
			ans = Math.abs(min2);
		}
		long ans2 = 0;
		if(x >= 0) {
			ans2 = Math.abs(x - k * d);
		}
		else {
			ans2 = Math.abs(x + k * d);
		}

		ans = Math.min(ans, ans2);


		sc.close();
		System.out.println(ans);

	}
}

