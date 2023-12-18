import java.util.Scanner;

public class Main {

	public static long VALUE = 1000000007;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		long count = 1;

		for (long i = 1; i <= num; i++) {
			count *= i;
			count %= VALUE;
		}
		System.out.println(count);
	}
}
