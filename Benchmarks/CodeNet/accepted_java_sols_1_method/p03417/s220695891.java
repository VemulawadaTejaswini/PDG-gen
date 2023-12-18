import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long a = Math.max(Math.abs(n - 2), 0);
		long b = Math.max(Math.abs(k - 2), 0);
		System.out.println(a * b);
	}
}
