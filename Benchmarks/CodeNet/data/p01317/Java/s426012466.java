import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static class Walk implements Comparable<Walk>{
		int purpos;
		int cur_place;
		int cur_boat;
		int time;
		
		public Walk(int purpos, int cur_place, int cur_boat, int time) {
			super();
			this.purpos = purpos;
			this.cur_place = cur_place;
			this.cur_boat = cur_boat;
			this.time = time;
		}

		@Override
		public int compareTo(Walk arg0) {
			return this.time - arg0.time;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			System.gc();
			
			int[][] land_adj = new int[n][n];
			int[][] sea_adj = new int[n][n];
			
			for(int i = 0; i < n; i++){
				Arrays.fill(land_adj[i], Integer.MAX_VALUE);
				Arrays.fill(sea_adj[i], Integer.MAX_VALUE);
			}
			
			for(int i = 0; i < m; i++){
				final int x = sc.nextInt() - 1;
				final int y = sc.nextInt() - 1;
				final int cost = sc.nextInt();
				final String str = sc.next();
				
				if("L".equals(str)){
					land_adj[x][y] = land_adj[y][x] = Math.min(land_adj[x][y], cost);
				}else{
					sea_adj[x][y] = sea_adj[y][x] = Math.min(sea_adj[x][y], cost);
				}
			}
			
			final int r = sc.nextInt();
			
			int[] purpos_place = new int[r];
			for(int i = 0; i < r; i++){
				purpos_place[i] = sc.nextInt() - 1;
			}
			
			boolean[][][] is_visited = new boolean[r][n][n];
			PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
			queue.add(new Walk(0, purpos_place[0], purpos_place[0], 0));
			
			while(!queue.isEmpty()){
				Walk walk = queue.poll();
				
				//System.out.println(walk.purpos + "[" + purpos_place[walk.purpos] +  "]" + " " + walk.cur_place + " " + walk.cur_boat + " " + walk.time);
				
				if(walk.purpos == r){
					System.out.println(walk.time);
					break;
				}
				
				if(is_visited[walk.purpos][walk.cur_place][walk.cur_boat]){
					continue;
				}else{
					is_visited[walk.purpos][walk.cur_place][walk.cur_boat] = true;
				}
				
				if(purpos_place[walk.purpos] == walk.cur_place){
					queue.add(new Walk(walk.purpos + 1, walk.cur_place, walk.cur_boat, walk.time));
					continue;
				}
				
				for(int to = 0; to < n; to++){
					if(walk.cur_place == to){
						continue;
					}
					
					if(land_adj[walk.cur_place][to] != Integer.MAX_VALUE && !is_visited[walk.purpos][to][walk.cur_boat]){
						queue.add(new Walk(walk.purpos, to, walk.cur_boat, walk.time + land_adj[walk.cur_place][to]));
					}
					
					//if can use boat?
					if(walk.cur_boat == walk.cur_place){
						if(sea_adj[walk.cur_place][to] != Integer.MAX_VALUE && !is_visited[walk.purpos][to][to]){
							queue.add(new Walk(walk.purpos, to, to, walk.time + sea_adj[walk.cur_place][to]));
						}
					}
				}
			}
			
		}

	}

}