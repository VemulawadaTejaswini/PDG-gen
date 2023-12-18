import java.util.Scanner;

public class Main {

	static final long DIVIDE_NUMBER = 1000000007;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();

		String answer = check(x, y);

		println(answer);
	}

	public static String check(int x, int y) {

		int max = x * 4;

		int min = x * 2;

		if (max < y || y < min || y % 2 == 1) {
			return "No";
		}

		return "Yes";
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
