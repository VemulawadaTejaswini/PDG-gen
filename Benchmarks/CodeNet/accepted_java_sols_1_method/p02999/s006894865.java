import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int X = s.nextInt();
			final int A = s.nextInt();

			if (X < A) {
				System.out.println(0);
			} else {
				System.out.println(10);
			}
		}
	}
}
