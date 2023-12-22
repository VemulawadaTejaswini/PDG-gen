import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long multCD = lcm(C, D);

		long CRem = B / C - (A - 1) / C;
		long DRem = B / D - (A - 1) / D;
		long multCDRem = B / multCD - (A - 1) / multCD;

		System.out.println(B - A + 1 - (CRem + DRem - multCDRem));
	}

	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (long)(c/b);
	}
}
