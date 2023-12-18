import java.util.*;

class Longest {
	int longc(char[] X, char[] Y, int x, int y) {
		int L[][] = new int[x + 1][y + 1];
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= y; j++) {
				if (i == 0 || j == 0)
					L[i][j] = 0;
				else if (X[i - 1] == Y[j - 1])
					L[i][j] = L[i - 1][j - 1] + 1;
				else
					L[i][j] = max(L[i - 1][j], L[i][j - 1]);
			}
		}
		return L[x][y];

	}

	int max(int p, int q) {
		if (p > q) {
			return p;
		} else {
			return q;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Longest longs = new Longest();
		int l = in.nextInt();
		in.nextLine();
		char[] X, Y;
		for (int i = 0; i < l; i++) {
			X = in.nextLine().trim().toCharArray();
			Y = in.nextLine().trim().toCharArray();
			System.out.println(longs.longc(X, Y, X.length, Y.length));
		}
		in.close();
	}
}
