import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(factorial(n));
	}
	public static long factorial(int n) {
		return n == 0 ? 1 : n * factorial(n - 1);
	}
}