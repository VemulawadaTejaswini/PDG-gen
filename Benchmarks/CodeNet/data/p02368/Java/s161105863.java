import java.io.*;
import java.util.*;

public class Main {
    private static HashMap<Integer, List<Integer>> graph;
    private static int time;

    public static void main(String[] args) throws Exception{
        FastScanner scanner = new FastScanner();
        int V = scanner.nextInt();
        int E = scanner.nextInt();

        graph = new HashMap<>(V);
        for(int i = 0; i < V; ++i){
            graph.put(i, new LinkedList<>());
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
        }

        boolean[] visited = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        Stack<Integer> stack = new Stack<>();
        boolean[] inStack = new boolean[V];

        int[] result = new int[V];
        for(int i = 0; i < V; ++i){
            if(!visited[i]){
                TarjanUtil(i, visited, disc, low, stack, inStack, result);
            }
        }

        int Q = scanner.nextInt();
        PrintWriter printWriter = new PrintWriter(System.out);
        for(int i = 0; i < Q; ++i){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(result[x] == result[y]){
                printWriter.println("1");
            }
            else{
                printWriter.println("0");
            }
        }

        printWriter.flush();
    }

    private static void TarjanUtil(int u, boolean[] visited, int[] disc, int[] low, Stack<Integer> stack, boolean[] inStack, int[] result){
        if(visited[u]){
            return;
        }

        visited[u] = true;
        disc[u] = low[u] = ++time;
        stack.push(u);
        inStack[u] = true;

        for(Integer v : graph.get(u)){
            if(!visited[v]){
                TarjanUtil(v, visited, disc, low, stack, inStack, result);
                low[u] = Math.min(low[u], low[v]);
            }
            else if(inStack[v]){
                low[u] = Math.min(low[u], disc[v]);
            }
        }

        if(disc[u] == low[u]){
            while(!stack.isEmpty()){
                int v = stack.pop();
                inStack[v] = false;
                result[v] = disc[u];

                if(v == u){
                    break;
                }
            }
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}