import java.awt.Point;
import java.awt.event.FocusAdapter;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.IntStream;
 
public class Main {
     
	static int W, H;
	static int[][] map;
	static int[][] check;
	
	static void bfs(int sx, int sy)
	{
		LinkedList<Point> queue = new LinkedList<Point>();
    	queue.offer(new Point(sx, sy));
    	
    	while (!queue.isEmpty()) {
			Point p = queue.poll();
			
			if( !((0 <= p.x) && (p.x < W)) ) continue;
			if( !((0 <= p.y) && (p.y < H)) ) continue;
			if(check[p.y][p.x] == 1) continue;
			if(map[p.y][p.x] == 0) continue;
			
			check[p.y][p.x] = 1;
			
			queue.offer(new Point(p.x - 1, p.y - 1));
			queue.offer(new Point(p.x - 1, p.y));
			queue.offer(new Point(p.x - 1, p.y + 1));
			queue.offer(new Point(p.x    , p.y - 1));
			queue.offer(new Point(p.x    , p.y + 1));
			queue.offer(new Point(p.x + 1, p.y - 1));
			queue.offer(new Point(p.x + 1, p.y));
			queue.offer(new Point(p.x + 1, p.y + 1));
		}
	}
	
    static void start()
    {
    	check = new int[H][W];
    	for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				check[y][x] = 0;
			}
		}
    	
    	int count = 0;
    	for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				if(map[y][x] == 0) continue;
				if(check[y][x] == 1) continue;
				count++;
				bfs(x, y);
			}
		}
    	
    	System.out.println(count);
    }
     
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
        	W = sca.nextInt();
        	H = sca.nextInt();
        	if(W == 0) break;
        	
        	map = new int[H][W];
        	for (int y = 0; y < H; y++) {
				for (int x = 0; x < W; x++) {
					map[y][x] = sca.nextInt();
				}
			}
            
            start();
        }
        
    }
}