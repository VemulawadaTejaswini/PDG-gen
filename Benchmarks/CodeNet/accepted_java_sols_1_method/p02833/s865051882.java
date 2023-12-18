import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		if (n % 2 == 0) {
		    for (long i = 10; i <= n; i *= 5) {
		        ans += n / i;
		    }
		} else {
		    ans = 0;
		}
		System.out.println(ans);
   }
}
