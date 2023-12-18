import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		long b = scan.nextLong();
		long x = scan.nextLong();

		long min = a / x;
		long modMin = a % x;
		long max = b / x;

		if (modMin == 0) {
			min--;
		}

		System.out.println(max - min);
	}

}
