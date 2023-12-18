import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();

		if (A >= 13) {
			System.out.println(B);
		} else if (A >= 6) {
			System.out.println(B / 2);
		} else {
			System.out.println(0);
		}

	}
}
