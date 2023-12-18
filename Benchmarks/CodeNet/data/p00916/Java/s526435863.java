import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	private static int[] xDelta = {-1, 1, 0, 0},
						 yDelta = {0, 0, -1, 1};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		while (n != 0)
		{
			ArrayList<Rect> rects = new ArrayList<Rect>();
			HashSet<Integer> 	xCoors = new HashSet<Integer>(),
								yCoors = new HashSet<Integer>();
			HashMap<Integer,Integer> xIndexing = new HashMap<Integer,Integer>(),
									 yIndexing = new HashMap<Integer,Integer>();
			
			for (int i = 0; i < n; i++)
			{
				int l = in.nextInt(),
						t = in.nextInt(),
						r = in.nextInt(),
						b = in.nextInt();
				
				Rect rec = new Rect(l, t, r, b);
				rects.add(rec);
				
				xCoors.add(l);
				xCoors.add(r);
				yCoors.add(t);
				yCoors.add(b);
			}
			
			ArrayList<Integer> uniqueX = new ArrayList<Integer>(xCoors);
			ArrayList<Integer> uniqueY = new ArrayList<Integer>(yCoors);
			
			Collections.sort(uniqueX);
			Collections.sort(uniqueY);
			for (int i = 0; i < uniqueX.size(); i++)
			{
				int x = uniqueX.get(i);
				xIndexing.put(x, 2*i+1);
			}
			for (int i = 0; i < uniqueY.size(); i++)
			{
				int y = uniqueY.get(i);
				yIndexing.put(y, 2*i+1);
			}
			
			int xn = uniqueX.size()*2 + 1,
				yn = uniqueY.size()*2 + 1;
			
			Grid[][] g = new Grid[xn][yn];
			for (int i = 0; i < xn; i++)
			{
				for (int j = 0; j < yn; j++)
				{
					g[i][j] = new Grid();
				}
			}
			
			for (Rect r : rects)
			{
				int x1i = xIndexing.get(r.x1),
					x2i = xIndexing.get(r.x2),
					y1i = yIndexing.get(r.y1),
					y2i = yIndexing.get(r.y2);
				
				for (int xi = x1i; xi <= x2i; xi++)
				{
					g[xi][y1i].t = Type.BLOCKED;
					g[xi][y2i].t = Type.BLOCKED;
				}
				for (int yi = y1i; yi <= y2i; yi++)
				{
					g[x1i][yi].t = Type.BLOCKED;
					g[x2i][yi].t = Type.BLOCKED;
				}
			}
			
			int regions = 0; 
			for (int x = 0; x < xn; x++)
			{
				for (int y = 0; y < yn; y++)
				{
					if (g[x][y].t == Type.EMPTY)
					{
						Tuple p = new Tuple(x,y);
						regions++;
						LinkedList<Tuple> q = new LinkedList<Tuple>();
						q.add(p);
						
						while (!q.isEmpty())
						{
							Tuple t = q.poll();
							g[t.x][t.y].t = Type.FILLED;
							
							for (int i = 0; i < 4; i++)
							{
								int newX = t.x + xDelta[i],
									newY = t.y + yDelta[i];
								
								if (newX >= 0 && newX < xn && newY >= 0 && newY < yn)
								{
									if (g[newX][newY].t == Type.EMPTY)
									{
										q.add(new Tuple(newX, newY));
									}
								}
							}
						}
					}
				}
			}
			
			System.out.println(regions);
			
			n = in.nextInt();
		}
	}
	
	private static class Tuple
	{
		int x, y;
		
		public Tuple(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}
	
	enum Type
	{
		EMPTY,
		BLOCKED,
		FILLED
	}
	
	private static class Grid
	{
		Type t;
		
		public Grid()
		{
			t = Type.EMPTY;
		}
		
		public String toString()
		{
			switch (t)
			{
			case BLOCKED:
				return "X";
			case EMPTY:
				return " ";
			case FILLED:
				return "O";
			}
			
			return "!";
		}
	}
	
	private static class Rect
	{
		int x1, y1, x2, y2;
		
		public Rect(int x1, int y1, int x2, int y2)
		{
			this.x1 = Math.min(x1, x2);
			this.y1 = Math.min(y1, y2);
			this.x2 = Math.max(x1, x2);
			this.y2 = Math.max(y1, y2);
		}
	}
}