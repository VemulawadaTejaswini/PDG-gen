import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int X = s.nextInt();
			final int Y = s.nextInt();

			if(Math.abs(X - Y) > 1) {
				System.out.println(Math.max(X, Y) * 2 - 1);
			} else {
				System.out.println(X + Y);
			}
		}
	}
}
