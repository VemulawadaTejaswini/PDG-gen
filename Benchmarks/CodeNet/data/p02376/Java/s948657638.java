/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Edge {
    int u, v, c, f;
    Edge(int u_, int v_, int c_, int f_) {
        u = u_;
        v = v_;
        c = c_;
        f = f_;
    }
    public int flow() {
        return c - f;
    }
}

class Solution {
    int source = 0;
    int sink;
    
    public void solve(FastReader in, PrintWriter out) {
        List<Map<Integer, Edge>> graph = new ArrayList<>();
        int N = in.nextInt();
        int M = in.nextInt();
        sink = N-1;
        for (int i = 0; i < N; i++) graph.add(new HashMap<>());

        for (int i = 0; i < M; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            int c = in.nextInt();
            graph.get(u).put(v, new Edge(u,v,c,0));
            if (!graph.get(v).containsKey(u)) graph.get(v).put(u, new Edge(v,u,0,0));
        }

        Stack<Edge> path = new Stack<>();
        boolean[] seen = new boolean[N];

        while (true) {
            dfs(graph, source, seen, path);
            if (path.isEmpty()) break;
            List<Edge> p = new ArrayList<>();
            while (!path.isEmpty()) {
                p.add(path.pop());
                // System.out.print(p.get(p.size() - 1).v + " ");
            }
            // System.out.println();
            int flow = p.get(0).flow();
            for (Edge e : p) {
                flow = Math.min(flow, e.flow());
            }

            for (Edge e : p) {
                e.f += flow;
                graph.get(e.v).get(e.u).f -= flow;
            }

            Arrays.fill(seen, false);
            path.clear();
        }

        int total = 0;
        for (Edge e : graph.get(source).values()) {
            total += e.f;
        }
        out.println(total);
    }

    public boolean dfs(List<Map<Integer, Edge>> graph, int index, boolean[] seen, Stack<Edge> path) {
        if (seen[index]) return false;
        seen[index] = true;
        if (index == sink) {
            return true;
        }
        for (Edge e : graph.get(index).values()) {
            if (e.f < e.c) {
                path.push(e);
                if (dfs(graph, e.v, seen, path)) return true;
                path.pop();
            }
        }
        return false;
    }
}


/*******************************************************************************
********************************************************************************
********************************************************************************/


/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader in = new FastReader();
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		Solution solution = new Solution();
		solution.solve(in, out);
		out.flush();
		out.close();
	}
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;
    public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
    String next() {
        while (st == null || !st.hasMoreElements()) {
            try { st = new StringTokenizer(br.readLine()); }
            catch (IOException  e) { e.printStackTrace(); }
        }
        return st.nextToken();
    }
    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble() { return Double.parseDouble(next()); }
    String nextLine() {
        String str = "";
        try { str = br.readLine(); }
        catch (IOException e) { e.printStackTrace(); }
        return str;
    }
}

