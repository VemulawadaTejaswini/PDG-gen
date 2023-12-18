import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		boolean[] spade = new boolean[13];
		boolean[] diamond = new boolean[13];
		boolean[] club = new boolean[13];
		boolean[] heart = new boolean[13];

		int n = stdin.nextInt();

		for (int i = 0; i < n; ++i) {
			String markChar = stdin.next();
			int number = stdin.nextInt();
			boolean[] mark = null;
			if ("S".equals(markChar)) {
				mark = spade;
			} else if ("H".equals(markChar)) {
				mark = heart;
			} else if ("C".equals(markChar)) {
				mark = club;
			} else if ("D".equals(markChar)) {
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