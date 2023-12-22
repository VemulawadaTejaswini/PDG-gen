import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong() - 1;
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long gcd = Euclid(c, d);
		long lcm = c * d / gcd;
		System.out.println(b - b/c - b/d + b/lcm - a + a /c + a/d - a/lcm);
	}
	public static long Euclid(long n, long m) {
		if(m==0) return n;
		return Euclid(m, n%m);
	}
}