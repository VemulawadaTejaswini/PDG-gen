import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {
	
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		Data[] data = new Data[n];
		for(int i = 0; i < n; i++) {
			data[i] = new Data(sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		Arrays.sort(data);
		int lp = 0;
		int rp = 0;
		int max = 0;
		int lastLp = -1;
		int lastRp = -1;
		while(rp < n && lp < n) {
			
			//System.out.println(lp + " " + rp);
			while(rp+1 < n && data[lp].b + d >= data[rp+1].b) {
				System.out.println(lp + " " + rp);
				rp++;
			}
			if(lastLp == lp && lastRp == rp) {
				lp++;
				rp++;
			}
			
			int xmin = Integer.MAX_VALUE;
			int xmax = 0;
			int ymin = Integer.MAX_VALUE;
			int ymax = 0;
			
			if(lp != rp) 
			for(int i = lp; i <= rp; i++) {
				int x = data[i].x;
				int y = data[i].y;
				
				xmin = Math.min(x, xmin);
				xmax = Math.max(x, xmax);
				ymin = Math.min(y, ymin);
				ymax = Math.max(y, ymax);
			}
			else {
				xmin = 0;
				xmax = 0;
				ymin = 0;
				xmax = 0;
			}
			
			max = Math.max(max, (xmax - xmin)*(ymax - ymin));
			
			lastLp = lp;
			lastRp = rp;
			
			lp = rp;
			rp = lp;
			
		}
		
		System.out.println(max);
		
		
		
	}
	
	static class Data implements Comparable<Data> {
		int x;
		int y;
		int b;
		
		Data(int a , int c, int d) {
			x = a;
			y = c;
			b = d;
		}
		@Override
		public int compareTo(Data o) {
			return this.b - o.b;
		}
	}
 	
}