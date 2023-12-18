import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		while (m!=0) {
			Card[] cards = new Card[m];
			for (int i = 0; i < m; ++i) {
				int no = sc.nextInt();
				int num = sc.nextInt();
				cards[i] = new Card(no,num);
			}
			int g = sc.nextInt();
			int[] ns = new int[g];
			for (int i = 0; i < g; ++i) {
				ns[i] = sc.nextInt();
			}
			System.out.println(solve(m,cards,g,ns));
			m = sc.nextInt();
		}
	}

	public static String solve(int m, Card[] cards, int g, int[] ns) {

		Arrays.sort(cards,new Comparator<Card>() {
			@Override
			public int compare (Card c1, Card c2) {
				return c1.no() - c2.no();
			}
		});
		
		int n =0;
		for (int nn : ns) {
			n = Math.max(n,nn);
		}
		
		int[][] table = new int[m+1][n+1];
		table[0][0] = 1;

		for (int i = 0; i < m; ++i) {
			int no = cards[i].no();
			int num = cards[i].num();
			for (int j = 0; j <= n; ++j) {
				for (int k=0;k<=num&&0<=(j-k*no);++k) {
					table[i+1][j] += table[i][j-k*no];
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int nn : ns) {
			sb.append(table[m][nn]+"\n");
		}
		return new String(sb);
	}
	

	static class Card {
		private int no;
		private int num;
		public Card(int no, int num) {this.no = no;this.num = num;}
		public int no() {return no;}
		public int num() {return num;}
	}
}