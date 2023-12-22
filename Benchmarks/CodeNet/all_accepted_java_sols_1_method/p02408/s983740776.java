import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean[] spade = new boolean[13];
		boolean[] heart = new boolean[13];
		boolean[] club = new boolean[13];
		boolean[] diamond = new boolean[13];

		int n = scan.nextInt();		

		for (int i = 0; i < n; ++i) {
			boolean[] mark = null;
			String markChar = scan.next();
			int number = scan.nextInt();
			if ("S".equals(markChar)) {
				mark = spade;
			}
			if ("H".equals(markChar)) {
				mark = heart;
			}
			if ("C".equals(markChar)) {
				mark = club;
			}
			if ("D".equals(markChar)) {
				mark = diamond;
			}
			mark[number - 1] = true;
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

		for (int i = 0; i < diamond.length; ++i) {
			if (!diamond[i]) {
				System.out.println("D " + (i + 1));
			}
		}
	}
}