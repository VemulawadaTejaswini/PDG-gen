import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long E = lcm(C,D);

		long x = 0;
		long y = 0;
		long z = 0;

		if (A%C == 0){
			x = B/C - A/C + 1;
		} else {
			x = B/C - A/C;
		}

		if (A%D == 0){
			y = B/D - A/D + 1;
		} else {
			y = B/D - A/D;
		}

		if (A%E == 0){
			z = B/E - A/E + 1;
		} else {
			z = B/E - A/E;
		}

		System.out.println(B - A + 1 - (x + y - z));
	}

	public static long gcd(long a , long b) {
		if (b==0) {
			return a;
		}
		return gcd(b,a%b);
	}

	private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
}