import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final int n = scn.nextInt();
			final String s = scn.next();
			final String t = scn.next();

			for (int i = 0; i < n; i++) {
				System.out.print(s.charAt(i));
				System.out.print(t.charAt(i));
			}
			System.out.println();
		}
	}
}
