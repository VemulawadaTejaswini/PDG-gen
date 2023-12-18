import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

@SuppressWarnings("unchecked")
public class Main {

    static int M;
    static int N;
    static int[] B;
    static int[] R;

    public static void main(String[] args) {
        FastScanner fc = new FastScanner(System.in);

        while(true) {
            M = fc.nextInt();
            N = fc.nextInt();

            if( M == 0 && N == 0 ) break;

            B = fc.nextIntArray(M);
            R = fc.nextIntArray(N);
            System.out.println( solve() );
        }
    }

    static int[] P = getPrimes(10000000);

    static int solve() {
        List<Edge> es = new ArrayList<>();
        for (int b = 0; b < M; b++) {
            int[] factors = enumFactors(B[b]);

            for (int p : factors) {
                if( p == 0 ) continue;

                for (int r = 0; r < N; r++) {
                    if( R[r] % p == 0 ) {
                        es.add( new Edge(b, r+M) );
                    }
                }
            }
        }
        return matching(M+N, es);
    }

    static int[] getPrimes(int n) {
        int root = (int)Math.sqrt(n);

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= root; i++) {
            if( isPrime[i] ) {
                for (int d = 2; d*i <= n; d++) {
                    isPrime[i*d] = false;
                }
            }
        }

        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if( isPrime[i] ) cnt++;
        }

        int[] primes = new int[cnt];
        int j = 0;
        for (int i = 2; i <= n; i++) {
            if( isPrime[i] ) {
                primes[j++] = i;
            }
        }
        return primes;
    }

    static int[] enumFactors(int n) {
        int[] fs = new int[8]; // 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19 = 9699690;
        int i = 0;
        for (int p : P) {
            if( n % p == 0 ) {
                fs[i++] = p;
                n /= p;
                while( n % p == 0 ) {
                    n /= p;
                }
            }
        }
        if( n != 1 ) {
            fs[i] = n;
        }
        return fs;
    }

    static int matching(int V, List<Edge> E) {
        List<Edge>[] rin = mkRin(V, E);

        int res = 0;
        int[] match = new int[V];
        boolean[] used = new boolean[V];
        Arrays.fill(match, -1);
        for (int v = 0; v < V; v++) {
            if( match[v] == -1 ) {
                Arrays.fill(used, false);
                if( _matching(v, rin, used, match) ) {
                    res++;
                }
            }
        }

        return res;
    }

    static List<Edge>[] mkRin(int V, List<Edge> E) {
        //noinspection unchecked
        List<Edge>[] rin = new List[V];
        for (Edge e : E) {
            if( rin[e.a] == null ) rin[e.a] = new ArrayList<>();
            if( rin[e.b] == null ) rin[e.b] = new ArrayList<>();
            rin[e.a].add(e);
            rin[e.b].add(e);
        }
        return rin;
    }

    static boolean _matching(int v, List<Edge>[] rin, boolean[] used, int[] match) {
        used[v] = true;
        if( rin[v] == null ) return false;

        for (Edge e : rin[v]) {
            int u  = e.a == v ? e.b : e.a;
            int w = match[u];
            if( w == -1 || !used[w] && _matching(w, rin, used, match) ) {
                match[v] = u;
                match[u] = v;
                return true;
            }
        }
        return false;
    }

    static class Edge {
        int a;
        int b;

        public Edge(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public String toString() {
            return "(" + a + "," + b + ")";
        }
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        private String peeked;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        boolean hasNext() {
            return peekLine();
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(consumeLine());
            }
            return tokenizer.nextToken();
        }

        private boolean peekLine() {
            try {
                if( peeked != null ) return true;

                peeked = reader.readLine();
                return peeked != null;

            } catch( IOException e ) {
                throw new RuntimeException(e);
            }
        }

        private String consumeLine() {
            if( peeked != null ) {
                String t;
                t = peeked;
                peeked = null;
                return t;

            } else {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                return consumeLine();
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

