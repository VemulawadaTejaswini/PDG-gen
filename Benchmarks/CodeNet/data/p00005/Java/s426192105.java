import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			System.out.printf("%d %d\n", gcd(a,b), lcm(a,b));
		}
		sc.close();
	}
	static long gcd(long n, long m) {
        if(n > m) {
            return gcd(m, n);
        }
        long k = m % n;
        if(k == 0) {
            return n;
        }else {
            return gcd(n, k);
        }
    }
    static long lcm(long n, long m) {
        return n * m / gcd(n, m);
    }
}
