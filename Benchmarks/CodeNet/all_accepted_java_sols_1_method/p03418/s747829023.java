import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		long inN = stdin.nextLong();
		long inK = stdin.nextLong();

		long count = 0;
		for (long b = 1; b <= inN; b++) {
			long div = inN / b;
			long mod = inN % b;
			count += div * Math.max(0, (b - inK)) + Math.max(0, (mod - inK + 1));
		}

		if (inK == 0) {
			count -= inN;
		}

		System.out.println(count);
	}

}
