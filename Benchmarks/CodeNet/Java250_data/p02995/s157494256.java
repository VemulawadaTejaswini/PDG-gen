import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			long A = scn.nextLong();
			long B = scn.nextLong();
			long C = scn.nextLong();
			long D = scn.nextLong();

			long minmaxVal = B - A + 1;
			long cd = lcm(C, D);
			long div = B / cd - ((A - 1) / cd);
			long cDiv = (A - 1) / C - B / C;
			long dDiv = (A - 1) / D - B / D;

			System.out.println(minmaxVal + div + cDiv + dDiv);

		}
	}

	static long lcm (long a,long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return c/b;
	}
}