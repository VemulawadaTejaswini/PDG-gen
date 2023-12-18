import java.awt.Point;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
     
	static int W, H;
	static int[][] tate;
	static int[][] yoko;
	
    static void start()
    {
    	int[][] check = new int[H][W];
    	for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				check[y][x] = 0;
			}
		}
    	
    	LinkedList<Point> queue = new LinkedList<Point>();
    	LinkedList<Integer> turn = new LinkedList<Integer>();
    	queue.offer(new Point(0, 0));
    	turn.offer(new Integer(1));
    	
    	while (!queue.isEmpty()) {
			Point p = queue.poll();
			int t = turn.poll().intValue();
			
			if(check[p.y][p.x] != 0) continue;
			check[p.y][p.x] = t;
			
			// 上
			if(0 < p.y)
			{
				// 壁判定
				if(yoko[p.y-1][p.x] == 0)
				{
					queue.offer(new Point(p.x, p.y-1));
					turn.offer(new Integer(t + 1));
				}
			}
			
			// 下
			if(p.y < H-1)
			{
				// 壁判定
				if(yoko[p.y][p.x] == 0)
				{
					queue.offer(new Point(p.x, p.y+1));
					turn.offer(new Integer(t + 1));
				}
			}
			
			// 左
			if(0 < p.x)
			{
				// 壁判定
				if(tate[p.y][p.x-1] == 0)
				{
					queue.offer(new Point(p.x-1, p.y));
					turn.offer(new Integer(t + 1));
				}
			}
			
			// 右
			if(p.x < W-1)
			{
				// 壁判定
				if(tate[p.y][p.x] == 0)
				{
					queue.offer(new Point(p.x+1, p.y));
					turn.offer(new Integer(t + 1));
				}
			}
		}
    	
    	System.out.println(check[H-1][W-1]);
    }
     
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
        	W = sca.nextInt();
        	H = sca.nextInt();
        	if(W == 0) break;
        	
        	tate = new int[H][W-1];
        	yoko = new int[H-1][W];
        	int y;
        	for (y = 0; y < H-1; y++) {
				for (int x = 0; x < W-1; x++) {
					tate[y][x] = sca.nextInt();
				}
				for (int x = 0; x < W; x++) {
					yoko[y][x] = sca.nextInt();
				}
			}
        	for (int x = 0; x < W-1; x++) {
				tate[y][x] = sca.nextInt();
			}
            
            start();
        }
        
    }
}