import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		long high = scan.nextLong();
		long mid = scan.nextLong();
		long low = scan.nextLong();
		long num = scan.nextLong();

		//check
		long answer = high - mid;

		// answer
		if (num % 2 == 0) {
			System.out.println(answer);
		} else {
			System.out.println(-answer);
		}
	}
}
