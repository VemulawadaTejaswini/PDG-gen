import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

import java.lang.*;

class MinCostFlow{
    private static final int inf = 1001001000;
    static class Edge{
        public int to;
        public int cap;
        public int cost;
        public int rev;
        public boolean isRev;
        public Edge(final int t, final int ca, final int co, final int r, final boolean isrev){
            to = t;
            cap = ca;
            cost = co;
            rev = r;
            isRev = isrev;
        } 
    };
    static class State implements Comparable<State>{
        public int dist;
        public int node;
        public State(int d, int n){
            this.dist = d;
            this.node = n;
        }
        @Override
        public int compareTo(State other){
            return dist - other.dist;
        }
    };
    private int numberOfNodes;
    private List<Edge>[] graph;
    private int[] h;
    private int[] dist;
    private int[] prevv;
    private int[] preve;
    @SuppressWarnings("unchecked")
    public MinCostFlow(final int N){
        numberOfNodes = N;
        graph = new ArrayList[N];
        for(int i = 0; i < N; i++){
            graph[i] = new ArrayList<Edge>();
        }
        h = new int[N];
        dist = new int[N];
        prevv = new int[N];
        preve = new int[N];
    }
    public void AddEdge(final int from, final int to, final int cap, final int cost){
        graph[from].add(new Edge(to, cap, cost, graph[to].size(), false));
        graph[to].add(new Edge(from, 0, -cost, graph[from].size()-1, true));
    }
    public int calc(final int s, final int t, final int flow){
        int f = flow;
        int res = 0;
        while(f > 0){
            PriorityQueue<State> Q = new PriorityQueue<>();
            Arrays.fill(dist,inf);
            dist[s] = 0;
            Q.offer(new State(0,s));
            while(!Q.isEmpty()){
                State now = Q.poll();
                if(dist[now.node] < now.dist){
                    continue;
                }
                for(int i = 0; i < graph[now.node].size(); i++){
                    Edge e = graph[now.node].get(i);
                    if(e.cap > 0 && dist[e.to] > dist[now.node] + e.cost + h[now.node] - h[e.to]){
                        dist[e.to] = dist[now.node] + e.cost + h[now.node] - h[e.to];
                        prevv[e.to] = now.node;
                        preve[e.to] = i;
                        Q.offer(new State(dist[e.to],e.to));
                    }
                }
            }
            if(dist[t]==inf){
                return -1;
            }
            for(int v = 0; v < numberOfNodes; v++){
                h[v] += dist[v];
            }
            int d = f;
            for(int v = t; v != s; v = prevv[v]){
                d = Math.min(d, graph[prevv[v]].get(preve[v]).cap);
            }
            f -= d;
            res += d * h[t];
            for(int v = t; v != s; v = prevv[v]){
                Edge e = graph[prevv[v]].get(preve[v]);
                e.cap -= d;
                graph[v].get(e.rev).cap += d;
            }
        }
        return res;
    }
};

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int F = Integer.parseInt(sc.next());
        MinCostFlow flow = new MinCostFlow(N);
        for(int i = 0; i < M; i++){
            int u = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            flow.AddEdge(u, v, c, d);
        }
        sc.close();
        System.out.println(flow.calc(0,N-1,F));
    }
}
