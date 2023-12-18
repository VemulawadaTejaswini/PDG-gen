
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			int N=sc.nextInt(),M=sc.nextInt();
			if ((N|M)==0)break;
			
			int[][] pc = new int[N + 1][2]; // who uses
			
			boolean[][] uses = new boolean[M + 1][1441];
			
			int r = sc.nextInt();
			for (int i = 0; i < r; i++)
			{
				int t=sc.nextInt(),n=sc.nextInt(),m=sc.nextInt(),s=sc.nextInt();
				if (s == 1) // login
				{
					pc[n][0] = m;
					pc[n][1] = t;
				}
				else // logout
				{
					for (int k = pc[n][1]; k < t; k++)
					{
						uses[m][k] = true;
					}
					pc[n][0] = 0;
				}
			}
			
			int q = sc.nextInt();
			for (int i = 0; i < q; i++)
			{
				int ts=sc.nextInt(),te=sc.nextInt(),m=sc.nextInt();
				int count = 0;
				for (int t = ts; t < te; t++)
				{
					if (uses[m][t]) count++;
				}
				System.out.println(count);
			}
		}
	}
}