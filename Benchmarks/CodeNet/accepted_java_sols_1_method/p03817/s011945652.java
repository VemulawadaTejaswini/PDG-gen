import java.util.*;

public class Main {
	static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = n / 11 * 2;
		long mod = n % 11;
		if (mod > 6) {
			ans += 2;
		} else if (mod > 0) {
			ans++;
		}
		System.out.println(ans);
	}
}
