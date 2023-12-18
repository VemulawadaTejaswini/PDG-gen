import java.util.Scanner;

public class Main {

	static int[] fib;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		fib = new int[n + 1];

		fib[n] = getFib(n);

		System.out.println(fib[n]);

		sc.close();
	}

	private static int getFib(int n) {
		if (fib[n] != 0)
			return fib[n];

		if (n == 0 || n == 1)
			return fib[n] = 1;

		return fib[n] = getFib(n - 1) + getFib(n - 2);
	}
}

