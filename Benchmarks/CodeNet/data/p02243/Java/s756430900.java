

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.TreeMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	
	public static class Walk implements Comparable<Walk>{
		int node, cost;

		private Walk(int node, int cost) {
			super();
			this.node = node;
			this.cost = cost;
		}

		@Override
		public int compareTo(Walk arg0) {
			return this.cost - arg0.cost;
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		ArrayList<TreeMap<Integer, Integer>> edges = new ArrayList<TreeMap<Integer, Integer>>();
		
		for(int i = 0; i < n; i++){
			edges.add(new TreeMap<Integer, Integer>());
		}
		
		for(int i = 0; i < n; i++){
			final int from = sc.nextInt();
			final int k = sc.nextInt();
			
			for(int j = 0; j < k; j++){
				final int v = sc.nextInt();
				final int c = sc.nextInt();
				
				edges.get(from).put(v, c);
			}
		}
		
		boolean[] visited = new boolean[n];
		int[] costs = new int[n];
		Arrays.fill(costs, Integer.MAX_VALUE);
		PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
		queue.add(new Walk(0, 0));
		
		while(!queue.isEmpty()){
			Walk walk = queue.poll();
			
			//System.out.println(": " + walk.node + " " + walk.cost);
			
			if(visited[walk.node]){
				continue;
			}else{
				visited[walk.node] = true;
				costs[walk.node] = walk.cost;
			}
			
			for(int to : edges.get(walk.node).keySet()){
				if(!visited[to] && costs[to] > walk.cost + edges.get(walk.node).get(to)){
					queue.add(new Walk(to, walk.cost + edges.get(walk.node).get(to)));
				}
			}
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(i + " " + costs[i]);
		}
	}
}