import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int e = in.nextInt();
        Prim prim = new Prim(v);
        for (int i = 0; i < e; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int w = in.nextInt();

            prim.addEdge(a, b, w);
        }

        ArrayList<Triplet> mst = prim.getMinimumSpanningTree();
        int sum = 0;
        for (Triplet edge: mst)
            sum += edge.w;
        System.out.println(sum);
    }
}

class Prim {
    private int size;
    private ArrayList<ArrayList<Triplet>> adl;

    public Prim(int size) {
        this.size = size;
        adl = new ArrayList<>();
        for (int i = 0; i < size; i++)
        	adl.add(new ArrayList<>());
    }

    public void addEdge(int u, int v, int w) {
    	adl.get(u).add(new Triplet(u, v, w));
    	adl.get(v).add(new Triplet(v, u, w));
    }

    public ArrayList<Triplet> getMinimumSpanningTree() {
    	ArrayList<Triplet> mst = new ArrayList<>();
    	PriorityQueue<Triplet> nearest = new PriorityQueue<>((a, b) -> a.w - b.w);
    	boolean[] visit = new boolean[this.size];

    	nearest.offer(new Triplet(-1, 0, 0));
    	while (nearest.size() > 0) {
    		Triplet cur = nearest.poll();
    		if (visit[cur.v])
    			continue;

    		visit[cur.v] = true;
    		if (cur.u != -1)
	    		mst.add(cur);

    		for (Triplet ng: this.adl.get(cur.v))
    			nearest.offer(ng);
    	}
    	return mst;
    }
}

class Triplet {
    public int u;
    public int v;
    public int w;

    public Triplet(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }

    public String toString() {
        return "("
                + Integer.toString(u) + ", "
                + Integer.toString(v) + ", "
                + Integer.toString(w) + ")";
    }
}

