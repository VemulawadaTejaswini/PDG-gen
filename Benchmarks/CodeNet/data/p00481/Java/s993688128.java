import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}
	
	public Main(){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		char[][] field = new char[w+2][h+2];
		Point start = null;
		for(int i=1;i<=h;i++){
			String line = sc.next();
			for(int j=1;j<=w;j++){
				field[j][i] = line.charAt(j-1);
				if(field[j][i] == 'S')
					start = new Point(j,i);
			}
		}
		for(int i=0;i<h+2;i++){
			field[0][i]='X';
			field[w+1][i] = 'X';
			field[i][0] = 'X';
			field[i][h+1] = 'X';
		}
		
		solve(h, w, field, n, start);
	}
	


	private void solve(int h, int w, char[][] field, int n, Point start){
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, -1, 0, 1};
		int[][] d = new int[w+2][h+2];
		LinkedList<Point> queue = new LinkedList<Point>(); 
		
		int res = 0;
		final int INF = Integer.MAX_VALUE;
		for(int i=1;i<=n;i++){
			for(int j=0;j<d.length;j++)
				Arrays.fill(d[j], INF);
			queue.offer(start);
			d[start.x][start.y] = 0;
			
			while(!queue.isEmpty()){
				Point p = queue.poll();

				for(int j=0;j<4;j++){
					int nx = p.x+dx[j];
					int ny = p.y+dy[j];
					if(field[nx][ny]!='X' && d[nx][ny] == INF){
						if(field[nx][ny]==i+'0'){
							queue.clear();
							start = new Point(nx, ny);
							res += d[p.x][p.y]+1;
							break;
						}else{
							d[nx][ny] = d[p.x][p.y]+1;
							queue.offer(new Point(nx, ny));
						}
					}
				}
			}
		}
		
		
		System.out.println(res);
	}
	
	private class Point{
		int x;
		int y;
		
		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
}