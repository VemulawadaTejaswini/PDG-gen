import java.util.Scanner;
import java.io.IOException;

class Main 
{
	private static int[][] field;
	private static int W, H;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException
	{
		int[] s;

		while(init())
		{
			s = find_start();
			dfs(s[0], s[1]);

			System.out.println(calc());
		}
	}

	private static boolean init() throws IOException
	{
		String str;
		
		W = sc.nextInt();
		H = sc.nextInt();

		if(W == 0 && H == 0)
		{
			return false;
		}

		field = new int[H][W];

		for(int i = 0; i < H; i++)
		{
			str = sc.next();

			for(int j = 0; j < W; j++)
			{
				switch(str.charAt(j))
				{
					case '.':
						field[i][j] = 0;
						break;

					case '#':
						field[i][j] = -1;
						break;

					case '@':
						field[i][j] = 1;
						break;
				}
			}
		}

		return true;
	}

	private static int[] find_start()
	{
		int[] s = new int[2];

		for(int i = 0; i < H; i++)
		{
			for(int j = 0; j < W; j++)
			{
				if(field[i][j] == 1)
				{
					s[0] = i;
					s[1] = j;
				}
			}
		}

		return s;
	}

	private static void dfs(int i, int j)
	{
		// System.out.println("("+i+","+j+")");

		if(0 < i && i < H - 1)
		{
			// up
			if(field[i - 1][j] == 0)
			{
				field[i - 1][j] = 1;
				dfs(i - 1, j);
			}

			// down
			if(field[i + 1][j] == 0)
			{
				field[i + 1][j] = 1;
				dfs(i + 1, j);
			}
		}
		else if(i == 0 && H != 1)
		{
			// down
			if(field[i + 1][j] == 0)
			{
				field[i + 1][j] = 1;
				dfs(i + 1, j);
			}
		}
		else if(i == H - 1 && H != 1)
		{
			// up
			if(field[i - 1][j] == 0)
			{
				field[i - 1][j] = 1;
				dfs(i - 1, j);
			}
		}

		if(0 < j && j < W - 1)
		{
			// left
			if(field[i][j - 1] == 0)
			{
				field[i][j - 1] = 1;
				dfs(i, j - 1);
			}

			// right
			if(field[i][j + 1] == 0)
			{
				field[i][j + 1] = 1;
				dfs(i, j + 1);
			}
		}
		else if(j == 0 && W != 1)
		{
			// right
			if(field[i][j + 1] == 0)
			{
				field[i][j + 1] = 1;
				dfs(i, j + 1);
			}
		}
		else if(j == W - 1 && W != 1)
		{
			// left
			if(field[i][j - 1] == 0)
			{
				field[i][j - 1] = 1;
				dfs(i, j - 1);
			}
		}
	}

	private static int calc()
	{
		int cnt = 0;

		for(int i = 0; i < H; i++)
		{
			for(int j = 0; j < W; j++)
			{
				if(field[i][j] == 1)
				{
					cnt++;
				}
			}
		}

		return cnt;
	}
}