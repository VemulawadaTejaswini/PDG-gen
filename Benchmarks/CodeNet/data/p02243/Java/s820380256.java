import java.io.IOException;
import java.io.InputStream;
import java.util.*;

class Edge {
    int from, to, cost;

    public Edge(int from, int to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
}

class Node implements Comparable<Node> {
    int id, value;

    public Node(int id, int value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public int compareTo(Node o) {
        return value - o.value;
    }
}

public class Main {

    static int n;
    static List<List<Edge>> graph;
    static boolean[] visited;
    static int[] dist;

    static void dijkstra() {
        visited = new boolean[n];
        dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        visited[0] = true;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(0, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            visited[node.id] = true;
            if (dist[node.id] < node.value) continue;

            for (Edge e : graph.get(node.id)) {
                if (visited[e.to]) continue;
                if (dist[e.to] > dist[node.id] + e.cost) {
                    dist[e.to] = dist[node.id] + e.cost;
                    pq.offer(new Node(e.to, dist[e.to]));
                }
            }
        }
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        n = fs.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i < n; ++i) graph.add(new ArrayList<>());
        for (int i = 0; i < n; ++i) {
            int id = fs.nextInt();
            int degree = fs.nextInt();
            for (int j = 0; j < degree; ++j) {
                int to = fs.nextInt();
                int cost = fs.nextInt();
                graph.get(id).add(new Edge(id, to, cost));
            }
        }

        dijkstra();

        for (int i = 0; i < n; ++i) {
            System.out.println(i + " " + dist[i]);
        }
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() { return Double.parseDouble(next());}
}




























