import java.util.Scanner;

public class Main {

	static final long MOD = 1000000007;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();

		while (true) {
			C -= B;
			if (C <= 0) {
				System.out.println("Yes");
				break;
			}
			A -= D;
			if (A <= 0) {
				System.out.println("No");
				break;
			}
		}
	}
}