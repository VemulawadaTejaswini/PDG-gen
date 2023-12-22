import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long ans = 0;
		if(n >= 1 && m >= 2) {
			if(n <= m / 2) {
				ans += Math.min(n, m) + (m - 2 * n) / 4;
			} else {
				ans += Math.min(n, m / 2);
			}
		} else if(n == 0 && m >= 4) {
			ans += m / 4;
		} else {
			ans = 0;
		}
		System.out.println(ans);
	}
}
