import java.util.*;

public class Main{
    int N,M,L,K,A,H;
    int[] d;
    List<Edge>[] adj;
    int INF = 1000000000;
    List<String> f;

    public static void main(String[] args){
	new Main().solve();
    }

    class Edge{
	int t, c;
	public Edge(int t, int c) {
	    this.t = t;
	    this.c = c;
	}
    }

    @SuppressWarnings("unchecked")
    void solve(){
	Scanner sc = new Scanner(System.in);
	N = sc.nextInt();
	while(N!=0){
	    M = sc.nextInt();
	    L = sc.nextInt();
	    K = sc.nextInt();
	    A = sc.nextInt();
	    H = sc.nextInt();
	    f = new ArrayList<String>();
	    for(int i=0; i<L; i++){
		f.add(sc.nextInt()+"");
	    }
	    f.add(A+"");
	    f.add(H+"");
	    
	    adj = new List[N];
	    for(int i=0; i<N; i++)adj[i] = new ArrayList<Edge>();
	    for(int i=0; i<K; i++){
		int x = sc.nextInt();
		int y = sc.nextInt();
		int t = sc.nextInt();
		adj[x].add(new Edge(y,t));
		adj[y].add(new Edge(x,t));
	    }

	    d = new int[N*(M+1)];

	    dijkstra(A);

	    if(d[H*(M+1)+M]==INF){
		System.out.println("Help!");
	    }else{
		System.out.println(d[H*(M+1)+M]+Math.max(0,d[H*(M+1)+M]-M));
	    }

	    N = sc.nextInt();
	}
    }

    void dijkstra(int s){
	Arrays.fill(d,INF);
	d[s*(M+1)+M] = 0;
	PriorityQueue<Integer> q = new PriorityQueue<Integer>(N, new Comparator<Integer>() {
		public int compare(Integer o1, Integer o2) {
		    return d[o1]-d[o2];
		}
	    });

	q.add(s*(M+1)+M);

	while(!q.isEmpty()){
	    int v = q.poll();
	    int town = v/(M+1);
	    int left = v%(M+1);

	    for(Edge e:adj[town]){
		if(left-e.c<0)continue;
		int w = d[town*(M+1)+left]+e.c;
		if(f.contains(e.t+"") && w<d[e.t*(M+1)+M]){
		    q.remove(e.t*(M+1)+M); 
		    d[e.t*(M+1)+M] = w; 
		    q.add(e.t*(M+1)+M);
		}else if(w<d[e.t*(M+1)+left-e.c]){
		    q.remove(e.t*(M+1)+left-e.c); 
		    d[e.t*(M+1)+left-e.c] = w; 
		    q.add(e.t*(M+1)+left-e.c);
		}
	    }
	}
    }
}