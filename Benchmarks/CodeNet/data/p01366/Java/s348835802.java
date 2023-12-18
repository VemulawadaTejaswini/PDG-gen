
//一見最小全域木だが、実は最短路だったりする、2時間もかかってしまいました
import java.io.*;
import java.util.*;

public class Main {
	static int N,M;
	static LinkedList<edge> edges[];
	static boolean done[];
	static edge es[];
	static node ns[];
	static final int INF = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String input[] = br.readLine().split(" +");
			N = new Integer(input[0]);
			M = new Integer(input[1]);
			if(N==0) break;
			
			PriorityQueue<node> pque = new PriorityQueue<node>();			
			edges = new LinkedList[N+1];
			es = new edge[2*M+1];
			ns = new node[N+1];
			done = new boolean[N+1];
			
			for(int i = 0; i <= N; i++){
				done[i] = false;
				edges[i] = new LinkedList<edge>();
				ns[i] = new node(i, 0, INF);
			}
			
			es[0] = new edge(0,0,0,0);
			for(int i = 1; i <= M; i++){
				input = br.readLine().split(" +");
				int a = new Integer(input[0]);
				int b = new Integer(input[1]);
				int dist = new Integer(input[2]);
				int cost = new Integer(input[3]);
				es[i] = new edge(i,b,dist,cost);
				es[i+M] = new edge(i+M,a,dist,cost);
				edges[a].add(es[i]);
				edges[b].add(es[i+M]);
			}
			
			ns[1].dist = 0;
			ns[1].from = 0;
			pque.add(ns[1]);
			
			int sum = 0;
			while(!pque.isEmpty()){
				node n = pque.poll();
				if(!done[n.no]){
					done[n.no] = true;
					sum += es[n.from].cost;
				}else continue;
				
				int d = n.dist;
				for(edge e : edges[n.no]){
					if(d + e.dist < ns[e.to].dist){
						pque.add(new node(e.to, e.no, d+e.dist));
					}
				}
			}
			System.out.println(sum);
		}
	}
	
	static class node implements Comparable<node>{
		int no, from, dist;
		node(int no, int from, int dist){
			this.no = no;
			this.from = from;
			this.dist = dist;
		}
		public int compareTo(node o) {
			if(this.dist != o.dist)
				return this.dist - o.dist;
			else
				return es[this.from].cost - es[o.from].cost;
		}
	}
	
	static class edge{
		int no,to,dist,cost;
		edge(int no, int to, int dist, int cost){
			this.no = no;
			this.to = to;
			this.dist = dist;
			this.cost = cost;
		}
	}
}