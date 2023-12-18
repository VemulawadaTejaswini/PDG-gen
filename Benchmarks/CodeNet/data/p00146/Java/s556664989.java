import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static class Walk implements Comparable<Walk>{
		double time;
		int pos;
		int count;
		int collect;
		Walk prev;
		
		public Walk(double d, int pos,int count, int collect, Walk prev) {
			super();
			this.time = d;
			this.pos = pos;
			this.count = count;
			this.collect = collect;
			this.prev = prev;
		}

		@Override
		public int compareTo(Walk o) {
			if(this.time == o.time){
				return this.count - o.count;
			}
			
			return this.time > o.time ? 1 : this.time < o.time ? -1 : 0;
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		
		int[] c_dist = new int[n];
		int[] nums = new int[n];
		int[] name = new int[n];
		int sum = 0;
		
		//TODO: unSumited
		
		for(int i = 0; i < n; i++){
			name[i] = sc.nextInt();
			c_dist[i] = sc.nextInt();
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		
		
		int[][] adj = new int[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				adj[i][j] = adj[j][i] = Math.abs(c_dist[i] - c_dist[j]);
			}
		}
		/*
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}
		*/
		PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
		for(int i = 0; i < n; i++){
			queue.add(new Walk(0, i, nums[i], 1 << i, null));
		}
		
		boolean[][] is_visited = new boolean[n][1 << n];
		
		while(!queue.isEmpty()){
			Walk walk = queue.poll();
			
			//System.out.println(walk.time + " " + walk.pos + "(" + (walk.prev == null ? -1 : walk.prev.pos) + ")" + " " + walk.count + " " + Integer.toBinaryString(walk.collect));
			
			if(walk.collect == ((1 << n) - 1)){
				Walk ans = walk;
				
				LinkedList<Integer> list = new LinkedList<Integer>();
				while(ans != null){
					list.add(name[ans.pos]);
					ans = ans.prev;
				}
				
				//System.out.println(list);
				
				boolean first = true;
				for(ListIterator<Integer> iter = list.listIterator(list.size()); iter.hasPrevious();){
					System.out.print((!first ? " " : "") + iter.previous());
					first = false;
				}
				System.out.println();
				break;
			}
			
			if(is_visited[walk.pos][walk.collect]){
				continue;
			}else{
				is_visited[walk.pos][walk.collect] = true;
			}
			
			for(int i = 0; i < n; i++){
				if(adj[walk.pos][i] > 0 && (walk.count + nums[i] <= sum) && !is_visited[i][walk.collect | (1 << i)]){
					final double cost = adj[walk.pos][i] * (70 + walk.count * 20) / 2000.0;
					//System.out.println(walk.pos + " " + i + " in " + walk.collect + " " + cost);
					queue.add(new Walk(walk.time + cost, i, walk.count + nums[i], walk.collect | (1 << i), walk));
				}
			}
		}
	}

}