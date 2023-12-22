import java.util.Scanner;

public class Main {

	static int solve(int n, int x, int t) {

		int minute;
		if (n % x == 0)
			minute = (n / x) * t;
		else
			minute = (n / x + 1) * t;

		return minute;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n, x, t;

		n = stdIn.nextInt();
		x = stdIn.nextInt();
		t = stdIn.nextInt();

		int result = solve(n, x, t);
		System.out.println(result);

		stdIn.close();
	}
}
