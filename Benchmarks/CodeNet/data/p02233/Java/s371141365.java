import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// System.out.println(Main.fibonacciNumber(scan.nextInt()));
		System.out.println(Main.fibonacciNumberDP(scan.nextInt()));
	}

	// 再帰
	static int fibonacciNumber(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
		}
	}

	// DP
	static int fibonacciNumberDP(int n) {
		int[] fib = new int[n + 1];
		fib[0] = 1;

		if (fib.length >= 2){
			fib[1] = 1;
		}

		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		return fib[n];
	}

}