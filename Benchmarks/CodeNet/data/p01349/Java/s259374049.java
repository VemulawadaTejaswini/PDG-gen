// Ennichi
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt(), n = sc.nextInt();
		char[][] field = new char[h][w];
		for (int i = 0; i < h; i++)
			field[i] = sc.next().toCharArray();
		char[][] tfield = new char[h][w];
		boolean result = false;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w - 1; j++) {
				for (int k = 0; k < h; k++)
					for (int l = 0; l < w; l++) {
						if (k == i && l == j)
							tfield[k][l] = field[i][j + 1];
						else if (k == i && l == j + 1)
							tfield[k][l] = field[i][j];
						else
							tfield[k][l] = field[k][l];
					}
				int[][] bfield = new int[h][w];
				for (int k = 0; k < h; k++) {
					for (int l = 0; l < w - n + 1; l++) {
						if (tfield[k][l] != '.') {
							boolean b = true;
							for (int m = 0; m < n; m++)
								b = b && tfield[k][l] == tfield[k][l + m];
							if (b)
								for (int m = 0; m < n; m++)
									bfield[k][l + m] = 1;
						}
					}
				}
				for (int k = 0; k < h - n + 1; k++) {
					for (int l = 0; l < w; l++) {
						if (tfield[k][l] != '.') {
							boolean b = true;
							for (int m = 0; m < n; m++)
								b = b && tfield[k][l] == tfield[k + m][l];
							if (b)
								for (int m = 0; m < n; m++)
									bfield[k + m][l] = 1;
						}
					}
				}
				for (int k = 0; k < h; k++)
					for (int l = 0; l < w; l++)
						if (bfield[k][l] == 1)
							tfield[k][l] = '.';
				boolean tresult = true;
				for (int k = 0; k < h; k++)
					for (int l = 0; l < w; l++)
						tresult = tresult && tfield[k][l] == '.';
				result = result || tresult;
			}
		}
		if (result)
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}
}