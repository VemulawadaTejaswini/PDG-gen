import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge {
    int to;
    int cost;

    Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}

class Pair implements Comparable<Pair> {
    int cost;
    int index;

    Pair(int cost, int index) {
        this.cost = cost;
        this.index = index;
    }

    public int compareTo(Pair p2) {
        return cost - p2.cost;
    }
}
 
public class Main {
    static final int INF = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        List<List<Edge>> g = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            List<Edge> tmp = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if(a >= 0) tmp.add(new Edge(j, a));
            }
            g.add(tmp);
        }

        int[] mincost = new int[n];
        boolean[] used = new boolean[n];
        for(int i = 0; i < n; i++) {
            mincost[i] = INF;
            used[i] = false;
        }
        mincost[0] = 0;
        int res = 0;

        PriorityQueue<Pair> que = new PriorityQueue<>();
        que.add(new Pair(0, 0));
        while(!que.isEmpty()) {
            Pair p = que.poll();
            int v = p.index;
            if(used[v]) continue;
            used[v] = true;
            res += mincost[v];

            for(int i = 0; i < g.get(v).size(); i++) {
                Edge e = g.get(v).get(i);
                if(mincost[e.to] > e.cost) {
                    mincost[e.to] = e.cost;
                    que.add(new Pair(mincost[e.to], e.to));
                }
            }
        }

        System.out.println(res);
 
        sc.close();
    }
}
