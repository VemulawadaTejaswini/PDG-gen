import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int A = scan.nextInt();
		final int B = scan.nextInt();
		final int C = scan.nextInt();
		scan.close();

		int remain1 = A - B;

		if (remain1 > C) {
			System.out.println(0);
		} else {
			System.out.println(C - remain1);
		}

	}

}
