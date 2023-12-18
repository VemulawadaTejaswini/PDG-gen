import java.util.*;

class Dijkstra {
    private int size;
    private ArrayList<ArrayList<Pair>> adl;

    public Dijkstra (int size) {
        this.size = size;
        adl = new ArrayList<>();
        for (int i = 0; i < size; i++)
            adl.add(new ArrayList<>());
    }

    public void addEdge(int u, int v, int w) {
        adl.get(u).add(new Pair(v, w));
    }

    public ArrayList<Integer> shortestPath(int source) {
        ArrayList<Integer> distance = new ArrayList<Integer>();
        PriorityQueue<Pair> nearest = new PriorityQueue<>((a, b) -> a.w - b.w);
        boolean[] visit = new boolean[this.size];

        for (int i = 0; i < size; i++)
            distance.add(-1);

        nearest.offer(new Pair(source, 0));
        while (nearest.size() > 0) {
            Pair cur = nearest.poll();
            if (visit[cur.v])
                continue;

            visit[cur.v] = true;
            distance.set(cur.v, cur.w);

            for (Pair ng: this.adl.get(cur.v))
                nearest.offer(new Pair(ng.v, cur.w + ng.w));
        }
        return distance;
    }
}

class Pair {
    public int v;
    public int w;

    public Pair(int v, int w) {
        this.v = v;
        this.w = w;
    }

    public Pair() {
        this(0, 0);
    }

    public String toString() {
        return "(" + Integer.toString(v) + ", " + Integer.toString(w) + ")";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int e = in.nextInt();
        int s = in.nextInt();
        Dijkstra dijkstra = new Dijkstra(v);
        for (int i = 0; i < e; i++) {
            int p = in.nextInt();
            int q = in.nextInt();
            int w = in.nextInt();
            dijkstra.addEdge(p, q, w);
        }

        ArrayList<Integer> distance = dijkstra.shortestPath(s);
        for (Integer d: distance)
            System.out.println(d == -1 ? "INF" : d);
    }
}

