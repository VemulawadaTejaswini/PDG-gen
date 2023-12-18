import java.io.*;
import java.util.*;
public class Main {
    final static long mod = 1000000007;
    static class Edge {
        int from, to, cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }

    // Perform a depth first search on the graph counting
    // the number of nodes traversed starting at some position
    static long dfs(int at, boolean[] visited, Map<Integer, List<Edge>> graph) {

        // We have already visited this node
        if (visited[at]) return 0;

        // Visit this node
        visited[at] = true;
        long count = 1;

        // Visit all edges adjacent to where we're at
        List<Edge> edges = graph.get(at);
        if (edges != null) {
            for (Edge edge : edges) {
                count += dfs(edge.to, visited, graph);
            }
        }

        return count;
    }

    public static void addDirectedEdge(Map<Integer, List<Edge>> graph, int from, int to, int cost) {
        List<Edge> list = graph.computeIfAbsent(from, k -> new ArrayList<Edge>());
        list.add(new Edge(from, to, cost));
    }
    static void debug(Object...args)
    {
        System.out.println(Arrays.deepToString(args));
    }
    public static void main(String[] args) {
        InputReader sc = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Random gen = new Random();
        int test = 1;//sc.nextInt();
        while(test-->0) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            HashMap<Integer,List<Edge>> graph = new HashMap<>();
            for(int i=0;i<m;i++)
            {
                int from = sc.nextInt();
                int to = sc.nextInt();
                addDirectedEdge(graph,from-1,to-1,0);
                addDirectedEdge(graph,to-1,from-1,0);
            }
//        for(Integer i  :graph.keySet())
//        {
//            List<Edge> l = graph.get(i);
//            for(Edge e : l)
//                pw.println(e.from + " "+e.to + " "+ e.cost);
//        }
            boolean [] visited = new boolean[n];
            long count = 1;
            HashMap<Long,Long> map = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                if(!visited[i])
                {
                    long c = dfs(i,visited,graph);
                    map.put(count,c);
                    count++;

                }
            }
            pw.println(map.size()-1);
//        pw.println("************************");
//        debug(map.toString());


        }
        pw.flush();
        pw.close();

    }




















































































































































































    static class Data implements Comparable<Data>{
        int x;
        int y;

        public Data (int m, int n) {
            x = m;
            y = n;
        }
        @Override
        public int compareTo(Data o) {
            return y - o.y;
        }
    }

    static class InputReader {

        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;

        public InputReader(InputStream st) {
            this.stream = st;
        }

        public int read() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int [] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }
        public long[] nextLongArray(int n) {
            long [] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        public static int[] shuffle(int[] a, Random gen)
        { for(int i = 0, n = a.length;i < n;i++)
        { int ind = gen.nextInt(n-i)+i;
            int d = a[i];
            a[i] = a[ind];
            a[ind] = d;

        }
            return a;
        }
        public static char[] shuffle(char[] a, Random gen)
        { for(int i = 0, n = a.length;i < n;i++)
        { int ind = gen.nextInt(n-i)+i;
            char d = a[i];
            a[i] = a[ind];
            a[ind] = d;

        }
            return a;
        }


        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public String nextLine() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

    }

}
