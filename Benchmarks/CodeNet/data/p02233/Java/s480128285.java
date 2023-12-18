import java.util.Scanner;

public class Main {
	static int F[] = new int[100];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(Fibonacci(n));
		scanner.close();
	}

	public static int Fibonacci(int n) {
		if (n <= 1) {
			return F[n] = 1;
		}
		if(F[n] > 0)
			return F[n];
		else
			return F[n] = Fibonacci(n - 1) + Fibonacci(n - 2);
	}
}