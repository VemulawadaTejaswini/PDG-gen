

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] tile = new int[5][5];
		
		for(int i = 0; i < n; i++)
		{
			for(int y = 0; y < 5; y++)
			{
				for(int x = 0; x < 5; x++)
				{
					tile[x][y] = scan.nextInt();
				}
			}
			
			int ans = 0;
			
			for(int w = 5; w > 0; w--)
			{
				for(int h = 5; h > 0; h--)
				{
					if(w*h > ans)
					{
						for(int xp = 0; xp <= 5-w; xp++)
						{
							for(int yp = 0; yp <= 5-h; yp++)
							{
								boolean okay = true;
								for(int xpp = xp; xpp <= w+xp-1; xpp++)
								{
									for(int ypp = yp; ypp <= h+yp-1; ypp++)
									{
										if(tile[xpp][ypp] == 0)
										{
//											System.out.println("trying " + xp + ", " + yp + ", failed at " + xpp + "," + ypp);
											
											okay = false;
											break;
										}
									}
								}
								if(okay)
								{
									ans = w*h;
								}
							}
						}
					}
				}
			}
			
			System.out.println(ans);
			
			
		}
	}

}

