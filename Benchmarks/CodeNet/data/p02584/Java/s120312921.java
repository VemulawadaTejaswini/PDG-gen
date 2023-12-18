import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();

		long ans = 0;
		long xx = Math.abs(x);
		if (xx - k * d >= d) {
			ans = xx - k * d;
		} else {
			ans = xx % d;
			k = k - (long)Math.floor(xx / d);
			if (k % 2 == 1) {
				if(x >= 0) {
				ans = Math.abs(d - ans);
				}else {
					ans = Math.abs(d + ans);
					
				}
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
