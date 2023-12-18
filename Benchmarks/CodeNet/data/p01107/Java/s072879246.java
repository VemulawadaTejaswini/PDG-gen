

import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int n;
		int m;
		
		while(true)
		{
			n = scan.nextInt();
			m = scan.nextInt();
			
			if(n==0 && m == 0)
			{
				return;
			}
			else
			{
				new DataSet(n, m);
			}
		}
	}

	static class DataSet 
	{
		int width;
		int height;
		int room[][] = new int[50][50];
		
		public DataSet(int n, int m)
		{
			height = n;
			width = m;
			
			for(int i = 0; i < height; i++)
			{
				String str = scan.next();
				for(int j = 0; j < width; j++)
				{
					String in = str.substring(j, j+1);
					
					if(in.equals("."))
					{
						room[j][i] = 1; //1 = floor
					}
					else
					{
						room[j][i] = 0;
					}
				}
			}
			
			//calculate
			Attempt att = new Attempt(width, height, room, 0, 0, false, false, false);
			att.set(0, 0, 0);
			boolean ans = att.compute();
			
			if(ans)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
	
	static class Attempt
	{
		int width;
		int height;
		int x;
		int y;
		int room[][];
		boolean t1;
		boolean t2;
		boolean t3;
		
		public Attempt(int w, int h, int[][] mapToCopy, int x, int y, boolean t1, boolean t2, boolean t3)
		{
			this.width = w;
			this.height = h;
			copy(mapToCopy);
			this.x = x;
			this.y = y;
			this.t1 = t1;
			this.t2 = t2;
			this.t3 = t3;
//			System.out.println("0,1 = " + room[0][1]);
		}
		
		public void set(int x,int y,int value)
		{
			room[x][y] = value;
		}
		
		public void copy(int[][] ori)
		{
			room = new int[width][height];
			for(int i = 0; i < width; i++)
			{
				for(int j = 0; j < height; j++)
				{
					room[i][j] = ori[i][j];
				}
			}
		}
		
		public boolean compute()
		{
			boolean up = false;
			boolean down = false;
			boolean left = false;
			boolean right = false;
			
//			System.out.println("Computing [" + x + "," + y + "] T1:" + t1 + " T2: " + t2 + " T3: " + t3 );
			
			if(x == width-1 && y == 0) 
			{
				t1 = true;
//				System.out.println("FOUND TREASURE 1!");
			}
			if(x == width-1 && y == height-1) 
			{
				t2 = true;
//				System.out.println("FOUND TREASURE 2!");
			}
			if(x == 0 && y == height-1) 
			{
				t3 = true;
//				System.out.println("FOUND TREASURE 3!");
			}
			
			if(t1 == true && t2 == true && t3 == true) 
			{
				if((x == 1 && y == 0) || (x == 0 && y == 1))
				{
					return true;
				}
			}
			
			//up
			if(y > 0 && room[x][y-1] == 1)
			{
				Attempt att = new Attempt(width, height, room, x, y-1, t1, t2, t3);
				att.set(x, y-1, 0);
				up = att.compute();
			}
			//down
			if(y < height-1 && room[x][y+1] == 1)
			{
				Attempt att = new Attempt(width, height, room, x, y+1, t1, t2, t3);
				att.set(x, y+1, 0);
				down = att.compute();
			}
			//left
			if(x > 0 && room[x-1][y] == 1)
			{
				Attempt att = new Attempt(width, height, room, x-1, y, t1, t2, t3);
				att.set(x-1, y, 0);
				left = att.compute();
			}
			//right
			if(x < width-1 && room[x+1][y] == 1)
			{
				Attempt att = new Attempt(width, height, room, x+1, y, t1, t2, t3);
				att.set(x+1, y, 0);
				right = att.compute();
			}
			
			return up || down || left || right;
		}
	}

}

