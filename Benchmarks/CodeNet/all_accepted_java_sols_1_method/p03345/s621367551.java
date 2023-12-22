import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long k = sc.nextLong();

		if (k % 2 == 0) {
			System.out.println(a - b);
		} else {
			System.out.println(b - a);
		}

		sc.close();
	}

}
