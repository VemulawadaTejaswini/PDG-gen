import java.util.*;
public class Main{
    int INF = Integer.MAX_VALUE;

    public static void main(String[] args){
	new Main().solve();
    }
    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    if(m==0 && n==0) break;

	    int[] b = new int[m];
	    int[] r = new int[n];
	    for(int i=0; i<m; i++) b[i] = sc.nextInt();
	    for(int i=0; i<n; i++) r[i] = sc.nextInt();

	    V[] graph = new V[n+m+2];
	    for(int i=0; i<n+m+2; i++) graph[i] = new V();

	    for(int i=0; i<m; i++){
		for(int j=0; j<n; j++){
		    int n1 = Math.max(b[i], r[j]);
		    int n2 = Math.min(b[i], r[j]);
		    int gcd = n1;
		    while(gcd%n2!=0) gcd += n1;
		    int lcm = n1*n2/gcd;
		    if(lcm!=1){
			graph[i].add(graph[j+n], 1);
			//graph[j+n].add(graph[i], 1);
		    }
		}
	    }

	    int s = n+m;
	    int t = n+m+1;
	    for(int i=0; i<n; i++){
		graph[s].add(graph[i], 1);
	    }
	    for(int i=0; i<m; i++){
		graph[n+i].add(graph[t], 1);
	    }
	    int ans = dinic(graph[s], graph[t]);
	    System.out.println(ans);
	}
    }


    int dinic(V s, V t){
	int flow = 0;
	for(int p=1;  ; p++){
	    Queue<V> que = new LinkedList<V>();
	    s.level = 0;
	    s.p = p;
	    que.offer(s);
	    while(!que.isEmpty()){
		V v = que.poll();
		v.iter = v.es.size() - 1;
		for(E e : v.es) if(e.to.p < p && e.cap > 0){
			e.to.level = v.level + 1;
			e.to.p = p;
			que.offer(e.to);
		    }
	    }
	    if(t.p < p) return flow;
	    for(int f; (f=dfs(s, t, INF)) > 0; ) flow += f;
	}
    }

    int dfs(V v, V t, int f){
	if(v==t) return f;
	for(; v.iter >= 0; v.iter--){
	    E e = v.es.get(v.iter);
	    if(v.level < e.to.level && e.cap > 0){
		int d = dfs(e.to, t, Math.min(f, e.cap));
		if(d > 0){
		    e.cap -= d;
		    e.rev.cap += d;
		    return d;
		}
	    }
	}
	return 0;
    }
	
    class V{
	ArrayList<E> es = new ArrayList<E>();
	int level, p, iter;
	void add(V to, int cap){
	    E e = new E(to, cap), rev = new E(this, 0);
	    e.rev = rev; rev.rev = e;
	    es.add(e); to.es.add(rev);
	}
    }

    class E{
	V to;
	E rev;
	int cap;
	E(V to, int cap) {
	    this.to = to;
	    this.cap = cap;
	}
    }
}