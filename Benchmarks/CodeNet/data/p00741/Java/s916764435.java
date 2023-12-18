import java.util.*;

public class Main {
	static int w;
	static int h;
	static int[][] fi;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if (w == 0 && h == 0)
				break;
			fi = new int[h][w];
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++)
					fi[i][j] = sc.nextInt();
			int n = 0;
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++)
					if (fi[i][j] == 1)
						n += loop(j, i);
			System.out.println(n);
		}
		sc.close();
	}

	public static int loop(int x, int y) {
		fi[x][y] = 0;
		if (x > 0 && y > 0) {
			if (fi[x - 1][y] == 1)
				loop(x - 1, y);
			if (fi[x - 1][y - 1] == 1)
				loop(x - 1, y - 1);
			if (fi[x][y - 1] == 1)
				loop(x, y - 1);
		}
		if (x > 0 && y < w - 1) {
			if (fi[x - 1][y + 1] == 1)
				loop(x - 1, y + 1);
			if (fi[x][y + 1] == 1)
				loop(x, y + 1);
		}
		if (x < h - 1 && y < w - 1) {
			if (fi[x + 1][y + 1] == 1)
				loop(x + 1, y + 1);
			if (fi[x + 1][y] == 1)
				loop(x + 1, y);
		}
		if (x < h - 1 && y > 0)
			if (fi[x + 1][y - 1] == 1)
				loop(x + 1, y - 1);
		return 1;
	}
}