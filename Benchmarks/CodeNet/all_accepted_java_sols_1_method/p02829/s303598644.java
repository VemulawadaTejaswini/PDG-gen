import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final int a = scn.nextInt();
			final int b = scn.nextInt();

			System.out.println(6 - a - b);
		}
	}
}
