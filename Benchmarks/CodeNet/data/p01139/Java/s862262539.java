import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static int w, h;
	static int[][] map;
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			w = sca.nextInt();
			h = sca.nextInt();
			if(w == 0) break;
			
			int x, y;
			
			map = new int[h][w];
			for(y = 0;y < h;y++)
			{
				String text = sca.next();
				for(x = 0;x < w;x++)
				{
					switch(text.charAt(x))
					{
					case '.': map[y][x] = 0; break;
					case 'B': map[y][x] = 1; break;
					case 'W': map[y][x] = 2; break;
					}
				}
			}
			
			Boolean modify = true;
			while(modify)
			{
				modify = false;
				
				for(y = 0;y < h;y++)
				{
					for(x = 0;x < w;x++)
					{
						if(map[y][x] == 1 || map[y][x] == 2 || map[y][x] == 5) continue;
						
						int black = 0, white = 0, brank = 0;
						
						if(0 < x)
						{
							switch(map[y][x-1])
							{
							case 1:
							case 3:
								black++;
								break;
							case 2:
							case 4:
								white++;
								break;
							case 5:
								brank++;
								break;
							}
						}
						
						if(0 < y)
						{
							switch(map[y-1][x])
							{
							case 1:
							case 3:
								black++;
								break;
							case 2:
							case 4:
								white++;
								break;
							case 5:
								brank++;
								break;
							}
						}
						
						if(x < w-1)
						{
							switch(map[y][x+1])
							{
							case 1:
							case 3:
								black++;
								break;
							case 2:
							case 4:
								white++;
								break;
							case 5:
								brank++;
								break;
							}
						}
						
						if(y < h-1)
						{
							switch(map[y+1][x])
							{
							case 1:
							case 3:
								black++;
								break;
							case 2:
							case 4:
								white++;
								break;
							case 5:
								brank++;
								break;
							}
						}
						
						
						if(brank > 0)
						{
							map[y][x] = 5;
							modify = true;
						}
						else if(black == 0 && white > 0 && map[y][x] != 4)
						{
							map[y][x] = 4;
							modify = true;
						}
						else if(black > 0 && white == 0 && map[y][x] != 3)
						{
							map[y][x] = 3;
							modify = true;
						}
						else if(black > 0 && white > 0 && map[y][x] != 5)
						{
							map[y][x] = 5;
							modify = true;
						}
					}
				}
			}
			
			int black=0, white=0;
			for(y = 0;y < h;y++)
			{
				for(x = 0;x < w;x++)
				{
					if(map[y][x] == 3)
						black++;
					else if(map[y][x] == 4)
						white++;
				}
			}
			
			System.out.println(black + " " + white);
		}
	}
}