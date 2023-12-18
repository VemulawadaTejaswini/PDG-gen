import java.util.Scanner;

public class Main
{
	static int[][] map = new int[12][12];
	static boolean[][] check = new boolean[12][12];
	static int count;
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
			
		for(; scanner.hasNext();)
		{
			for(int i=0; i<12; i++)
			{
				String input = scanner.next();
				for(int j=0; j<12; j++)
				{
					map[i][j] = Integer.parseInt(input.substring(j, j+1));
					check[i][j] = false;
				}
			}
			
			count = 0;
			for(int i=0; i<12; i++)
			{
				for(int j=0; j<12; j++)
				{
					checkMap(i, j);
				}
			}
			
			System.out.println(count);
		}
	}
	
	static void checkMap(int m, int n)
	{
		boolean is_count = false;

		if(m > 0)
		{
			if(map[m-1][n] == 1)
			{
				is_count = true;
			}
		}
		for(int i=m; i<12; i++)
		{
			if(check[i][n] || map[i][n]==0)
			{
				check[i][n] = true;
				break;
			}
			for(int j=n; j>=0; j--)
			{
				if(check[i][j] || map[i][j]==0)
				{
					check[i][j] = true;
					break;
				}		
				else if(map[i][j]==1 && !is_count)
				{
					count ++;
					is_count = true;
				}
				
				check[i][j] = true;
			}
			for(int j=n+1; j<12; j++)
			{			
				if(check[i][j] || map[i][j]==0)
				{
					check[i][j] = true;
					break;
				}		
				else if(map[i][j]==1 && !is_count)
				{
					count ++;
					is_count = true;
				}
				
				check[i][j] = true;
			}
		}
	}
}