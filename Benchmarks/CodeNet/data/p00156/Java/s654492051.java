import java.util.*;

public class Main {

	class Point{
		int y, x;
		Point(int y, int x){
			this.y = y;
			this.x = x;
		}
	}

	char[][] board;
	int[] dx = {0,0,1,-1};
	int[] dy = {1,-1,0,0};
	int W, H;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			W = in.nextInt() + 2;
			H = in.nextInt() + 2;
			if(W==2 && H==2) return;
			board = new char[H][W];
			for(int i=0; i<H; i++){
				Arrays.fill(board[i], '.');
			}
			for(int i=0; i<H-2; i++){
				String line = in.next();
				for(int j=0; j<W-2; j++){
					board[i+1][j+1] = line.charAt(j);
				}
			}
			System.out.println(solve());
		}
	}

	int solve(){
		Queue<Point> Q1 = new LinkedList<Point>(), Q2 = new LinkedList<Point>();
		int[][] dist = new int[H][W];
		boolean[][] visited = new boolean[H][W];
		for(int i=0; i<H; i++){
			visited[i][0] = true;
			visited[i][W-1] = true;
			Q1.add(new Point(i,0));
			Q1.add(new Point(i,W-1));
		}
		for(int j=1; j<W-1; j++){
			visited[0][j] = true;
			visited[H-1][j] = true;
			Q1.add(new Point(0,j));
			Q1.add(new Point(H-1,j));
		}
		for(;;){
			while(!Q1.isEmpty()){
				Point tp = Q1.poll();
				for(int k=0; k<4; k++){
					int ny = tp.y + dy[k], nx = tp.x + dx[k];
					if(0<=ny && ny<H && 0<=nx && nx<W && !visited[ny][nx]){
						visited[ny][nx] = true;
						if(board[ny][nx] == '&'){
							return dist[tp.y][tp.x];
						}
						else if(board[ny][nx] == '.'){
							dist[ny][nx] = dist[tp.y][tp.x];
							Q1.add(new Point(ny,nx));
						}
						else if(board[ny][nx] == '#'){
							dist[ny][nx] = dist[tp.y][tp.x] + 1;
							Q2.add(new Point(ny,nx));
						}
					}
				}
			}
			while(!Q2.isEmpty()){
				Point tp = Q2.poll();
				for(int k=0; k<4; k++){
					int ny = tp.y + dy[k], nx = tp.x + dx[k];
					if(0<=ny && ny<H && 0<=nx && nx<W && !visited[ny][nx]){
						visited[ny][nx] = true;
						if(board[ny][nx] == '&'){
							return dist[tp.y][tp.x];
						}
						else if(board[ny][nx] == '.'){
							dist[ny][nx] = dist[tp.y][tp.x];
							Q1.add(new Point(ny,nx));
						}
						else if(board[ny][nx] == '#'){
							dist[ny][nx] = dist[tp.y][tp.x];
							Q2.add(new Point(ny,nx));
						}
					}
				}
			}
		}
	}

	public static void main(String args[]){
		new Main().run();
	}
}