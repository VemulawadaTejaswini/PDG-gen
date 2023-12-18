import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		int[][] map = new int[10][10];
		
		int ink[][][] =
			{
				{
					{0,0,0,0,0},
					{0,0,1,0,0},
					{0,1,1,1,0},
					{0,0,1,0,0},
					{0,0,0,0,0},		
				},
				{
					{0,0,0,0,0},
					{0,1,1,1,0},
					{0,1,1,1,0},
					{0,1,1,1,0},
					{0,0,0,0,0},		
				},
				{
					{0,0,1,0,0},
					{0,1,1,1,0},
					{1,1,1,1,1},
					{0,1,1,1,0},
					{0,0,1,0,0},
				}
			};
		
		Scanner scanner = new Scanner(System.in);
		for(; scanner.hasNext();)
		{
			String str = scanner.next();
			String[] num = str.split(",");
			
			int x = Integer.parseInt(num[0]);
			int y = Integer.parseInt(num[1]);
			int id = Integer.parseInt(num[2]) -1;
			
			for(int i=0; i<5; i++)
			{
				for(int j=0; j<5; j++)
				{
					int px = x-2+i;
					int py = y-2+j;
					if((0<=px && px<10) || (0<=py && py<10))
					{
						map[px][py] += ink[id][i][j];
					}
					
				}
			}
		}
		
		int count = 0;
		int max = 0;
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(map[i][j] == 0)
				{
					count ++;
				}
				else if(map[i][j] > max)
				{
					max = map[i][j];
				}
			}
		}
		
		System.out.println(count);
		System.out.println(max);
	}
}