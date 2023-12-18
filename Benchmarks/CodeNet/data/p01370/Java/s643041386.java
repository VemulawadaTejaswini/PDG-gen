import java.util.*;

public class Main {
	static final int center = 75;
	static int[][] field;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int t = sc.nextInt();
			int n = sc.nextInt();
			if (t == 0 && n == 0)
				break;
			field = new int[151][151];
			for (int i = 0; i < 151; i++)
				for (int j = 0; j < 151; j++)
					field[i][j] = 0;
			for (int i = 0; i < n; i++)
				field[sc.nextInt() + center][sc.nextInt() + center] = -1;
			move(t, sc.nextInt() + center, sc.nextInt() + center);
			int result = count();
			System.out.println(result);
		}
		sc.close();
	}

	static void move(int t, int x, int y) {
		int[] dx = { 0, 1, 1, 0, -1, -1 };
		int[] dy = { 1, 1, 0, -1, -1, 0 };
		field[x][y] = 1;
		if (t > 0)
			for (int i = 0; i < dx.length; i++)
				if (field[x + dx[i]][y + dy[i]] == 0)
					move(t - 1, x + dx[i], y + dy[i]);
	}

	static int count() {
		int result = 0;
		for (int i = 0; i < 151; i++)
			for (int j = 0; j < 151; j++)
				if (field[i][j] == 1)
					result++;
		return result;
	}
}