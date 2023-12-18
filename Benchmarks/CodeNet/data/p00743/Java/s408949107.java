import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static class Walk implements Comparable<Walk>{
		int pos;
		int prev_pos;
		int speed;
		double time;
		
		public Walk(int pos, int prev_pos, int speed, double time) {
			super();
			this.pos = pos;
			this.prev_pos = prev_pos;
			this.speed = speed;
			this.time = time;
		}

		@Override
		public int compareTo(Walk o) {
			return Double.compare(this.time, o.time);
		}
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			final int s = sc.nextInt() - 1;
			final int g = sc.nextInt() - 1;
			
			int[][] dist  = new int[n][n];
			int[][] limit = new int[n][n];
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					dist[i][j] = -1;
					limit[i][j] = -1;
				}
			}
			
			for(int i = 0; i < m; i++){
				final int x = sc.nextInt() - 1;
				final int y = sc.nextInt() - 1;
				final int d = sc.nextInt();
				final int c = sc.nextInt();
				
				dist[x][y]  = dist[y][x]  = d;
				limit[x][y] = limit[y][x] = c;
			}
			
			boolean[][][] is_visited = new boolean[n][n][30 + 1];
			
			PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
			queue.add(new Walk(s, -1, 1, 0));
			
			boolean flag = false;
			while(!queue.isEmpty()){
				Walk walk = queue.poll();
				
				//System.out.println(walk.pos + " " + walk.prev_pos + " " + walk.time + " " + walk.speed);
				
				if(walk.prev_pos != -1 && is_visited[walk.pos][walk.prev_pos][walk.speed]){
					continue;
				}else if(walk.prev_pos != -1){
					is_visited[walk.pos][walk.prev_pos][walk.speed] = true;
				}
				
				if(walk.pos == g && walk.speed == 1){
					System.out.printf("%f\n", walk.time);
					flag = true;
					break;
				}
				
				for(int to = 0; to < n; to++){
					if(dist[walk.pos][to] < 0){
						continue;
					}else if(to == walk.prev_pos){
						continue;
					}
					
					if(walk.prev_pos == -1){
						if(limit[walk.pos][to] >= 1 && !is_visited[to][walk.pos][1]){
							queue.add(new Walk(to, walk.pos, 1, walk.time + dist[walk.pos][to]));
						}
					}else{
						for(int speed = -1; speed <= 1; speed++){
							final int next_speed = walk.speed + speed;
						
							if(next_speed <= 0){
								continue;
							}else if(limit[walk.pos][to] < next_speed){
								break;
							}else if(is_visited[to][walk.pos][next_speed]){
								continue;
							}
						
							queue.add(new Walk(to, walk.pos, next_speed, walk.time + (double)(dist[walk.pos][to]) / next_speed));
						}
					}
				}
			}
			
			if(!flag){
				System.out.println("unreachable");
			}
		}
	}

}