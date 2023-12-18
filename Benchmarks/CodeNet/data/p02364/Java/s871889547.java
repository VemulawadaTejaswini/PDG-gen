

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        Object[] list = new Object[V];
        for (int i = 0; i < V; i++) {
            list[i] = new LinkedList<Edge>();
        }
        for (int i = 0; i < E; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int w = sc.nextInt();
            LinkedList<Edge> edges = (LinkedList<Edge>)list[s];
            edges.add(new Edge(s, t, w));
            edges = (LinkedList<Edge>)list[t];
            edges.add(new Edge(t, s, w));
        }
        solve(V, E, list);
    }
     
    public static void solve(int V, int E, Object[] list) {
        boolean[] visited = new boolean[V];
        PriorityQueue<Edge> que = new PriorityQueue<Edge>(10000, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.w - o2.w;
            }
        });
        
        int node = 0; // start
        visited[node] = true;
        int d = 0;
        int count = 0;
        
        LinkedList<Edge> edges = (LinkedList<Edge>)list[node];
        Iterator<Edge> it = edges.iterator();
        while(it.hasNext()) {
        	que.add(it.next());
        }
        while(que.isEmpty() == false) {
            Edge edge = que.poll();
            if (visited[edge.t])
                continue;
            
            visited[edge.t] = true;
            node = edge.t;
            d += edge.w;

            it = ((LinkedList<Edge>)list[node]).iterator(); 
            while(it.hasNext()) {
            	edge = it.next();
            	if (visited[edge.t])
            		continue;
            	que.add(edge);
            }
            
            count++;
            if (count >= V-1)
                break;
        }
        System.out.println(d);
    }
}
 
class Edge {
    int s;
    int t;
    int w;
    public Edge(int s, int t, int w) {
        this.s = s;
        this.t = t;
        this.w = w;
    }
}