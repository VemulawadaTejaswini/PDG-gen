import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");

		int h = Integer.parseInt(tmpArray[0]);
		int w = Integer.parseInt(tmpArray[1]);
		int n = Integer.parseInt(tmpArray[2]);

		char[][] matrix = new char[h][w];
		Point[] cheese = new Point[n + 1];
		int cheeseID = 0;
		
		for(int i = 0; i < h; i++){
			String tmp = br.readLine();
			for(int j = 0 ; j < w; j++){
				matrix[i][j] = tmp.charAt(j);
				if(Character.isDigit(matrix[i][j])){
					cheese[matrix[i][j] - '0'] = new Point(j, i);
				}
				
				else if(matrix[i][j] == 'S'){
					cheese[0] = new Point(j, i);
				}
			}
						
		}
		
		int dist = 0;
		for(int i = 1; i <= n; i++){
			int tmpdist = bfs(matrix, cheese[i - 1].x, cheese[i - 1].y, cheese[i].x, cheese[i].y);
			dist += tmpdist;
//			System.out.println((i-1)+"to"+i+ " "+tmpdist);
		}
		
		System.out.println(dist);

	}

	static int bfs(char[][] matrix, int startX, int startY, int goalX, int goalY){
		ArrayDeque<Point> queue = new ArrayDeque<Point>();

		int[][] dist = new int[matrix.length][matrix[0].length];
		for(int i = 0; i < dist.length ; i++){
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}

		queue.add(new Point(startX, startY));
		dist[startY][startX] = 0;

//		int currentDist = 1;
		int x;
		int y;
		while(!queue.isEmpty()){
			Point p = queue.poll();
			
			x = p.x;
			y = p.y;
			
//			if(x == goalX && y == goalY){
//				break;
//			}
			
			//???
			if(y > 0 && matrix[y - 1][x] != 'X' && dist[y - 1][x] > dist[y][x] + 1){
				dist[y - 1][x] = dist[y][x] + 1;
				queue.push(new Point(x, y - 1));
			}
			//???
			if(y < matrix.length - 1 && matrix[y + 1][x] != 'X' && dist[y + 1][x] > dist[y][x] + 1){
				dist[y + 1][x] = dist[y][x] + 1;
				queue.push(new Point(x, y + 1));
			}
			//???
			if(x > 0 && matrix[y][x - 1] != 'X' && dist[y][x - 1] > dist[y][x] + 1){
				dist[y][x - 1] = dist[y][x] + 1;
				queue.push(new Point(x - 1, y));
			}
			//???
			if(x < matrix[0].length - 1 && matrix[y][x + 1] != 'X' && dist[y][x + 1] > dist[y][x] + 1){
				dist[y][x + 1] = dist[y][x] + 1;
				queue.push(new Point(x + 1, y));
			}
			
			//System.out.println("queue size"+queue.size());
//			currentDist++;
		}

		//debug
//		for(int i =0 ; i < dist.length ; i++){
//			for(int j = 0; j < dist[0].length ; j++){
//				System.out.printf("%11d", dist[i][j]);
//			}
//			System.out.println();
//		}
		return dist[goalY][goalX];
	}

}

class Point {
	short x;
	short y;

	public Point(int x, int y){
		this.x = (short)x;
		this.y = (short)y;
	}
}