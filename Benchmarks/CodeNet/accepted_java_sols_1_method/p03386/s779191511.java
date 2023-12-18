import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int k = sc.nextInt();

		long lo = b - a + 1;
		if (lo <= k*2) {

			for (long i = a; i <= b; i++) {

				System.out.println(i);
			}
		} else {
			for (long i = a; i <= a + k-1; i++) {
				System.out.println(i);
			}
			for (long i = b - k+1; i <= b; i++) {
				System.out.println(i);
			}
		}
	}
}