import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numA = scan.nextInt();
		int numB = scan.nextInt();
		int numC = scan.nextInt();
		int numD = scan.nextInt();

		int start = Math.max(numA, numC);
		int end = Math.min(numB, numD);

		int delta = 0;

		if (start < end) {
			delta = end - start;
		}
		System.out.println(delta);
	}
}
