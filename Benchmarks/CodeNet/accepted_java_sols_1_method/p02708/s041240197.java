import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long k = sc.nextInt();
		long total = 0;
		for (long i = k; i <= n + 1; i++) {
		    long base = (n + n - i + 1) * i / 2 - (0 +  i - 1) * i / 2 + 1;
		    total += base;
		    total %= MOD;
		}
		System.out.println(total);
   }
}

