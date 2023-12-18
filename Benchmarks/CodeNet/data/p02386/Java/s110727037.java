import java.util.Random;
import java.util.Scanner;

public class Main 
{	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		
		int[][] n = new int[x][6];
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<6; j++)
			{
				n[i][j] = scanner.nextInt();
			}
		}
		
		for(int l=0; l<x; l++)
		{
			for(int k=l+1; k<x; k++)
			{
				for(int i=0; i<99999; i++)
				{
					Random random = new Random();
					int d = random.nextInt(4);
						
					int[] buf = new int[6];
					for(int j=0; j<6; j++)
					{
						buf[j] = n[k][j];
					}
							
					switch(d)
					{
						case 0:
							n[k][0] = buf[4];
							n[k][1] = buf[0];
							n[k][5] = buf[1];
							n[k][4] = buf[5];
							break;
						case 1:
							n[k][0] = buf[1];
							n[k][1] = buf[5];
							n[k][5] = buf[4];
							n[k][4] = buf[0];
							break;
						case 2:
							n[k][0] = buf[2];
							n[k][2] = buf[5];
							n[k][5] = buf[3];
							n[k][3] = buf[0];
							break;
						case 3:
							n[k][0] = buf[3];
							n[k][3] = buf[5];
							n[k][5] = buf[2];
							n[k][2] = buf[0];
							break;
					}
					
					boolean is = true;
					for(int j=0; j<6; j++)
					{
						if(n[l][j] != n[k][j])
						{
							is = false;
							break;
						}
					}
					if(is)
					{
						System.out.println("No");
						return;
					}
				}
			}
		}
		
		System.out.println("Yes");
	}
}