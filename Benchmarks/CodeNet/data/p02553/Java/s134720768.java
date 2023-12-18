import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		solve(a, b, c, d);
	}

	private static void solve(long a, long b, long c, long d) {
		// TODO Auto-generated method stub
		long ans = Long.MIN_VALUE;
		ans = Math.max(ans, a * c);
		ans = Math.max(ans, b * d);
		for (long i = b; i >= a; i--) {
			for (long j = d; j >= c; j--) {
				long t = i * j;
				if (ans > t) break;
				else {
					ans = Math.max(ans, t);
				}
			}
		}
		System.out.println(ans);
	}

}
