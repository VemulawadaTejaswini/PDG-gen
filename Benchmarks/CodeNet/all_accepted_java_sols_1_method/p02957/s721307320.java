import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		scanner.close();

		if (((A + B) & 1) == 0)
			System.out.println((A + B) >> 1);
		else
			System.out.println("IMPOSSIBLE");
	}
}