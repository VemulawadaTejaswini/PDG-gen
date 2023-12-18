

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	
	public static class Node implements Comparable<Node>{
		int node, cost;

		private Node(int node, int cost) {
			super();
			this.node = node;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node arg0) {
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
		
		HashMap<Integer, LinkedList<Edge>> edges = new HashMap<Integer, LinkedList<Edge>>(n);
		
		for(int i = 0; i < n; i++){
			final int from = sc.nextInt();
			final int k = sc.nextInt();
			
			if(k == 0){
				continue;
			}else{
				edges.put(from, new LinkedList<Edge>());
			}
			
			for(int j = 0; j < k; j++){
				final int to = sc.nextInt();
				final int cost = sc.nextInt();
				
				edges.get(from).add(new Edge(from, to, cost));
			}
		}
		
		//boolean[] contain = new boolean[n];
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		
		Node[] nodes = new Node[n];
		for(int i = 1; i < n; i++){
			nodes[i] = new Node(i, Integer.MAX_VALUE / 2 - 1);
		}
		nodes[0] = new Node(0, 0);
		//contain[0] = true;
		queue.add(nodes[0]);
		
		while(!queue.isEmpty()){
			Node node = queue.poll();
			
			if(!edges.containsKey(node.node)){
				continue;
			}
			
			for(Edge edge : edges.get(node.node)){
				if(nodes[edge.to].cost > node.cost + edge.cost){
					//System.out.println("updated " + edge.to + " " + (node.cost + edge.cost));
					nodes[edge.to].cost = node.cost + edge.cost;
					
					queue.add(nodes[edge.to]);
				}
			}
			
			//System.gc();
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(i + " " + nodes[i].cost);
		}
	}
}