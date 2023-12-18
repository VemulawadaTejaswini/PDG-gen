import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        FordFulkerson ff = new FordFulkerson(V);
        for (int i = 0; i < E; i++) {
            ff.addEdge(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        System.out.println( ff.execute(0, V-1) );
    }

    static class FordFulkerson {

        private final List<Edge>[] EDGE;
        private final boolean[] USED;

        @SuppressWarnings("unchecked")
        public FordFulkerson(int n) {
            EDGE = new List[n];
            USED = new boolean[n];
        }

        void addEdge(int from, int to, int cap) {
            if( EDGE[from] == null ) EDGE[from] = new ArrayList<>();
            if( EDGE[to] == null ) EDGE[to] = new ArrayList<>();

            EDGE[from].add( new Edge(to, cap, EDGE[to].size()) );
            EDGE[to].add( new Edge(from, 0, EDGE[from].size()-1) );
        }

        int execute(int s, int t) {
            int flow = 0;
            int f;
            while(true) {
                Arrays.fill(USED, false);
                f = dfs(s, t, Integer.MAX_VALUE);
                if( f == 0 ) return flow;
                flow += f;
            }
        }

        private int dfs(int v, int t, int f) {
            if( v == t ) return f;
            USED[v] = true;
            if( EDGE[v] == null ) return 0;
            for (int i = 0; i < EDGE[v].size(); i++) {
                Edge e = EDGE[v].get(i);
                if( USED[e.to] || e.cap <= 0 ) continue;
                int d = dfs(e.to, t, Math.min(f, e.cap) );
                if( d > 0 ) {
                    e.cap -= d;
                    EDGE[e.to].get(e.rev).cap += d;
                    return d;
                }
            }
            return 0;
        }
    }

    static class Edge {
        int to, cap, rev;

        public Edge(int to, int cap, int rev) {
            this.to = to;
            this.cap = cap;
            this.rev = rev;
        }
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}

