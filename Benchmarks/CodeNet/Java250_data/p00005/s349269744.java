import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long a;
		long b;

		while(sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println(gcd(a, b) + " " + lcm(a, b));
		}
	}

	public static long gcd(long a, long b) {
		long gcd = a;
		while(b % a != 0) {
			gcd = b % a;
			b = a;
			a = gcd;
		}
		return gcd;
	}

	public static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}


}