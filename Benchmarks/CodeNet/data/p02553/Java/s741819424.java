import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();

		long ab = a * b;
		long ac = a * c;
		long ad = a * d;
		long bc = b * c;
		long cd = c * d;

		int max = 0;

		long[] num = { ab, ac, ad, bc, cd };
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = (int) num[i];
			}
		}
		System.out.println(max);
	}
}