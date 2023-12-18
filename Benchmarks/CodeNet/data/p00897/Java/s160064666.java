import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

//Long Distance Taxi
public class Main{

	class R{
		int id;
		Set<E> adj;
		public R(int id) {
			this.id = id;
			adj = new HashSet<E>();
		}
	}
	class E{
		int t, d;
		public E(int t, int d) {
			this.t = t;
			this.d = d;
		}
	}
	
	R[] town;
	int ID, M = 10000, INF = 1<<29;
	Map<String, R> ref;
	R get(String s){
		if(ref.containsKey(s))return ref.get(s);
		R r = new R(ID);
		ref.put(s, r);
		return town[ID++] = r;
	}
	
	int[][] dist;
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt(), m = sc.nextInt(), cap = sc.nextInt();
			if((n|m|cap)==0)break;
			ref = new HashMap<String, R>();
			ID = 0;
			town = new R[2*n];
			R src = get(sc.next()), dest = get(sc.next());
			while(n--!=0){
				R s = get(sc.next()), t = get(sc.next());
				int d = sc.nextInt();
				s.adj.add(new E(t.id, d));
				t.adj.add(new E(s.id, d));
			}
			boolean[] gas = new boolean[ID];
			while(m--!=0){
				R r = get(sc.next());
				gas[r.id] = true;
			}
			dist = new int[ID][10*cap+1];
			for(int[]a:dist)Arrays.fill(a, INF);
			PriorityQueue<Integer> q = new PriorityQueue<Integer>(ID, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return dist[o1/M][o1%M]-dist[o2/M][o2%M];
				}
			});
			dist[src.id][0] = 0;
			q.add(src.id*M);
			int res = -1;
			while(!q.isEmpty()){
				int a = q.poll();
				int v = a/M, c = a%M;
				if(v==dest.id){
					res = dist[v][c]; break;
				}
				for(E e:town[v].adj){
					int w = dist[v][c] + e.d;
					if(10*cap<c+e.d)continue;
					if(gas[e.t]){
						if(w < dist[e.t][0]){
							dist[e.t][0] = w;
							q.add(e.t*M);
						}
					}
					else{
						if(w < dist[e.t][c+e.d]){
							dist[e.t][c+e.d] = w;
							q.add(e.t*M+c+e.d);
						}
					}
				}
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}