

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);
	static int w;
	static int h;
	static int[][] hwall; //is there a h wall to the down of this tile?
	static int[][] vwall; //is there a v wall to the right of this tile?
	static int[][] mark;
	
	static class Tile
	{
		int x;
		int y;
		
		public Tile(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
			w = scan.nextInt();
			h = scan.nextInt();
			
			if(w == 0)return;
			
			hwall = new int[w][h-1];
			vwall = new int[w-1][h];
			mark = new int[w][h];
			mark[0][0] = 1;
			
			for(int y = 0; y < h; y++)
			{
				for(int x = 0; x < w-1; x++)
				{
	//				System.out.println("VWALLS");
					vwall[x][y] = scan.nextInt();
				}
				
				if(y < h - 1)
				{
					for(int x = 0; x < w; x++)
					{
	//					System.out.println("HWALLS");
						hwall[x][y] = scan.nextInt();
					}
				}
			}
			
			ArrayList<Tile> list = new ArrayList<Tile>();
			
			list.add(new Tile(0,0));
			
			while(list.size() > 0)
			{
				Tile cur = list.get(0);
				int curm = mark[cur.x][cur.y];
				list.remove(cur);
				
				int lem;
				
	//			System.out.println("Walk " + cur.x + ", " + cur.y);
				
				if(cur.x < w-1 && vwall[cur.x][cur.y] == 0)
				{
					//mark right
					lem = mark[cur.x+1][cur.y];
					if(lem == 0 || lem > curm+1)
					{
						mark[cur.x+1][cur.y] = curm+1;
						list.add(new Tile(cur.x+1, cur.y));
					}
				}
				
				if(cur.x > 0 && vwall[cur.x-1][cur.y] == 0)
				{
					//mark left
					lem = mark[cur.x-1][cur.y];
					if(lem == 0 || lem > curm+1)
					{
						mark[cur.x-1][cur.y] = curm+1;
						list.add(new Tile(cur.x-1, cur.y));
					}
				}
				
				if(cur.y > 0 && hwall[cur.x][cur.y-1] == 0)
				{			
					//mark up
					lem = mark[cur.x][cur.y-1];
					if(lem == 0 || lem > curm+1)
					{
						mark[cur.x][cur.y-1] = curm+1;
						list.add(new Tile(cur.x, cur.y-1));
					}
				}
				
				if(cur.y < h-1 && hwall[cur.x][cur.y] == 0)
				{			
					//mark down
					lem = mark[cur.x][cur.y+1];
					if(lem == 0 || lem > curm+1)
					{
						mark[cur.x][cur.y+1] = curm+1;
						list.add(new Tile(cur.x, cur.y+1));
					}
				}
				
			}
			
			System.out.println(mark[w-1][h-1]);
		}
	}

}

