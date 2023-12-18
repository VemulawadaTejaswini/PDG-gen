import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[,\n]");
		
		int map[][] = new int[10][10];
		
		int drop1[][] = {
			{0,1,0},
			{1,1,1},
			{0,1,0},
		};
		int drop2[][] = {
			{1,1,1},
			{1,1,1},
			{1,1,1},
		};
		int drop3[][] = {
			{0,0,1,0,0},
			{0,1,1,1,0},
			{1,1,1,1,1},
			{0,1,1,1,0},
			{0,0,1,0,0}
		};
		
		while (true)
		{
			int x, y, size;
			try
			{
				x = sc.nextInt();
				y = sc.nextInt();
				size = sc.nextInt();
			}
			catch (Exception e)
			{
				break;
			}
			
			if (size == 1)
			{
				for (int i = 0; i < 3; i++)
				{
					for (int j = 0; j < 3; j++)
					{
						try
						{
							map[x-1+i][y-1+j] += drop1[i][j];
						}
						catch (ArrayIndexOutOfBoundsException e){continue;}
					}
				}
			}
			else if (size == 2)
			{
				for (int i = 0; i < 3; i++)
				{
					for (int j = 0; j < 3; j++)
					{
						try
						{
							map[x-1+i][y-1+j] += drop2[i][j];
						}
						catch (ArrayIndexOutOfBoundsException e){continue;}
					}
				}
			}
			else if (size == 3)
			{
				for (int i = 0; i < 5; i++)
				{
					for (int j = 0; j < 5; j++)
					{
						try
						{
							map[x-2+i][y-2+j] += drop3[i][j];
						}
						catch (ArrayIndexOutOfBoundsException e){continue;}
					}
				}
			}
		}
		int count = 0;
		int max = 0;
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				if (map[i][j] == 0) count++;
				max = Math.max(max, map[i][j]);
			}
		}
		System.out.println(count);
		System.out.println(max);
	}
}