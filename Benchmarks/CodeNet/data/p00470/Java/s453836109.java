import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;

			int[][][] t = new int[h+2][w+2][2];
			LinkedList<Point> open = new LinkedList<Point>();
			open.add(new Point(1,0));
			open.add(new Point(0,1));
			t[0][1][0] = 1;
			t[1][0][1] = 1;

			while(!open.isEmpty()){
				Point p = open.poll();

				t[p.y][p.x+1][0] = (t[p.y][p.x+1][0] + t[p.y][p.x][0]) % 100000;
				t[p.y][p.x+2][0] = (t[p.y][p.x+2][0] + t[p.y][p.x][1]) % 100000;
				t[p.y+1][p.x][1] = (t[p.y+1][p.x][1] + t[p.y][p.x][1]) % 100000;
				t[p.y+2][p.x][1] = (t[p.y+2][p.x][1] + t[p.y][p.x][0]) % 100000;

				Point np = new Point(p.x+1,p.y);
				if(!open.contains(np) && (np.x!=w-1 || np.y!=h-1) && np.x<w) open.add(np);
				np = new Point(p.x,p.y+1);
				if(!open.contains(np) && (np.x!=w-1 || np.y!=h-1) && np.y<h) open.add(np);
			}

			System.out.println((t[h-1][w-1][0] + t[h-1][w-1][1] +
													t[h-1][w][0] + t[h-1][w][1] + 
													t[h][w-1][0] + t[h][w-1][1]) % 100000);
		}
	}
}