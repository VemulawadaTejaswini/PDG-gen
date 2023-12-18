import java.util.Scanner;

class Main
{
	private static StringBuffer map[];
	private static int count;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt(), m = sc.nextInt();
			if (n == 0 && m == 0) break;
			map = new StringBuffer[m];
			count = 0;
			int x = 0, y = 0;
			for (int i = 0; i < m; i++)
			{
				String str = sc.next();
				if (str.indexOf('@') != -1)
				{
					x = str.indexOf('@');
					y = i;
				}
				map[i] = new StringBuffer(str);
			}
			walk(x, y);
			System.out.println(count);
		}
	}
	private static void walk(int x, int y)
	{
		count++;
		map[y].setCharAt(x, '#');
		try{
			if (map[y-1].charAt(x) == '.') walk(x, y - 1);
		}catch (IndexOutOfBoundsException e){}
		try{
			if (map[y+1].charAt(x) == '.') walk(x, y + 1);
		}catch (IndexOutOfBoundsException e){}
		try{
			if (map[y].charAt(x+1) == '.') walk(x + 1, y);
		}catch (IndexOutOfBoundsException e){}
		try{
			if (map[y].charAt(x-1) == '.') walk(x - 1, y);
		}catch (IndexOutOfBoundsException e){}
	}
}