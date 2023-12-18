import java.awt.Point;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	
	static Point wh;
	
	// -1 : a < b
	//  0 : a = b
	//  1 : a > b
	static int cmp(Point a, Point b)
	{
		int la = a.x*a.x + a.y*a.y;
		int lb = b.x*b.x + b.y*b.y;
		
		if(la < lb) return -1;
		if(la > lb) return 1;
		
		if(a.y < b.y) return -1;
		if(a.y > b.y) return 1;
		
		return 0;
	}
	
	static void start()
	{
		int w, h;
		Point min = new Point(200, 200);
		
		for(h = 1;h <= 150;h++)
			for(w = 1;w <= 150;w++)
			{
				if(h == wh.y && w == wh.x) continue;
				if(h >= w) continue;
				
				Point newp = new Point(w, h);
				if(cmp(wh, newp) == 1) continue;
				
				if(cmp(min, newp) == 1)
				{
					min = newp;
				}
			}
		
		System.out.printf("%d %d\n", min.y, min.x);
	}
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			int h = sca.nextInt();
			int w = sca.nextInt();
			if(h == 0) break;
			
			wh = new Point(w, h);
			start();
		}
	}
}