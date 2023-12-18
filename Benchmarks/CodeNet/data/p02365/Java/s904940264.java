import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int V = ni();
        int E = ni();
        int r = ni();

        ArrayList<ArrayList<Edge>> G = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            G.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            int s = ni();
            int t = ni();
            int w = ni();

            G.get(s).add(new Edge(s, t, w));
        }

        PriorityQueue<Edge> Q = new PriorityQueue<>();
        boolean[] used = new boolean[V];

        used[r] = true;
        for (Edge edge : G.get(r)) {
            Q.add(edge);
        }

        UnionFind uf = new UnionFind(V);

        int ans = 0;

        while (!Q.isEmpty()) {
            Edge edge = Q.poll();
            if (!used[edge.to] && !uf.isConnected(edge.from, edge.to)) {
                used[edge.to] = true;
                for (Edge e : G.get(edge.to)) {
                    if (!used[e.to]) {
                        Q.add(e);
                    }
                }
                ans += edge.cost;
            }
        }

        out.println(ans);
    }

    class UnionFind {
    	private int[] parent;
    	public UnionFind(int size) {
    		parent = new int[size];
    		Arrays.fill(parent, -1);
    	}
    	public boolean union(int x,int y) {
    		x = root(x);
    		y = root(y);
    		if (x!=y) {
    			if (parent[y] < parent[x]) {
    				int tmp = y;
    				y = x;
    				x = tmp;
    			}
    			parent[x] += parent[y];
    			parent[y] = x;
    			return true;
    		}
    		return false;
    	}
    	public boolean isConnected(int x,int y) {
    		return root(x)==root(y);
    	}
    	public int root(int x) {
    		return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
    	}
    	public int size(int x) {
    		return -parent[root(x)];
    	}
    	public ArrayList<ArrayList<Integer>> groups() {
    		int n = parent.length;
    		ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
    		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
    		for(int i=0;i<n;i++) {
    			int r = root(i);
    			if (!hm.containsKey(r)) {
    				hm.put(r, g.size());
    				g.add(new ArrayList<Integer>());
    			}
    			g.get(hm.get(r)).add(i);
    		}
    		return g;
    	}
    	public String toString() {
    		return Arrays.toString(parent);
    	}
    }

    class Edge implements Comparable<Edge> {
        int from, to;
        int cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge edge) {
            return cost - edge.cost;
        }
    }

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}