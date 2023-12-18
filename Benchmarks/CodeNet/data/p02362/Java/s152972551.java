import java.util.Scanner;

public class Main{
	static final int MAX = 1000;
	static final int INF = 1 << 21;
	static final int WHITE = 0;
	static final int GRAY = 1;
	static final int BLACK = 2;
	static int n, r, q;
	static Edge[]e;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    n = scan.nextInt();
	    q = scan.nextInt();
	    e = new Edge[q];
	    r = scan.nextInt();	// 始点
	    for(int i = 0; i < q; i++) {
	    	int s = scan.nextInt();
	    	int t = scan.nextInt();
	    	int d = scan.nextInt();
	    	e[i] = new Edge(s, t, d);
	    }
	    scan.close();
	    //bellmanFord();
	    if(bellmanFord()) {
	    	System.out.println("NEGATIVE CYCLE");
	    }else {
	    	for(int i = 0; i < n; i++) {
		    	if(d[i] == INF) {
		    		System.out.println("INF");
		    	}else {
		    		System.out.println(d[i]);
		    	}
		    }
	    }


	}
    static int[]d = new int[MAX];
	static boolean bellmanFord() {
        for(int i = 0; i < n; i++) {
            d[i] = INF;
        }
        d[r] = 0;
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < q; j++) {
        		if(d[e[j].from] != INF && d[e[j].to] > d[e[j].from] + e[j].cost) {
        			d[e[j].to] = d[e[j].from] + e[j].cost;
        			if(i == n - 1) return true;
        		}
        	}
        }
        return false;
	}
	static class Edge{
		int from, to, cost;
		public Edge(int from, int to, int cost) {
			this.from = from;
			this.to= to;
			this.cost = cost;
		}
	}
}

