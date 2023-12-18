import java.util.*;

@SuppressWarnings("unchecked")
class Main{

    int n, m;
    int INF = Integer.MAX_VALUE/2;
    ArrayList[] list;

    class P{
	int to, weight;
	P(int to, int weight){
	    this.to = to;
	    this.weight = weight;
	}
    }

    void solve(){
	Scanner sc = new Scanner(System.in);
	while(true){
	    n = sc.nextInt(); m = sc.nextInt();
	    if(n==0 && m==0) break;

	    list = new ArrayList[n+1];
	    for(int i=0; i<=n; i++) list[i] = new ArrayList<P>();
	    for(int i=0; i<m; i++){
		char command = sc.next().charAt(0);
		if(command=='!'){
		    int a = sc.nextInt(), b = sc.nextInt(), w = sc.nextInt();
		    list[a].add(new P(b, w));
		    list[b].add(new P(a, -w));
		}else{
		    int b = dijkstra(sc.nextInt(), sc.nextInt());
		    if(b==INF) System.out.println("UNKNOWN");
		    else System.out.println(b);
		}
	    }
	}
    }

    int dijkstra(int start, int goal){
	//pos, cost
	/*
	PriorityQueue<int[]> q = new PriorityQueue<int[]>(10, new Comparator<int[]>(){
		public int compare(int[] p1, int[] p2){
		    return p1[1] - p2[1];
		}
	    });
	*/
	LinkedList<int[]> q = new LinkedList<int[]>();
	q.add(new int[]{start, 0});
	boolean[] v = new boolean[n+1];

	while(q.size()>0){
	    int[] qq = q.poll();
	    int pos = qq[0], cost = qq[1];

	    if(pos==goal) return cost;
	    if(v[pos]) continue;
	    v[pos] = true;

	    for(int i=0; i<list[pos].size(); i++){
		P p = (P)list[pos].get(i);
		q.add(new int[]{p.to, cost+p.weight});
	    }
	}
	return INF;
    }

    public static void main(String[] args){
	new Main().solve();
    }
}