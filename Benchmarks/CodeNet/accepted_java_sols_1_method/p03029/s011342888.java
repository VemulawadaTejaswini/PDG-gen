import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		int A = sc.nextInt();
		int P = sc.nextInt();

		System.out.println((A * 3 + P) / 2);

	}
}
