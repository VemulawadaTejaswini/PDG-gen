

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
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
	
	public static class Edge{
		int from, to, cost;

		private Edge(int from, int to, int cost) {
			super();
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		ArrayList<LinkedList<Edge>> edges = new ArrayList<LinkedList<Edge>>(n);
		
		for(int i = 0; i < n; i++){
			edges.add(new LinkedList<Edge>());
		}
		
		for(int i = 0; i < n; i++){
			final int from = sc.nextInt();
			final int k = sc.nextInt();
			
			for(int j = 0; j < k; j++){
				final int to = sc.nextInt();
				final int cost = sc.nextInt();
				
				edges.get(from).add(new Edge(from, to, cost));
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
			
			for(Edge edge : edges.get(walk.node)){
				if(!visited[edge.to]){
					queue.add(new Walk(edge.to, walk.cost + edge.cost));
				}
			}
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(i + " " + costs[i]);
		}
	}
}