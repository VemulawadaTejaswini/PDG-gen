import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		long h = scan.nextLong();

		System.out.println(calc(h));
		scan.close();
	}

	private static long calc(long count) {
		return count <= 1 ? 1 : calc(count / 2) * 2 + 1;
	}
}