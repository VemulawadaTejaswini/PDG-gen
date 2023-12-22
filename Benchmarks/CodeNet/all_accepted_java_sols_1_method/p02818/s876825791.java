import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long k = scanner.nextLong();
		System.out.println(Math.max(a - k, 0) + " " + Math.max(b - Math.max(k - a, 0), 0));
	}

}
