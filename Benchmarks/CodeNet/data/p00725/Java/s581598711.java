import java.util.Scanner;

class Main
{
	static int w = 0, h = 0;
	private static int map[][];
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			w = sc.nextInt();
			h = sc.nextInt();
			if (w == 0 && h == 0) break;
			int x = 0, y = 0;
			map = new int[h][w];
			for (int i = 0; i < h; i++)
			{
				for (int j = 0; j < w; j++)
				{
					map[i][j] = sc.nextInt();
					if (map[i][j] == 2)
					{
						y = i;
						x = j;
					}
				}
			}
			int result = go(x, y, 1);
			System.out.println((result == 11) ? -1 : result);
		}
	}
	private static int go(int x, int y, int count)
	{
		if (count == 11) return 11;
		int up = 11, down = 11, left = 11, right = 11;
		
		int tmpX = x;
		int tmpY = y;
		
		try
		{
			while (true)
			{
				if (map[tmpY-1][tmpX] == 1)
				{
					up = go(tmpX, tmpY, count + 1);
					break;
				}
				tmpY--;
				if (tmpY < 0)
				{
					up = 11;
					break;
				}
				if (map[tmpY][tmpX] == 3)
				{
					return count;
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			up = 11;
		}
		try
		{
			tmpY = y;
			while (true)
			{
				if (map[tmpY+1][tmpX] == 1)
				{
					down = go(tmpX, tmpY, count + 1);
					break;
				}
				tmpY++;
				if (tmpY >= h)
				{
					down = 11;
					break;
				}
				if (map[tmpY][tmpX] == 3)
				{
					return count;
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			down = 11;
		}
		try
		{
			tmpY = y;
			while (true)
			{
				if (map[tmpY][tmpX-1] == 1)
				{
					left = go(tmpX, tmpY, count + 1);
					break;
				}
				tmpX--;
				if (tmpX < 0)
				{
					left = 11;
					break;
				}
				if (map[tmpY][tmpX] == 3)
				{
					return count;
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			left = 11;
		}
		try
		{
			tmpX = x;
			while (true)
			{
				if (map[tmpY][tmpX+1] == 1)
				{
					right = go(tmpX, tmpY, count + 1);
					break;
				}
				tmpX++;
				if (tmpX >= w)
				{
					right = 11;
					break;
				}
				if (map[tmpY][tmpX] == 3)
				{
					return count;
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			right = 11;
		}
		
		int min = Math.min(up, down);
		min = Math.min(min, left);
		min = Math.min(min, right);
		return min;
	}
}