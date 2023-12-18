import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	
	public static final int DIRS  = 4;
	public static final int UP    = 0;
	public static final int LEFT  = 1;
	public static final int DOWN  = 2;
	public static final int RIGHT = 3;
	
	public static final int[][] move_dir = new int[][]{{0,-1}, {-1, 0}, {0, 1}, {1, 0}};
	
	public static final int MAX_SIZE = 30;
	public static final int MAX_WALL = 900;
	
	public static boolean is_ok(int x, int y, int w, int h){
		if(x < 0 || y < 0 || x >= w || y >= h){
			return false;
		}else{
			return true;
		}
	}
	
	public static class Walk implements Comparable<Walk>{
		int x, y;
		int time;
		int worth_time;
		
		public Walk(int x, int y, int time, int worth_time){
			super();
			this.x = x;
			this.y = y;
			this.time = time;
			this.worth_time = worth_time;
		}

		@Override
		public int compareTo(Walk o) {
			if(this.worth_time != o.worth_time){
				return this.worth_time - o.worth_time;
			}else{
				return this.time - o.time;
			}
		}
	}
	
	public static int Dijkstra(int[][][] free_id, int[][][] cost, final int w, final int h){
		boolean[][][] visited = new boolean[h][w][h * w];
		
		PriorityQueue<Walk> queue = new PriorityQueue<Main.Walk>();
		queue.add(new Walk(0, 0, 0, cost[0][0][0]));
		
		int min = INF;
		
		while(!queue.isEmpty()){
			Walk walk = queue.poll();
			
			if(walk.time >= h * w){
				continue;
			}else if(visited[walk.y][walk.x][walk.time]){
				continue;
			}else{
				visited[walk.y][walk.x][walk.time] = true;
			}
			//System.out.println(walk.x + " " + walk.y + " " + walk.time + " " + walk.worth_time);
			
			if(walk.x == w - 1 && walk.y == h - 1){
				//System.out.println(walk.time);
				min = Math.min(min, walk.worth_time);
				break;
			}
			
			final int cur_y = walk.y;
			final int cur_x = walk.x;
			final int cur_time  = walk.time;
			
			for(int dir = 0; dir < DIRS; dir++){
				if(free_id[cur_y][cur_x][dir] == 0){
					continue;
				}
				
				final int next_x    = cur_x + move_dir[dir][0];
				final int next_y    = cur_y + move_dir[dir][1];
				final int next_time = cur_time + 1;
				final int failer_time = cur_time + cost[free_id[cur_y][cur_x][dir]][cur_y][cur_x];
				
				final int next_worth_time = Math.max(next_time, Math.max(walk.worth_time, failer_time));
				
				if(!is_ok(next_x, next_y, w, h)){
					continue;
				}
				
				queue.add(new Walk(next_x, next_y, next_time, next_worth_time));
			}			
		}
		
		return min == INF ? -1 : min;
	}
	
	public static void BFS(int not, int[][][] free_id, int[][][] cost, final int w, final int h){
		for(int y = 0; y < h; y++){
			for(int x = 0; x < w; x++){
				cost[not][y][x] = INF;
			}
		}
		
		LinkedList<Integer> h_pos = new LinkedList<Integer>();
		LinkedList<Integer> w_pos = new LinkedList<Integer>();
		LinkedList<Integer> time  = new LinkedList<Integer>();
		
		w_pos.add(w - 1);
		h_pos.add(h - 1);
		time.add(0);
		cost[not][h - 1][w - 1] = 0;
		
		while(!time.isEmpty()){
			final int cur_x = w_pos.poll();
			final int cur_y = h_pos.poll();
			final int cur_time = time.poll();
			
			for(int dir = 0; dir < DIRS; dir++){
				if(not != 0 && free_id[cur_y][cur_x][dir] == not){
					continue;
				}else if(free_id[cur_y][cur_x][dir] == 0){
					continue;
				}
				
				final int next_x    = cur_x + move_dir[dir][0];
				final int next_y    = cur_y + move_dir[dir][1];
				final int next_time = cur_time + 1;
				
				if(!is_ok(next_x, next_y, w, h)){
					continue;
				}else if(cost[not][next_y][next_x] != INF){
					continue;
				}
				
				cost[not][next_y][next_x] = next_time;
				h_pos.add(next_y);
				w_pos.add(next_x);
				time.add(next_time);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int h = sc.nextInt();
			final int w = sc.nextInt();
			
			if(h == 0 && w == 0){
				break;
			}
			
			boolean[][][] can_move = new boolean[h][w][DIRS];
			//1-indexed
			int[][][] free_id = new int[h][w][DIRS];
			int free_count = 1;
			
			for(int i = 0; i < 2 * h - 1; i++){
				final int cur_h = i / 2;
				//System.out.println(i + " " + cur_h);
				
				if(i % 2 == 0){
					//w
					for(int j = 0; j < w - 1; j++){
						boolean is_free = sc.nextInt() == 0;
						
						if(is_free){
							can_move[cur_h][j    ][RIGHT] = true;
							free_id [cur_h][j    ][RIGHT] = free_count;
							can_move[cur_h][j + 1][LEFT ] = true;
							free_id [cur_h][j + 1][LEFT ] = free_count;
							
							/*
							if(j != 0){
								can_move[cur_h][j    ][LEFT ] = true;
								free_id [cur_h][j    ][LEFT ] = free_count;
								can_move[cur_h][j - 1][RIGHT] = true;
								free_id [cur_h][j - 1][RIGHT] = free_count;
							}
							*/
							
							free_count++;
						}
					}
				}else{
					//h
					for(int j = 0; j < w; j++){
						boolean is_free = sc.nextInt() == 0;
						
						if(is_free){
							can_move[cur_h    ][j][DOWN] = true;
							free_id [cur_h    ][j][DOWN] = free_count;
							can_move[cur_h + 1][j][UP] = true;
							free_id [cur_h + 1][j][UP] = free_count;
							
							/*
							if(cur_h != 0){
								can_move[cur_h    ][j][UP  ] = true;
								free_id [cur_h    ][j][UP  ] = free_count;
								can_move[cur_h - 1][j][DOWN] = true;
								free_id [cur_h - 1][j][DOWN] = free_count;
							}
							*/
							
							free_count++;
						}
					}
				}
			}
			
			int[][][] cost = new int[free_count][h][w];
			for(int not = 0; not < free_count; not++){
				BFS(not, free_id, cost, w, h);
				/*
				System.out.println("not use : " + not);
				for(int y = 0; y < h; y++){
					for(int x = 0; x < w; x++){
						System.out.printf("%2d ", cost[not][y][x]);
					}
					System.out.println();
				}
				*/
				//System.out.println("-----------------------------------------");
				
			}
			
			
			
			System.out.println(Dijkstra(free_id, cost, w, h));
			
			System.gc();
		}
		sc.close();
	}
}