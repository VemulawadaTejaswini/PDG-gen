import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		long value1 = scan.nextLong();
		long value2 = (long) (scan.nextDouble() * 100 + 0.001);
		long sum = value1 * value2 / 100;

		scan.close();
		System.out.println(sum);
	}
}
