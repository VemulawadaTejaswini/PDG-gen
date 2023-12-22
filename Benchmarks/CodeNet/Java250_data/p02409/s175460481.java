
import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[][][] building = new int[4][3][10];
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				Arrays.fill(building[i][j],0);
			}
		}
		
		for(int i=0;i<n;i++)
		{
			int b = stdIn.nextInt();
			int f = stdIn.nextInt();
			int r = stdIn.nextInt();
			int v = stdIn.nextInt();
			
			building[b-1][f-1][r-1] += v;
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<10;k++)
				{
					System.out.print(" "+building[i][j][k]);
				}
				System.out.println();
			}
			if(i!=3)
			{
				System.out.println("####################");
			}
		}
		
	}
}