import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int N = sc.nextInt();
			if(N == 0) break;

			Point[] p = new Point[N];
			p[0] = new Point(0,0);

			int maxX = 0;
			int maxY = 0;
			int minX = 0;
			int minY = 0;

			for(int i=0;i<N-1;i++){
				int n = sc.nextInt();
				int d = sc.nextInt();
				int x = p[n].x;
				int y = p[n].y;

				switch(d){
				case 0:
					p[i+1] = new Point(x-1,y);
					minX = Math.min(minX,x-1);
					break;
				case 1:
					p[i+1] = new Point(x,y+1);
					maxY = Math.max(maxY,y+1);
					break;
				case 2:
					p[i+1] = new Point(x+1,y);
					maxX = Math.max(maxX,x+1);
					break;
				case 3:
					p[i+1] = new Point(x,y-1);
					minY = Math.min(minY,y-1);
					break;
				}
			}

			System.out.println((maxX - minX + 1) + " " + (maxY - minY + 1));
		}
	}
}