import java.awt.Point;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
	static int w;
	static int h;
	
	static int[][] map;
	
	static int gnum;
	static int[] gx;
	static int[] gy;
	
	static int sx;
	static int sy;
	
	static int[] smindis;
	static int[][] gmindis;
	
	static int min;
	static int[] stock;
	static int[] order;
	
	private static void check(int index)
	{
		int i, j, k;
		if(index == gnum)
		{
			int len;
			
			len = smindis[order[0]];
			for(i = 1;i < gnum;i++) len += gmindis[order[i-1]][order[i]];
			if(len < min) min = len;
			return;
		}
		
		for(i = 0;i < (gnum - index);i++)
		{
			order[index] = stock[i];
			stock[i] = stock[gnum - index - 1];
			check(index + 1);
			stock[i] = order[index];
		}
	}
	
	private static int distance(int x1, int y1, int x2, int y2)
	{
		int[][] store = new int[h][w];
		
		int x, y;
		for(y = 0;y < h;y++)
			for(x = 0;x < w;x++)
				store[y][x] = -1;
		
		store[y1][x1] = 0;
		
		LinkedList<Point> queue = new LinkedList<Point>();
		LinkedList<Integer> pre = new LinkedList<Integer>();
		
		queue.offer(new Point(x1 - 1, y1));
		pre.offer(new Integer(0));
		queue.offer(new Point(x1 + 1, y1));
		pre.offer(new Integer(0));
		queue.offer(new Point(x1, y1 - 1));
		pre.offer(new Integer(0));
		queue.offer(new Point(x1, y1 + 1));
		pre.offer(new Integer(0));
		
		while(queue.size() > 0)
		{
			Point p = queue.poll();
			Integer num = pre.poll();
			
			if(p.x < 0 || w <= p.x || p.y < 0 || h <= p.y) continue;
			if(map[p.y][p.x] == 1) continue;
			if(store[p.y][p.x] >= 0) continue;
			
			store[p.y][p.x] = num.intValue() + 1;
			
			queue.offer(new Point(p.x - 1, p.y));
			pre.offer(new Integer(store[p.y][p.x]));
			queue.offer(new Point(p.x + 1, p.y));
			pre.offer(new Integer(store[p.y][p.x]));
			queue.offer(new Point(p.x, p.y - 1));
			pre.offer(new Integer(store[p.y][p.x]));
			queue.offer(new Point(p.x, p.y + 1));
			pre.offer(new Integer(store[p.y][p.x]));
		}
		
		return store[y2][x2];
	}
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		int i, j, k;
		int x, y;
		
		while(true)
		{
			// 初期化 ------------------------------------------------------------------------
			w = sca.nextInt();
			h = sca.nextInt();
			
			if(w == 0) break;
			
			map = new int[h][w];
			gx = new int[10];
			gy = new int[10];
			
			gnum = 0;
			for(y = 0;y < h;y++)
			{
				String line = sca.next();
				for(x = 0;x < w;x++)
				{
					switch(line.charAt(x))
					{
					case '.': map[y][x] = 0; break;
					case '*':
						map[y][x] = 0; 
						gx[gnum] = x;
						gy[gnum] = y;
						gnum++;
						break;
					case 'x': map[y][x] = 1; break;
					case 'o': 
						map[y][x] = 0;
						sx = x;
						sy = y;
						break;
					}
				}
			}
			
			// 処理1 : スタートと各ゴミの各点の最短距離を求める ------------------------------------------------------------------------
			smindis = new int[gnum];
			gmindis = new int[gnum][gnum];
			
			int dis;
			for(i = 0;i < gnum;i++)
			{
				dis = distance(sx, sy, gx[i], gy[i]);
				if(dis < 0) break;
				smindis[i] = dis;
			}
			if(i != gnum)
			{
				System.out.println("-1");
				continue;
			}
			
			for(i = 0;i < gnum;i++)
			{
				for(j = i;j < gnum;j++)
				{
					gmindis[j][i] = gmindis[i][j] = distance(gx[i], gy[i], gx[j], gy[j]);
				}
			}
			
			// 処理2 : 最短経路を計算する ------------------------------------------------------------------------
			min = Integer.MAX_VALUE;
			stock = new int[gnum];
			for(i = 0;i < gnum;i++) stock[i] = i;
			order = new int[gnum];
			
			check(0);
			
			// 出力 ------------------------------------------------------------------------
			System.out.println(min);
		}
	}
}