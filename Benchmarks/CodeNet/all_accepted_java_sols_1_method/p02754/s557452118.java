import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();
		// aがnより大きいパタン
		if (a > n) {
			System.out.println(n);
		}
		// a+bがnより以上のパタン
		else if ((a + b) >= n) {
			System.out.println(a);
		}
		// a+bがn以下のパタン
		else {
			long ab = a + b;
			long count = n / ab;
			long remainder = n % ab;
			long ans = a * count;
			if (remainder >= a) {
				ans = ans + a;
			} else {
				ans = ans + remainder;
			}
			System.out.println(ans);
		}
	}
}
