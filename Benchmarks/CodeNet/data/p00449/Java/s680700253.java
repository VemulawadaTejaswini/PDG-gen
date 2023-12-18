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
		// Scanner scan = new Scanner(new File("c:\\0526-input.txt"));

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			if (n == 0)
				break;
			FareList f = new FareList(n);
			for (int i = 0; i < k; i++) {
				int c = scan.nextInt();
				if (c == 0)
					System.out.println(f.answer(scan.nextInt(), scan.nextInt()));
				else if (c == 1)
					f.addRoot(scan.nextInt(), scan.nextInt(), scan.nextInt());

			}
		}
		scan.close();
		System.exit(0);
	}
}

class FareList {
	int[][] fare;

	public FareList(int n) {
		fare = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (i == j)
					fare[i][j] = 0;
				else
					fare[i][j] = -1;
	}

	public void addRoot(int fr, int to, int amt) {
		if (fare[fr - 1][to - 1] != -1 && fare[fr - 1][to - 1] <= amt)
			return;
		this.newFare(fr - 1, to - 1, amt);
	}

	private void newFare(int fr, int to, int amt) {
		fare[fr][to] = amt;
		fare[to][fr] = amt;
		for (int f = 0; f < fare.length; f++)
			for (int t = 0; t < fare[f].length; t++) {
				if (fare[f][fr] != -1 && fare[to][t] != -1) {
					int namt = fare[f][fr] + fare[fr][to] + fare[to][t];
					if (fare[f][t] == -1 || namt < fare[f][t])
						fare[f][t] = namt;
				}
				if (fare[f][to] != -1 && fare[fr][t] != -1) {
					int namt = fare[f][to] + fare[to][fr] + fare[fr][t];
					if (fare[f][t] == -1 || namt < fare[f][t])
						fare[f][t] = namt;

				}
			}
	}

	public int answer(int fr, int to) {
		return fare[fr - 1][to - 1];
	}

}