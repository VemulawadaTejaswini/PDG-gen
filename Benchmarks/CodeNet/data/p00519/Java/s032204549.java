
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class Walk implements Comparable<Walk>{
		int cur;
		int cost;
		int remain;
		
		private Walk(int cur, int cost, int remain) {
			super();
			this.cur = cur;
			this.cost = cost;
			this.remain = remain;
		}

		@Override
		public int compareTo(Walk arg0) {
			return this.cost - arg0.cost;
		}
	}
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int k = sc.nextInt();
		
		int[] costs = new int[n];
		int[] times = new int[n];
		for(int i = 0; i < n; i++){
			costs[i] = sc.nextInt();
			times[i] = sc.nextInt();
		}
		
		ArrayList<LinkedList<Integer>> adj_list = new ArrayList<LinkedList<Integer>>();
		for(int i = 0; i < n; i++){
			adj_list.add(new LinkedList<Integer>());
		}
		for(int i = 0; i < k; i++){
			final int from = sc.nextInt() - 1;
			final int to = sc.nextInt() - 1;
			
			adj_list.get(from).add(to);
			adj_list.get(to).add(from);
		}
		
		PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
		queue.add(new Walk(0, 0, 0));
		boolean[] visited = new boolean[n];
		while(!queue.isEmpty()){
			Walk walk = queue.poll();
			
			if(visited[walk.cur]){
				continue;
			}else if(walk.cur == n - 1){
				System.out.println(walk.cost);
				break;
			}
			
			for(int next : adj_list.get(walk.cur)){
				if(walk.remain >= 1){
					queue.add(new Walk(next, walk.cost, walk.remain - 1));
				}
				
				queue.add(new Walk(next, walk.cost + costs[walk.cur], times[walk.cur] - 1));
			}
		}
		
	}
}