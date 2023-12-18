import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\0536-input.txt"));

		while (scan.hasNext()) {

			int n = scan.nextInt();
			int m = scan.nextInt();
			int s = scan.nextInt();
			if (n == 0 && m == 0 && s == 0)
				break;

			Card c = new Card(n, m, s);

			System.out.println(c.countMod(100000));
		}

		scan.close();
		System.exit(0);
	}
}

class Card {
	int N, M, S;

	public Card(int n, int m, int s) {
		N = n;
		M = m;
		S = s;
		comb = new int[2][m + 1][s + 1];
	}

	int[][][] comb;

	public int countMod(int round) {
		int od, nw = 0;
		comb[nw][0][0] = 1;
		for (int i = 1; i <= N * N; i++) {
			od = nw;
			nw ^= 1;
			for (int j = 0; j <= M; j++)
				for (int k = 0; k <= S; k++) {
					comb[nw][j][k] = 0;
					for (int v = 0; v < j; v++)
						if (k >= j) {
							comb[nw][j][k] += comb[od][v][k - j];
							comb[nw][j][k] %= round;
						}
//					if (comb[nw][j][k] > 0)
//						System.out.println(i + " " + j + ":" + k + ":" + comb[nw][j][k]);
				}
		}
		int result = 0;
		for (int i = 1; i <= M; i++) {
			result += comb[nw][i][S];
			result %= round;
		}
		return result;
	}

}