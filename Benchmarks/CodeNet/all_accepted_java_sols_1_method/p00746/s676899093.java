

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int n = sc.nextInt();
			if(n == 0)return;
			int[] x = new int[n];
			int[] y = new int[n];
			int x1 = 0;
			int x2 = 0;
			int y1 = 0;
			int y2 = 0;
			
			x[0] = 0;
			y[0] = 0;
			
			for(int i = 1; i < n; i++)
			{
				int sq1 = sc.nextInt();
				int dir = sc.nextInt(); //left down right up
				
				if(dir == 0)
				{
					x[i] = x[sq1] - 1;
					y[i] = y[sq1];
				}
				else if(dir == 1)
				{
					x[i] = x[sq1];
					y[i] = y[sq1]+1;
				}
				else if(dir == 2)
				{
					x[i] = x[sq1]+1;
					y[i] = y[sq1];
				}
				else if(dir == 3)
				{
					x[i] = x[sq1];
					y[i] = y[sq1]-1;
				}
					
				x1 = Math.min(x1, x[i]);
				x2 = Math.max(x2, x[i]);
				y1 = Math.min(y1, y[i]);
				y2 = Math.max(y2, y[i]);
			}
			
			int w = x2-x1+1;
			int h = y2-y1+1;
			System.out.println(w + " " + h);
		}
	}

}

