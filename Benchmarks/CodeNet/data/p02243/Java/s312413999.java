
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
	
	public static class Node implements Comparable<Node>{
		short node;
		int cost;

		private Node(short node, int cost) {
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
		short to;
		int cost;

		private Edge(short to, int cost) {
			super();
			this.to = to;
			this.cost = cost;
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		HashMap<Short, LinkedList<Edge>> edges = new HashMap<Short, LinkedList<Edge>>();
		
		for(int i = 0; i < n; i++){
			final short from = sc.nextShort();
			final int k = sc.nextInt();
			
			if(k == 0){
				continue;
			}else{
				edges.put(from, new LinkedList<Edge>());
			}
			
			for(int j = 0; j < k; j++){
				final short to = sc.nextShort();
				final int cost = sc.nextInt();
				
				edges.get(from).add(new Edge(to, cost));
			}
		}
		
		//boolean[] contain = new boolean[n];
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		
		Node[] nodes = new Node[n];
		for(short i = 1; i < n; i++){
			nodes[i] = new Node(i, Integer.MAX_VALUE / 2 - 1);
		}
		nodes[0] = new Node((short)0, 0);
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
					//queue.remove(nodes[edge.to]);
					nodes[edge.to].cost = node.cost + edge.cost;
					if(!queue.contains(nodes[edge.to])){
						queue.add(nodes[edge.to]);
					}
				}
			}
			
			//System.gc();
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(i + " " + nodes[i].cost);
		}
	}
}