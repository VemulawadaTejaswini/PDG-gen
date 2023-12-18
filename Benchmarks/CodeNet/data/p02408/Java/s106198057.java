import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		boolean[] spade = new boolean[13];
		boolean[] dia = new boolean[13];
		boolean[] club = new boolean[13];
		boolean[] heart = new boolean[13];

		int n = stdin.nextInt();
		for (int i = 0; i < n; ++i) {
			String markChar = stdin.next();
			int number = stdin.nextInt();
			boolean[] check = null;

			if (markChar.equalsIgnoreCase("S")) {
				check = spade;
			}
			if (markChar.equalsIgnoreCase("D")) {
				check = dia;
			}
			if (markChar.equalsIgnoreCase("C")) {
				check = club;
			}
			if (markChar.equalsIgnoreCase("H")) {
				check = heart;
			}
			check[number - 1] = true;
		}

		for (int i = 0; i < spade.length; ++i) {
			if (!spade[i]) {
				System.out.println("S " + (i + 1));
			}
		}

		for (int i = 0; i < heart.length; ++i) {
			if (!heart[i]) {
				System.out.println("H " + (i + 1));
			}
		}

		for (int i = 0; i < club.length; ++i) {
			if (!club[i]) {
				System.out.println("C " + (i + 1));
			}
		}

		for (int i = 0; i < dia.length; ++i) {
			if (!dia[i]) {
				System.out.println("D " + (i + 1));
			}
		}

	}
}