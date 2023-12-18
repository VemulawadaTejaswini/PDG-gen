import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		final int A = scan.nextInt();
		final int B = scan.nextInt();
		final int C = scan.nextInt();
		scan.close();
		int result = C - (A - B);
		if(result <  0) {
			result = 0;
		}
		System.out.println(result);
	}
}