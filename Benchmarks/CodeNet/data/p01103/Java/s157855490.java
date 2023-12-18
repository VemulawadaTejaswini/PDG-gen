

import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		while(true)
		{
			int h = scan.nextInt();
			int w = scan.nextInt();
			
			if(h == 0 && w == 0)
			{
				break;
			}
			else
			{
				new DataSet(h,w);
			}
		}
	}
	
	static class DataSet
	{
		int height;
		int width;
		int[][] grid;
		
		public DataSet(int h, int w)
		{
			height = h;
			width = w;
			
			grid = new int[width][height];
			
			for(int y = 0; y < height; y++)
			{
				for(int x = 0; x < width; x++)
				{
					grid[x][y] = scan.nextInt();
				}
			}
			
			int highestCapacity = 0;
			
			for(int pondH = 3; pondH <= height; pondH++) //including borders
			{
				for(int pondW = 3; pondW <= width; pondW++)
				{
					for(int y1 = 0; y1 <= height - pondH; y1++)
					{
						for(int x1 = 0; x1 <= width - pondW; x1++)
						{
							//Aaaand a to-be pond is set!
							
							int x2 = x1 + pondW - 1;
							int y2 = y1 + pondH - 1;
							int capacity = 0;
							boolean overflow = false;
							
							//check lowest terrain in border
							int lowborel = 100; //lowestBorderElevation
							for(int xT = x1; xT <= x2; xT++)
							{
								lowborel = Math.min(lowborel, grid[xT][y1]);
								lowborel = Math.min(lowborel, grid[xT][y2]);
							}
							for(int yT = y1+1; yT <= y2-1; yT++)
							{
								lowborel = Math.min(lowborel, grid[x1][yT]);
								lowborel = Math.min(lowborel, grid[x2][yT]);
							}
							
							//count capacity inside, quit if any inside tile is higher than
							//lowest terrain in border.
							for(int yT = y1+1; yT <= y2-1 && !overflow; yT++)
							{
								for(int xT = x1+1; xT <= x2-1 && !overflow; xT++)
								{
									int curel = grid[xT][yT];
									
									if(curel >= lowborel)
									{
										//water overflow. quit.
										capacity = 0;
										overflow = true;
									}
									else
									{
										capacity += lowborel - curel;
									}
								}
							}
							
							highestCapacity = Math.max(highestCapacity, capacity);
						}
					}
				}
			}
			System.out.println(highestCapacity);
		}
	}
}

