import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][];
		for (int i = 0; i < h; i++) {
			field[i] = sc.next().toCharArray();
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (field[i][j] == '.') {
					continue;
				}
				if ((i > 0 && field[i - 1][j] == '#') || (i < h - 1 && field[i + 1][j] == '#') || (j > 0 && field[i][j - 1] == '#') || (j < w - 1 && field[i][j + 1] == '#')) {
					continue;
				}
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
