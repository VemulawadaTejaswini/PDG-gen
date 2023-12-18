import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static class Point{
		int old, x, y;

		public Point(int old, int x, int y) {
			super();
			this.old = old;
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		
		final int MAX = 30;
		
		while(true){
			final int t = sc.nextInt();
			final int n = sc.nextInt();
			
			if(t == 0 && n == 0){
				break;
			}
			
			boolean[][] visited = new boolean[MAX + 1 + MAX][MAX + 1 + MAX];
			boolean[][] wall = new boolean[MAX + 1 + MAX][MAX + 1 + MAX];
			
			for(int i = 0; i < n; i++){
				final int x = sc.nextInt();
				final int y = sc.nextInt();
				
				wall[y + MAX][x + MAX] = true;
			}
			
			final int s_x = sc.nextInt();
			final int s_y = sc.nextInt();
			
			Point p = new Point(0 ,s_x + MAX, s_y + MAX);
			LinkedList<Point> queue = new LinkedList<Point>();
			queue.add(p);
			
			int count = 0;
			while(!queue.isEmpty()){
				Point point = queue.poll();
				
				if(point.old > t){
					break;
				}else if(visited[point.y][point.x]){
					continue;
				}
				
				visited[point.y][point.x] = true;
				count++;
				
				if(point.x > 0 && !wall[point.y][point.x - 1] && !visited[point.y][point.x - 1]){
					queue.add(new Point(point.old + 1, point.x - 1, point.y));
				}
				
				if(point.x < (MAX + 1 + MAX) && !wall[point.y][point.x + 1] && !visited[point.y][point.x + 1]){
					queue.add(new Point(point.old + 1, point.x + 1, point.y));
				}
				
				if(point.y > 0 && !wall[point.y - 1][point.x] && !visited[point.y - 1][point.x]){
					queue.add(new Point(point.old + 1, point.x, point.y - 1));
				}
				
				if(point.y < (MAX + 1 + MAX) && !wall[point.y + 1][point.x] && !visited[point.y + 1][point.x]){
					queue.add(new Point(point.old + 1, point.x, point.y + 1));
				}
				
				if(point.x > 0 && point.y > 0 && !wall[point.y - 1][point.x - 1] && !visited[point.y - 1][point.x - 1]){
					queue.add(new Point(point.old + 1, point.x - 1, point.y - 1));
				}
				
				if(point.x < (MAX + 1 + MAX) && point.y < (MAX + 1 + MAX) && !wall[point.y + 1][point.x + 1] && !visited[point.y + 1][point.x + 1]){
					queue.add(new Point(point.old + 1, point.x + 1, point.y+1));
				}
			}
			
			System.out.println(count);
		}
		
		
	}

}