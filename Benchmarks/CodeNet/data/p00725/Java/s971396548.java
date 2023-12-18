import java.util.Scanner;

class Main
{
	static int w = 0, h = 0;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			w = sc.nextInt();
			h = sc.nextInt();
			if (w == 0 && h == 0) break;
			int x = 0, y = 0;
			int map[][] = new int[h][w];
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
			int result = go(map.clone(), x, y, 1);
			System.out.println((result == 11) ? -1 : result);
		}
	}
	private static int go(int map[][], int x, int y, int count)
	{
		if (count == 11) return 11;
		int up = 11, down = 11, left = 11, right = 11;
		
		int tmpX = x;
		int tmpY = y;
		
		int cloneMapUp[][] = new int[h][w];
		int cloneMapDown[][] = new int[h][w];
		int cloneMapLeft[][] = new int[h][w];
		int cloneMapRight[][] = new int[h][w];
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				cloneMapUp[i][j] = cloneMapDown[i][j] = cloneMapLeft[i][j] = cloneMapRight[i][j] = map[i][j];
		
		try
		{
			while (true)
			{
				if (cloneMapUp[tmpY-1][tmpX] == 1)
				{
					if (tmpY == y)
					{
						up = 11;
						break;
					}
					cloneMapUp[tmpY-1][tmpX] = 0;
					up = go(cloneMapUp, tmpX, tmpY, count + 1);
					break;
				}
				tmpY--;
				if (tmpY < 0)
				{
					up = 11;
					break;
				}
				if (cloneMapUp[tmpY][tmpX] == 3)
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
			tmpX = x;
			tmpY = y;
			while (true)
			{
				if (cloneMapDown[tmpY+1][tmpX] == 1)
				{
					if (tmpY == y)
					{
						down = 11;
						break;
					}
					cloneMapDown[tmpY+1][tmpX] = 0;
					down = go(cloneMapDown, tmpX, tmpY, count + 1);
					break;
				}
				tmpY++;
				if (tmpY >= h)
				{
					down = 11;
					break;
				}
				if (cloneMapDown[tmpY][tmpX] == 3)
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
			tmpX = x;
			tmpY = y;
			while (true)
			{
				if (cloneMapLeft[tmpY][tmpX-1] == 1)
				{
					if (tmpX == x)
					{
						left = 11;
						break;
					}
					cloneMapLeft[tmpY][tmpX-1] = 0;
					left = go(cloneMapLeft, tmpX, tmpY, count + 1);
					break;
				}
				tmpX--;
				if (tmpX < 0)
				{
					left = 11;
					break;
				}
				if (cloneMapLeft[tmpY][tmpX] == 3)
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
			tmpY = y;
			while (true)
			{
				if (cloneMapRight[tmpY][tmpX+1] == 1)
				{
					if (tmpX == x)
					{
						right = 11;
						break;
					}
					cloneMapRight[tmpY][tmpX+1] = 0;
					right = go(cloneMapRight, tmpX, tmpY, count + 1);
					break;
				}
				tmpX++;
				if (tmpX >= w)
				{
					right = 11;
					break;
				}
				if (cloneMapRight[tmpY][tmpX] == 3)
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