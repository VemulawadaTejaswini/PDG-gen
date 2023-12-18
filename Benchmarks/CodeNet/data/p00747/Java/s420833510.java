
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		while(true)
		{
			int w = stdIn.nextInt();
			int h = stdIn.nextInt();
			int[][] a=new int[30][30];
			int[][] b=new int[30][30];
			int count = 0;
			int x = 0;
			int y = 0;
			int z = 0;
			
			for(int i=0;i<30;i++)
			{
				for(int j=0;j<30;j++)
				{
					a[i][j] = 1;
					b[i][j] = 1;
				}
			}
			
			if(w==0 && h==0)
			{
				break;
			}
			
			for(int i=0;i<w-1;i++)
			{
				a[0][i] = stdIn.nextInt();
			}
			
			for(int i=0;i<h-1;i++)
			{
				for(int j=0;j<w;j++)
				{
					b[i][j] = stdIn.nextInt();
				}
				for(int k=0;k<w-1;k++)
				{
					a[i+1][k] = stdIn.nextInt();
				}
			}
			
			while(true)
			{
				if(y==0 && x==w-1)
				{
					count=0;
					break;
				}
				if(y==h-1 && x ==w-1)
				{
					count++;
					break;
				}
				
				if(b[y][x] == 0)
				{
					y++;
					count++;
					z = 1;
					
				}
				else
				{
					if(a[y][x] == 0)
					{
						x++;
						count++;
						z = 0;
					}
					else
					{
						y--;
						b[y][x] = 1;
						if(z == 0)
						{
							count++;
						}
						else
						{
							count--;
						}
					}
				}
			}
			
			System.out.println(count);
			
			
		}
		
	}

}