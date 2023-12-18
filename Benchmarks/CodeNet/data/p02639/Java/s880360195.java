import java.util.Scanner;

public class Main {

	static final long DIVIDE_NUMBER = 1000000007;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int answer = 0;

		for (int i = 1; i < 6; i++) {

			int target = scan.nextInt();

			if (target == 0) {

				answer = i;
			}
		}

		println(answer);
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
