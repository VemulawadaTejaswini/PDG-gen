
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(fib(n));
	}

	private int fib(int n) {
		if (n == 0)
			return 1;
		else if (n == 1)
			return 1;
		else
			return fib(n - 2) + fib(n - 1);
	}
}