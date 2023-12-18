import java.io.*;
import java.util.*;

public class Main implements Runnable{
    private ArrayList<ArrayList<Integer>> graph;
    private ArrayList<ArrayList<Integer>> rGraph;
    private int clock = 0;
    public static void main(String[] args) throws Exception {
        new Thread(null, new Main(), "bridge", 16 * 1024 * 1024).start();
    }


    @Override
    public void run() {
        try {
            solve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void solve() throws Exception{
        FastScanner scanner = new FastScanner(System.in);

        int V = scanner.nextInt();
        int E = scanner.nextInt();

        graph = new ArrayList<>(V);
        rGraph = new ArrayList<>(V);
        for(int i = 0; i < V; ++i){
            graph.add(new ArrayList<Integer>());
            rGraph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            graph.get(u).add(v);
            rGraph.get(v).add(u);
        }

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        boolean[] inStack = new boolean[V];

        for(int i = 0; i < V; ++i){
            if(!visited[i]){
                dfsUtil(i, visited, stack, inStack);
            }
        }

        int[] result = new int[V];
        Arrays.fill(visited, false);
        while(!stack.isEmpty()){
            Integer top = stack.pop();
            if(inStack[top]){
                ++clock;
                SCC(top, visited, inStack, result);
            }
        }

        int Q = scanner.nextInt();
        PrintWriter printWriter = new PrintWriter(System.out);

        for(int i = 0; i < Q; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            if(result[u] == result[v]){
                printWriter.println("1");
            }
            else{
                printWriter.println("0");
            }
        }

        printWriter.flush();
    }

    private void SCC(int u, boolean[] visited, boolean[] inStack, int[] result){
        visited[u] = true;
        result[u] = clock;
        inStack[u] = false;

        for(int v : rGraph.get(u)){
            if(!visited[v]){
                SCC(v, visited, inStack, result);
            }
        }
    }

    private void dfsUtil(int u, boolean[] visited, Stack<Integer> stack, boolean[] inStack){
        visited[u] = true;

        for(Integer v : graph.get(u)){
            if(!visited[v]){
                dfsUtil(v, visited, stack, inStack);
            }
        }

        stack.push(u);
        inStack[u] = true;
    }

    static class FastScanner {
        private InputStream in;
        private final byte[] buffer = new byte[1024 * 8];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in){
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
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

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}