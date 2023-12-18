import java.util.Scanner;

public class Main
{
	private static final int[] D = { -1, 0, 1 };
	
	private static int W, H;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			W = sc.nextInt();
			H = sc.nextInt();
			if (W==0 && H==0) break;
			
			boolean[][] map = new boolean[W][H];
			for (int y = 0; y < H; y++)
			{
				for (int x = 0; x < W; x++)
				{
					map[x][y] = sc.nextInt() == 1;
				}
			}
			System.out.println(count(map));
		}
	}
	
	private static int count(boolean[][] map)
	{
		int c = 0;
		for (int x = 0; x < W; x++)
		{
			for (int y = 0; y < H; y++)
			{
				if (map[x][y])
				{
					c++;
					rem(map, x, y);
				}
			}
		}
		return c;
	}
	
	private static void rem(boolean[][] map, int x, int y)
	{
		if (x < 0 || W <= x || y < 0 || H <= y || !map[x][y]) return;
		map[x][y] = false;
		for (int dx : D)
		{
			for (int dy : D)
			{
				if (dx == 0 && dy == 0) continue;
				rem(map, x + dx, y + dy);
			}
		}
	}
}