import java.io.*;
import java.util.*;
// i want to become the best
class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(reader.readLine());
		int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	    //System.out.println(list[1]*list[2]>=list[0]?"Yes":"No");
		int N = list[0];
		int M = list[1];
		HashSet<Integer>[] graph = new HashSet[N+1];
		for(int i = 1;i<=N;i++) graph[i] = new HashSet<Integer>();
		for(int i = 0;i<M;i++){
			String[] lo = reader.readLine().split(" ");
			int u = Integer.parseInt(lo[0]);
			int v = Integer.parseInt(lo[1]);
			graph[u].add(v);
			graph[v].add(u);
		}
		boolean[] visited = new boolean[N+1];
		Queue<Integer> q = new LinkedList<Integer>();
		int ans = 0;
		for(int i = 1;i<=N;i++){
			if(visited[i]) continue;
			q.add(i);
			int cand = 0;
			visited[i] = true;
			while(!q.isEmpty()){
				int src = q.remove();
				//visited[src] = true;
				cand++;
				for(int o:graph[src]) if(!visited[o]){
					q.add(o);
					visited[o] = true;
				}
			}
			ans = Math.max(ans,cand);
		}
		System.out.println(ans);
	}
}
class pair implements Comparable<pair>{
		long a = 0;
		int b = 0;
		public pair(long a,int b){
			this.a = a;
			this.b = b;
		}
		@Override
		public int compareTo(pair p){
			if(this.a == p.a) return -(Integer.compare(this.b,p.b));
			else return -(Long.compare(this.a,p.a));
		}
		@Override
		public String toString(){
			return a+" "+b;
		}
	}
