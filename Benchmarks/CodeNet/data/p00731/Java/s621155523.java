
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	
	public static class Walk implements Comparable<Walk>{
		int foot_x, foot_y;
		int using_foot;
		int time;
		
		public Walk(int foot_x, int foot_y, int using_foot, int denger) {
			super();
			this.foot_x = foot_x;
			this.foot_y = foot_y;
			this.using_foot = using_foot;
			this.time = denger;
		}

		@Override
		public int compareTo(Walk o) {
			return this.time - o.time;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			
			if(w == 0 && h == 0){
				break;
			}
			System.gc();
			
			int[][] times = new int[h][w];
			boolean[][] is_goal = new boolean[h][w];
			
			boolean[][][] is_visited = new boolean[h][w][2];
			PriorityQueue<Walk> queue = new PriorityQueue<Main.Walk>();
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					String str = sc.next();
					
					if("T".equals(str)){
						is_goal[i][j] = true;
						times[i][j] = 0; 
					}else if("S".equals(str)){
						queue.add(new Walk(j, i, 0, 0));
						queue.add(new Walk(j, i, 1, 0));
						times[i][j] = 0;
					}else if("X".equals(str)){
						times[i][j] = -1;
					}else{
						times[i][j] = Integer.parseInt(str);
					}
				}
			}
			
			boolean flag = false;
			while(!queue.isEmpty()){
				Walk walk = queue.poll();
				
				if(is_visited[walk.foot_y][walk.foot_x][walk.using_foot]){
					continue;
				}else{
					is_visited[walk.foot_y][walk.foot_x][walk.using_foot] = true;
				}
				
				if(is_goal[walk.foot_y][walk.foot_x]){
					flag = true;
					System.out.println(walk.time);
					break;
				}
				
				for(int x = 1; x <= 3; x++){
					for(int y = -2; y <= 2; y++){
						if(x + Math.abs(y) > 3){
							continue;
						}
						
						//using_foot : 0 -> left 1 -> right
						final int nx = walk.foot_x + (walk.using_foot == 0 ? x : -x);
						final int ny = walk.foot_y + y;
						
						if(ny < 0 || ny >= h || nx < 0 || nx >= w){
							continue;
						}else if(times[ny][nx] < 0){
							continue;
						}else if(is_visited[ny][nx][1 - walk.using_foot]){
							continue;
						}
						
						queue.add(new Walk(nx, ny, 1 - walk.using_foot, walk.time + times[ny][nx]));
					}
				}
				
				
			}
			
			if(!flag){
				System.out.println(-1);
			}
			
		}
	}

}