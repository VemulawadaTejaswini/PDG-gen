import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = Long.parseLong(scn.next());
		long kaisuu = n / 11 * 2;

		if (n % 11 != 0) {
			if (n % 11 > 6) {
				kaisuu += 2;
			} else {
				kaisuu++;
			}
		}
		scn.close();
		System.out.println(kaisuu);
	}
}
