

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		int n;
		int w;
		int h;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			n = sc.nextInt();
			if(n == 0)return;
			w = sc.nextInt();
			h = sc.nextInt();
			boolean[][] field = new boolean[w][h];
			
			for(int i = 0; i < n; i++)
			{
				int x = sc.nextInt()-1;
				int y = sc.nextInt()-1;
				field[x][y] = true;
			}
			int s = sc.nextInt();
			int t = sc.nextInt();
			
			int ans = 0;
			for(int x1 = 0; x1 <= w-s; x1++)
			{
				for(int y1 = 0; y1 <= h-t; y1++)
				{
					int count = 0;
					for(int x = x1; x <= x1+s-1; x++)
					{
						for(int y = y1; y <= y1+t-1; y++)
						{
							if(field[x][y])count++;
						}
					}
					ans = Math.max(ans, count);
				}
			}
			
			System.out.println(ans);
		}

	}

}

