import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	long b = sc.nextLong();
	long c = sc.nextLong();
	long d = sc.nextLong();
	long cd = lcm(c,d);
	System.out.print(b-a+1-(b/c - (a-1)/c + b/d - (a-1)/d - b/cd + (a-1)/cd));
    }
    static long gcd(long m, long n) {
	if (m < n) {
	    long tmp = m;
	    m = n;
	    n = tmp;
	}
	long rem = 0;
	while ((rem = m%n) != 0) {
	    m = n;
	    n = rem;
	}
	return n;
    }
    static long lcm(long m, long n) {
	return m * n / gcd(m, n);
    }
}
