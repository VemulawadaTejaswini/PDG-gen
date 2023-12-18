import java.util.Scanner;
import java.util.HashSet;

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
		
		try
		{
			while (true)
			{
				if (map[tmpY-1][tmpX] == 1)
				{
					if (tmpY == y)
					{
						up = 11;
						break;
					}
					map[tmpY-1][tmpX] = 0;
					int cloneMap[][] = new int [h][w];
					for (int i = 0; i < h; i++)
						for (int j = 0; j < w; j++)
							cloneMap[i][j] = map[i][j];
					up = go(cloneMap, tmpX, tmpY, count + 1);
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
			tmpX = x;
			tmpY = y;
			while (true)
			{
				if (map[tmpY+1][tmpX] == 1)
				{
					if (tmpY == y)
					{
						down = 11;
						break;
					}
					map[tmpY+1][tmpX] = 0;
					int cloneMap[][] = new int [h][w];
					for (int i = 0; i < h; i++)
						for (int j = 0; j < w; j++)
							cloneMap[i][j] = map[i][j];
					down = go(cloneMap, tmpX, tmpY, count + 1);
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
			tmpX = x;
			tmpY = y;
			while (true)
			{
				if (map[tmpY][tmpX-1] == 1)
				{
					if (tmpX == x)
					{
						left = 11;
						break;
					}
					map[tmpY][tmpX-1] = 0;
					int cloneMap[][] = new int [h][w];
					for (int i = 0; i < h; i++)
						for (int j = 0; j < w; j++)
							cloneMap[i][j] = map[i][j];
					left = go(cloneMap, tmpX, tmpY, count + 1);
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
			tmpY = y;
			while (true)
			{
				if (map[tmpY][tmpX+1] == 1)
				{
					if (tmpX == x)
					{
						right = 11;
						break;
					}
					map[tmpY][tmpX+1] = 0;
					int cloneMap[][] = new int [h][w];
					for (int i = 0; i < h; i++)
						for (int j = 0; j < w; j++)
							cloneMap[i][j] = map[i][j];
					right = go(cloneMap, tmpX, tmpY, count + 1);
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
		//System.out.println(up);
		//System.out.println(down);
	//	System.out.println(left);
		//System.out.println(right);
		int min = Math.min(up, down);
		min = Math.min(min, left);
		min = Math.min(min, right);
		return min;
	}
}