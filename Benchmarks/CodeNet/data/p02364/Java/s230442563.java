

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");

		//0 origin
		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);

		Edge edges[] = new Edge[m];

		for(int i = 0; i < m; i++){
			tmpArray = br.readLine().split(" ");
			int from = Integer.parseInt(tmpArray[0]);
			int to = Integer.parseInt(tmpArray[1]);
			int cost = Integer.parseInt(tmpArray[2]);

			edges[i] = new Edge(from,to, cost);
		}

		System.out.println(kruskal(edges, n));
	}


	static final int INF = Integer.MAX_VALUE;


	static long kruskal(Edge[] edges, int n){
		int numOfEdge = edges.length;

		Arrays.sort(edges);

		DisjointSet set = new DisjointSet(n);

		long result = 0;

		for(int i = 0; i < numOfEdge ; i++){
			Edge tmpEdge = edges[i];

			if(!set.isSameSet(tmpEdge.from, tmpEdge.to)){
				set.union(tmpEdge.from, tmpEdge.to);
				result += tmpEdge.cost;
			}
		}

		return result;

	}
}

class DisjointSet {
    private int n;
    private int[] p;
    private int[] rank;

    public DisjointSet(int n){
        this.n = n;

        p = new int[n + 1];
        rank = new int[n + 1];

        for(int i = 1; i <= n; i++){
            makeSet(i);
        }
    }

    private void makeSet(int x){
        p[x] = x;
        rank[x] = 0;
    }

    public void union(int x, int y){
        link (findSet(x), findSet(y));
    }

    private int findSet(int x){
        if(x != p[x]){
            p[x] = findSet( p[x]);
        }
        return p[x];
    }

    public boolean isSameSet(int x, int y){
        return findSet(x) == findSet(y);
    }

    private void link(int x, int y){
        if(rank[x] > rank[y]){
            p[y] = x;
        }
        else {
            p[x] = y;
            if(rank[x] == rank[y]){
                rank[y]++;
            }
        }
    }
}

class Edge implements Comparable<Edge>{
	int from;
	int to;
	int cost;

	Edge(int from, int to, int cost){
		this.from = from;
		this.to = to;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge e) {
		return this.cost - e.cost;
	}
}
