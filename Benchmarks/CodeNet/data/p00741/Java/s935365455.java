import java.awt.Point;
import java.awt.event.FocusAdapter;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.IntStream;

import javax.naming.InitialContext;
 
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