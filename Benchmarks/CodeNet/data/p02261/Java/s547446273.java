import java.util.Scanner;

public class Main {
	private static class Card {
		private char suit;
		private int value;
	}
	
	public static void printResult(Card[] c, Card[] org) {
		for (int i = 0; i < c.length - 1; i++) {
			System.out.print(String.valueOf(c[i].suit) + c[i].value + " ");
		}
		System.out.println(String.valueOf(c[c.length - 1].suit) + c[c.length - 1].value);
		
		String isStable = "Stable";
		for (int i = 0; i < c.length - 2; i++) {
			int orgi;
			for (orgi = 0; !(org[orgi].suit == c[i].suit && org[orgi].value == c[i].value); orgi++);
			for (int j = i + 1; j < c.length && c[j].value == c[i].value; j++) {
				int orgj;
				for (orgj = 0; !(org[orgj].suit == c[j].suit && org[orgj].value == c[j].value); orgj++);
				if (orgj < orgi) isStable = "Not stable";
			}
		}
		System.out.println(isStable);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		Card[] c = new Card[n], cb, cs;
		
		for (int i = 0; i < n; i++) {
			String sv = scanner.next();
			c[i] = new Card();
			c[i].suit = sv.charAt(0);
			c[i].value = Integer.valueOf(sv.substring(1));
		}
		
		scanner.close();
		
		cb = c.clone();
		for (int i = 0; i < n; i++) {
			for (int ｊ = n - 1; ｊ >= i + 1; ｊ--) {
				if (cb[ｊ].value < cb[ｊ - 1].value) {
					Card temp = cb[ｊ];
					cb[ｊ] = cb[ｊ - 1];
					cb[ｊ - 1] = temp;
				}
			}
		}
		printResult(cb, c);
		
		cs = c.clone();
		for (int i = 0; i < n; i++) {
			int minj = i;
			for (int j = i; j < n; j++) {
				if (cs[j].value < cs[minj].value) {
					minj = j;
				}
			}
			if (i != minj) {
				Card temp = cs[i];
				cs[i] = cs[minj];
				cs[minj] = temp;
			}
		}
		printResult(cs, c);
	}
} 

