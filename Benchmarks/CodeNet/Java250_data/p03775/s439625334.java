import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= Math.sqrt(n); i++) {
		    if (n % i == 0) {
		        min = Math.min(min, function(i, n / i));
		    }
		}
		System.out.println(min);
	}
	
	static int function(long a, long b) {
	    return Math.max(getCount(a), getCount(b));
	}
	
	static int getCount(long x) {
	    int ans = 0;
	    while (x > 0) {
	        ans++;
	        x /= 10;
	    }
	    return ans;
	}
}
