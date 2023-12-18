import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static int V, E;
	static boolean[][] edge1, edge2;
	static int[] group;
	static boolean[] visited;
	static PriorityQueue<State> pq=new PriorityQueue<>();
	
	static class State implements Comparable<State>{
		int e, t;
		State(int e, int t){
			this.e=e;
			this.t=t;
		}
		public int compareTo(State s) {
			return s.t-this.t;
		}
	}
	
	static int count=1;
	
	static void dfs1(int now){
	    visited[now]=true;
	    for(int i=0; i<V; i++){
	        if(edge1[now][i] && !visited[i]){
	            dfs1(i);
	        }
	    }
	    pq.add(new State(now, count));
	    count++;
	}
	
	static void dfs2(int now, int c){
	    visited[now]=true;
	    group[now]=c;
	    //System.out.println("group["+now+"]="+group[now]);
	    for(int i=0; i<V; i++){
	        if(edge2[now][i] && !visited[i]){
	            dfs2(i, c);
	        }
	    }
	}
	
	static void bfs(){
	    Arrays.fill(visited, false);
	    count=0;
	    while(! pq.isEmpty()){
	        State state=pq.poll();
	        if(visited[state.e])    continue;
	        count++;
	        dfs2(state.e, count);
	    }
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			V=sc.nextInt();
			E=sc.nextInt();
			edge1=new boolean[V][V];
			edge2=new boolean[V][V];
			group=new int[V];
			visited=new boolean[V];
			for(int i=0; i<E; i++) {
				int s=sc.nextInt();
				int t=sc.nextInt();
				edge1[s][t]=true;
				edge2[t][s]=true;
			}
			for(int i=0; i<V; i++) {
				if(!visited[i]) {
					dfs1(i);
				}
			}
			bfs();
			int Q=sc.nextInt();
			for(int i=0; i<Q; i++) {
				int s=sc.nextInt();
				int t=sc.nextInt();
				System.out.println((group[s]==group[t])? 1:0);
			}

		}
	}
}
