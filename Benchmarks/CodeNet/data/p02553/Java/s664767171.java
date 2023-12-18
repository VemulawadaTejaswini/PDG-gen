import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();

		long answer = Long.MIN_VALUE;

		answer = Math.max(answer, a * c);
		answer = Math.max(answer, b * c);
		answer = Math.max(answer, a * d);
		answer = Math.max(answer, b * d);

		System.out.println(answer);
 	}
}