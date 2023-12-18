import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static class Edge implements Comparable<Edge>{
		int s, e;
		double cost;
		
		public Edge(int s, int e, double cost) {
			super();
			this.s = s;
			this.e = e;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return Double.compare(o.cost, this.cost);
		}
	}
	
	public static class UnionFind{
		int[] par;
		
		UnionFind(int n){
			par=new int[n];
			for(int i=0;i<n;i++)par[i]=i;
		}
		
		public int find(int x){
			if(par[x]==x)return x;
			return par[x]=find(par[x]);
		}
		public Boolean same(int x,int y){
			return find(x)==find(y);
		}
		public void unite(int x,int y){
			if(find(x)==find(y))return;
			par[find(x)]=find(y);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		int[] x_pos = new int[N];
		int[] y_pos = new int[N];
		
		for(int i = 0; i < N; i++){
			x_pos[i] = sc.nextInt();
			y_pos[i] = sc.nextInt();
		}
		
		double[][] cost = new double[N][N];
		for(int from = 0; from < N; from++){
			for(int to = from + 1; to < N; to++){
				cost[from][to] = cost[to][from] = Math.sqrt((x_pos[from] - x_pos[to]) * (x_pos[from] - x_pos[to]) + 
						                                    (y_pos[from] - y_pos[to]) * (y_pos[from] - y_pos[to]));
			}
		}
		
		PriorityQueue<Edge> edges = new PriorityQueue<Main.Edge>();
		for(int i = 0; i < M; i++){
			final int s = sc.nextInt() - 1;
			final int e = sc.nextInt() - 1;
			
			edges.add(new Edge(s, e, cost[s][e]));
		}
		
		UnionFind uf = new UnionFind(N);
		double sum = 0;
		int count = 0;
		while(!edges.isEmpty()){
			Edge edge = edges.poll();
			
			if(uf.same(edge.s, edge.e) || count >= N - 1){
				sum += edge.cost;
				continue;
			}
			uf.unite(edge.s, edge.e);
			count++;
		}
		
		System.out.printf("%.3f\n",sum);
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