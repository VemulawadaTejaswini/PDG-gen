public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(Fibonacci(n));
		scanner.close();
	}

	public static int Fibonacci(int n) {
		if (n <= 1)
			return 1;
		else
			return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
}