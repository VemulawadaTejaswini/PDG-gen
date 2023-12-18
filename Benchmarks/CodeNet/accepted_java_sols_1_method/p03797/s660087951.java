import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long ans;
		if (n <= m / 2) {
		    ans = n;
		    m -= 2 * n;
		    ans += m / 4;
		} else {
		    ans = m / 2;
		}
		System.out.println(ans);
	}
}
