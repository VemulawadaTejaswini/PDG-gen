import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	static int[] D = { 1, 0, -1, 0 };
	static int w, h, c;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			h = sc.nextInt();
			w = sc.nextInt();
			c = sc.nextInt();
			if ((h|w|c)==0)break;

			int[] board = new int[w * h];
			for (int y = 0; y < h; y++)
			{
				for (int x = 0; x < w; x++)
				{
					board[y * w + x] = sc.nextInt();
				}
			}

			System.out.println(count(board, 5));
		}
	}

	static int count(int[] board, int t)
	{
		if (t == 0)
		{
			return countColor(board);
		}

		int max = 0;
		for (int i = 1; i <= 6; i++)
		{
			if (board[0] == i) continue;
			int[] cb = Arrays.copyOf(board, board.length);
			changeColor(cb, 0, 0, cb[0], i);
			max = Math.max(max, count(cb, t - 1));
		}
		return max;
	}

	static int countColor(int[] board)
	{
		return countColor(board, 0, 0);
	}

	static int countColor(int[] board, int x, int y)
	{
		int count = 0;
		if (0 <= x && x < w && 0 <= y && y < h && board[y * w + x] == c)
		{
			count++;
			board[y * w + x] = 0;
			for (int i = 0; i < 4; i++)
			{
				int x2 = x + D[i];
				int y2 = y + D[(i + 1) % 4];
				count += countColor(board, x2, y2);
			}
		}
		return count;
	}

	static void changeColor(int[] board, int x, int y, int c, int d)
	{
		if (0 <= x && x < w && 0 <= y && y < h && board[y * w + x] == c)
		{
			board[y * w + x] = d;
			for (int i = 0; i < 4; i++)
			{
				int x2 = x + D[i];
				int y2 = y + D[(i + 1) % 4];
				changeColor(board, x2, y2, c, d);
			}
		}
	}
}
/*
3 5 5
1 6 3 2 5
2 5 4 6 1
1 2 4 1 5
4 5 6
1 5 6 1 2
1 4 6 3 2
1 5 2 3 2
1 1 2 3 2
1 1 5
1
1 8 6
1 2 3 4 5 1 2 3
8 1 1
1
2
3
4
5
1
2
3
8 8 6
5 2 5 2 6 5 4 2
4 2 2 2 5 2 2 2
4 4 4 2 5 2 2 2
6 4 5 2 2 2 6 6
6 6 5 5 2 2 6 6
6 2 5 4 2 2 6 6
2 4 4 4 6 2 2 6
2 2 2 5 5 2 2 2
8 8 2
3 3 5 4 1 6 2 3
2 3 6 4 3 6 2 2
4 1 6 6 6 4 4 4
2 5 3 6 3 6 3 5
3 1 3 4 1 5 6 3
1 6 6 3 5 1 5 3
2 4 2 2 2 6 5 3
4 1 3 6 1 5 5 4
0 0 0
*/