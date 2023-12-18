import java.util.Random;
import java.util.Scanner;

public class Main 
{	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int[][] n = new int[2][6];
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<6; j++)
			{
				n[i][j] = scanner.nextInt();
			}
		}
		
		boolean match = false;
		for(int i=0; i<99999; i++)
		{
			Random random = new Random();
			int d = random.nextInt(4);
				
			int[] buf = new int[6];
			for(int j=0; j<6; j++)
			{
				buf[j] = n[1][j];
			}
					
			switch(d)
			{
				case 0:
					n[1][0] = buf[4];
					n[1][1] = buf[0];
					n[1][5] = buf[1];
					n[1][4] = buf[5];
					break;
				case 1:
					n[1][0] = buf[1];
					n[1][1] = buf[5];
					n[1][5] = buf[4];
					n[1][4] = buf[0];
					break;
				case 2:
					n[1][0] = buf[2];
					n[1][2] = buf[5];
					n[1][5] = buf[3];
					n[1][3] = buf[0];
					break;
				case 3:
					n[1][0] = buf[3];
					n[1][3] = buf[5];
					n[1][5] = buf[2];
					n[1][2] = buf[0];
					break;
			}
			
			boolean is = true;
			for(int j=0; j<6; j++)
			{
				if(n[0][j] != n[1][j])
				{
					is = false;
					break;
				}
			}
			if(is)
			{
				match = true;
				break;
			}
		}
		
		System.out.println(match?"Yes":"No");
	}
}