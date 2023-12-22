import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long total = 1;
		for (long i = 1; i <= n; i++) {
			total *= i;
			total %= MOD;
		}
		System.out.println(total);
	}
}
