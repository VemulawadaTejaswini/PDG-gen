import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

//Mr. Rito Post Office
public class Main{

	class E{
		int t, d;
		char c;
		public E(int t, int d, char c) {
			this.t = t;
			this.d = d;
			this.c = c;
		}
	}

	int INF = 1<<29;
	int[][] dist;
	@SuppressWarnings("unchecked")
	void run(){

		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt(), m = sc.nextInt();
			if((n|m)==0)break;
			List<E>[] adj = new List[n+1];
			for(int i=0;i<=n;i++)adj[i]=new ArrayList<E>();
			while(m--!=0){
				int s = sc.nextInt(), t = sc.nextInt(), d = sc.nextInt();
				char c = sc.next().charAt(0);
				adj[s].add(new E(t, d, c)); adj[t].add(new E(s, d, c));
			}
			int R = sc.nextInt();
			int[] v = new int[R];
			for(int i=0;i<R;i++)v[i]=sc.nextInt();
			int[][] pre = new int[n+1][n+1];
			for(int[]a:pre)Arrays.fill(a, INF);
			pre[v[0]][v[0]] = 0;
			for(int k=1;k<R;k++){
				dist = new int[n+1][n+1];
				for(int[]a:dist)Arrays.fill(a, INF);
				PriorityQueue<int[]> q = new PriorityQueue<int[]>(n, new Comparator<int[]>() {
					public int compare(int[] o1, int[] o2) {
						return dist[o1[0]][o1[1]]-dist[o2[0]][o2[1]];
					}
				});
				for(int i=1;i<=n;i++){
					dist[v[k-1]][i] = pre[v[k-1]][i]; q.add(new int[]{v[k-1], i});
				}
				while(!q.isEmpty()){
					int[] P = q.poll();
					int p = P[0], s = P[1];
					for(E e:adj[p]){
						if(e.c=='L'){
							int w = dist[p][s]+e.d;
							if(w<dist[e.t][s]){
								dist[e.t][s] = w; q.add(new int[]{e.t, s});
							}
						}
						else if(p==s){
							int w = dist[p][s]+e.d;
							if(w<dist[e.t][e.t]){
								dist[e.t][e.t] = w; q.add(new int[]{e.t, e.t});
							}
						}
					}
				}
				pre = dist;
			}
			int res = INF;
			for(int i=1;i<=n;i++)res = Math.min(res, pre[v[R-1]][i]);
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}