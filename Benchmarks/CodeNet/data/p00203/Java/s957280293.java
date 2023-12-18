import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			if (X == 0 && Y == 0)
				break;
			int[][] field = new int[X][Y];
			int[][] movable = new int[X][Y];
			for (int i = 0; i < Y; i++)
				for (int j = 0; j < X; j++)
					movable[j][i] = 0;
			for (int i = 0; i < Y; i++)
				for (int j = 0; j < X; j++)
					field[j][i] = sc.nextInt();
			for (int i = Y - 1; i >= 0; i--)
				for (int j = 0; j < X; j++) {
					if (field[j][i] == 0) {
						if (i == Y - 1)
							movable[j][i] = 1;
						else {
							movable[j][i] += movable[j][i + 1];
							if (j > 0 && field[j - 1][i + 1] != 2)
								movable[j][i] += movable[j - 1][i + 1];
							if (j < X - 1 && field[j + 1][i + 1] != 2)
								movable[j][i] += movable[j + 1][i + 1];
						}
					} else if (field[j][i] == 1)
						movable[j][i] = 0;
					else if (field[j][i] == 2) {
						if (i >= Y - 2)
							movable[j][i] = 1;
						else
							movable[j][i] = movable[j][i + 2];
					}
				}
			int result = 0;
			for (int i = 0; i < X; i++)
				result += movable[i][0];
			System.out.println(result);
		}
		sc.close();
	}
}