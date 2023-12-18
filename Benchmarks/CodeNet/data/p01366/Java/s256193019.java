import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static class Edge{
		int from, to, dist, cost;

		public Edge(int from, int to, int dist, int cost) {
			super();
			this.from = from;
			this.to = to;
			this.dist = dist;
			this.cost = cost;
		}
	}
	
	public static class Node implements Comparable<Node>{
		int node, dist, price;

		public Node(int node, int dist, int price) {
			super();
			this.node = node;
			this.dist = dist;
			this.price = price;
		}

		@Override
		public int compareTo(Node o) {
			if(this.dist == o.dist){
				return this.price - o.price;
			}else{
				return this.dist - o.dist;
			}
		}
	}
	
	public static final int NODE_MAX = 10000;
	public static final int EDGE_MAX = 20000;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, LinkedList<Edge>> edges = new HashMap<Integer, LinkedList<Edge>>();
		
		boolean[] is_visited = new boolean[NODE_MAX];
		
		while(true){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			if(N == 0 && M == 0){
				break;
			}
			
			Arrays.fill(is_visited, false);
			for(LinkedList<Edge> list : edges.values()){
				list.clear();
			}
			
			for(int i = 0; i < M; i++){
				final int u = sc.nextInt() - 1;
				final int v = sc.nextInt() - 1;
				final int d = sc.nextInt();
				final int c = sc.nextInt();
				
				Edge edge_1 = new Edge(u, v, d, c);
				if(!edges.containsKey(u)){
					edges.put(u, new LinkedList<Edge>());
				}
				edges.get(u).add(edge_1);
				
				Edge edge_2 = new Edge(v, u, d, c);
				if(!edges.containsKey(v)){
					edges.put(v, new LinkedList<Edge>());
				}
				edges.get(v).add(edge_2);
			}
			
			PriorityQueue<Node> queue = new PriorityQueue<Node>();
			queue.add(new Node(0, 0, 0));
			
			int sum = 0;
			while(!queue.isEmpty()){
				Node node = queue.poll();
				
				if(is_visited[node.node]){
					continue;
				}else{
					is_visited[node.node] = true;
				}
				
				sum += node.price;
				
				if(!edges.containsKey(node.node)){
					continue;
				}
				
				for(Edge edge : edges.get(node.node)){
					final int to = edge.to;
					
					if(is_visited[edge.to]){
						continue;
					}
					
					queue.add(new Node(to, node.dist + edge.dist, edge.cost));
				}
			}
			
			System.out.println(sum);
		}
	}
	
public static class Scanner {
		private BufferedReader br;
		private StringTokenizer tok;
		
		public Scanner(InputStream is) throws IOException{
			br = new BufferedReader(new InputStreamReader(is));
			getLine();
		}
		
		private void getLine() throws IOException{
			while(tok == null || !tok.hasMoreTokens()){
				tok = new StringTokenizer(br.readLine());
			}
		}
		
		private boolean hasNext(){
			return tok.hasMoreTokens();
		}
		
		public String next() throws IOException{
			if(hasNext()){
				return tok.nextToken();
			}else{
				getLine();
				return tok.nextToken();
			}
		}
		
		public int nextInt() throws IOException{
			if(hasNext()){
				return Integer.parseInt(tok.nextToken());
			}else{
				getLine();
				return Integer.parseInt(tok.nextToken());
			}
		}
		
		public long nextLong() throws IOException{
			if(hasNext()){
				return Long.parseLong(tok.nextToken());
			}else{
				getLine();
				return Long.parseLong(tok.nextToken());
			}
		}
		
		public double nextDouble() throws IOException{
			if(hasNext()){
				return Double.parseDouble(tok.nextToken());
			}else{
				getLine();
				return Double.parseDouble(tok.nextToken());
			}
		}
	}

}