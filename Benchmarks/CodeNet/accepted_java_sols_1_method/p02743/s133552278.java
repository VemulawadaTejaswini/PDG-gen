import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		double c = sc.nextDouble();

		// √a + √b < √c
		// a + 2√ab + b < c
		// 0 < (c -a -b)^2 - 4ab
//		BigDecimal result = new BigDecimal(c - a - b);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long result = c -a -b;

		if (result > 0 && 0 < (result * result) - (4 * a * b)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}