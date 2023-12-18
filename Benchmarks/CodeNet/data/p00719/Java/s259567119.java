import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static class Walk implements Comparable<Walk>{
		int pos;
		double dist;
		int bit;
		
		public Walk(int pos, double dist, int bit) {
			super();
			this.pos = pos;
			this.dist = dist;
			this.bit = bit;
		}
		
		@Override
		public int compareTo(Walk arg0) {
			return this.dist < arg0.dist ? -1 : this.dist > arg0.dist ? 1 : 0;
		}
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		final int bit_size = 1 << 8;
		final int size = 30;
		boolean[][] is_visited = new boolean[size][bit_size];
		int[][] adj = new int[size][size];
		
		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			final int p = sc.nextInt();
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			
			if(n == 0 && m == 0 && p == 0 && a == 0 && b == 0){
				break;
			}
			
			for(int i = 0; i < m; i++){
				final int init_size = 1 << n;
				for(int j = 0; j < init_size; j++){
					is_visited[i][j] = false;
				}
				
				for(int j = 0; j < m; j++){
					adj[i][j] = Integer.MAX_VALUE;
				}
			}
			
			int[] tickets = new int[n];
			for(int i = 0; i < n; i++){
				tickets[i] = sc.nextInt();
			}
			
			for(int i = 0; i < p; i++){
				final int start = sc.nextInt();
				final int end = sc.nextInt();
				final int dist = sc.nextInt();
				
				adj[start - 1][end - 1] = adj[end - 1][start - 1] = dist;
			}
			
			PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
			queue.add(new Walk(a - 1, 0, 0));
			
			boolean flag = false;
			while(!queue.isEmpty()){
				Walk walk = queue.poll();
				
				//System.out.println(walk.pos + " " + walk.dist);
				
				if(is_visited[walk.pos][walk.bit]){
					continue;
				}else{
					is_visited[walk.pos][walk.bit] = true;
				}
				
				if(walk.pos == b - 1){
					System.out.println(walk.dist);
					flag = true;
					break;
				}
				
				for(int ticket = 0; ticket < n; ticket++){
					if((walk.bit & (1 << ticket)) == 0){
						final int new_bit = walk.bit | (1 << ticket);
						
						for(int to = 0; to < m; to++){
							//System.out.println(to);
							if(adj[walk.pos][to] != Integer.MAX_VALUE && !is_visited[to][new_bit]){
								queue.add(new Walk(to, walk.dist + (adj[walk.pos][to] / (double)(tickets[ticket])), new_bit));
							}
						}
					}
				}
			}
			
			if(!flag){
				System.out.println("Impossible");
			}
			
		}
		
	}

}