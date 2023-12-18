import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int distToEnter(int N , int row , int col){
		int ret = Math.min(row, col);
		ret = Math.min(ret, N - 1 - row);
		ret = Math.min(ret, N - 1 - col);
		return ret;
	}
	static class Point{
		int x;
		int y;
		Point(int a , int b){
			x = a;
			y = b;
		}
	}
	static long solve(int N , int P[]){		
		int dist[][] = new int[N][N];
		int occupied[][] = new int[N][N];
		for(int i = 0 ; i < N ; ++i){
			for(int j = 0 ; j < N ; ++j){
				dist[i][j] = distToEnter(N, i, j);
				occupied[i][j] = 1;
			}
		}
		long ret = 0;
		int dx[] = { 0 , 0 , 1 , -1};
		int dy[] = { 1 ,-1 , 0 ,  0};
		for(int p : P){
			int row = p / N;
			int col = p % N;
			ret += dist[row][col];
			occupied[row][col] = 0;
			Point init = new Point(col, row);
			Queue<Point> q = new LinkedList<Point>();
			q.add(init);
			while(!q.isEmpty()){
				Point cp = q.poll();
				int d = dist[cp.y][cp.x] + occupied[cp.y][cp.x];
				for(int k = 0 ; k < 4 ; ++k){
					int nx = cp.x + dx[k];
					int ny = cp.y + dy[k];
					if(nx < 0 || ny < 0 || nx >= N || ny >= N){
						continue;
					}
//					System.out.println(dist[ny][nx]+" "+d+" "+nx+" "+ny);
					if(dist[ny][nx] > d){
						dist[ny][nx] = d;
						q.add(new Point(nx , ny));
					}
				}
			}
//			System.out.println(Arrays.deepToString(dist));
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P[] = new int[N * N];
		for(int i = 0 ; i < P.length ; ++i){
			P[i] = sc.nextInt() - 1;
		}
		System.out.println(solve(N , P));
	}
}
