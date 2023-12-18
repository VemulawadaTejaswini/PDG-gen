
import java.util.Scanner;

public class Main 
{
	static int[][] grid;
	static int x0, y0, n, m, maxx, maxy;
	static boolean debug = false;
	
	static void printout()
	{
		System.out.println("PRINTOUT: " + maxx + " " + maxy);
		for(int y = maxy-1; y >= y0; y--)
		{
			for(int x = x0; x < maxx; x++)
			{
				System.out.print(grid[x][y]);
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			n = sc.nextInt();
			if(n == 0)break;
			m = sc.nextInt();
			int foldings = sc.nextInt();
			int punchings = sc.nextInt();
			int r = 0;
			
			grid = new int[n*20][m*20];
			x0 = 0;
			y0 = 0;
			maxx = n;
			maxy = m;
			
			for(int x = 0; x < n; x++)
			{
				for(int y = 0; y < m; y++)
				{
					grid[x][y] = 1;
				}
			}
			
			for(int i = 0; i < foldings; i++)
			{
				if(debug)System.out.println("Fold " + i);
				int foldtype = sc.nextInt();
				int foldpos = sc.nextInt();
				
				if(foldtype == 1) //vertical
				{
					int foldx = foldpos + x0;
					int width = foldx - x0;
					//width -> panjang yang termasuk
					//x0, y0 masih termasuk
					//x0 ~ foldx -> foldx ~ foldx + width
					
					for(int x = x0; x < foldx; x++)
					{
						int dist = foldx - x - 1;
						int x2 = foldx + dist;
						maxx = Math.max(maxx, x2+1);
						for(int y = y0; y < maxy; y++)
						{
							grid[x2][y] += grid[x][y];
							
							//System.out.println(x + " " + y + " -> " + x2 + " " + y );
						}
					}
					
					x0 = foldx;
				}
				else if(foldtype == 2) //horixontal
				{
					int foldy = foldpos + y0;
					int height = foldy - y0;
					//width -> panjang yang termasuk
					//x0, y0 masih termasuk
					//x0 ~ foldx -> foldx ~ foldx + width
					
					for(int y = y0; y < foldy; y++)
					{
						int dist = foldy - y - 1;
						int y2 = foldy + dist;
						maxy = Math.max(maxy, y2+1);
						for(int x = x0; x < maxx; x++)
						{
							grid[x][y2] += grid[x][y];
							
							//System.out.println(x + " " + y + " -> " + x + " " + y2 );
						}
					}
					
					y0 = foldy;
				}
				if(debug)printout();				
			}
			
			if(debug)System.out.println("Punch:");
			for(int i = 0; i < punchings; i++)
			{
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println(grid[x+x0][y+y0]);
			}
		}
	}

}

