import java.io.IOException;
import java.io.InputStream;
import java.util.*;

class Main implements Runnable{
    private HashMap<Integer, List<Integer>> graph;
    private HashMap<Integer, List<Integer>> reversedGraph;
    public static void main(String[] args) throws Exception {
        new Thread(null, new Main(), "bridge", 16 * 1024 * 1024).start();
    }

    @Override
    public void run() {
        FastScanner scanner = new FastScanner();
        int V = scanner.nextInt();
        int E = scanner.nextInt();

        graph = new HashMap<>(V);
        reversedGraph = new HashMap<>(V);
        for(int i = 0; i < V; ++i){
            graph.put(i, new LinkedList<>());
            reversedGraph.put(i, new LinkedList<>());
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
            reversedGraph.get(v).add(u);
        }

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        boolean[] isInStack = new boolean[V];

        for(int i = 0; i < V; ++i){
            if(!visited[i]){
                fillStack(i, visited, stack, isInStack);
            }
        }

        Arrays.fill(visited, false);
        List<Set<Integer>> result = new LinkedList<>();
        while(!stack.isEmpty()){
            int u = stack.pop().intValue();

            if(isInStack[u]){
                Set<Integer> set = new HashSet<>();
                DFSUtil(u, visited, isInStack, set);
                if(set.size() > 1){
                    result.add(set);
                }
            }
        }

        int Q = scanner.nextInt();
        for(int i = 0; i < Q; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            if(isInSCC(u, v, result)){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }

    private void fillStack(int u, boolean[] visited, Stack<Integer> stack, boolean[] isInStack){
        if(visited[u]){
            return;
        }

        visited[u] = true;

        for(Integer v : graph.get(u)){
            if(!visited[v]){
                fillStack(v, visited, stack, isInStack);
            }
        }

        stack.push(u);
        isInStack[u] = true;
    }

    private void DFSUtil(int u, boolean[] visited, boolean[] isInStack, Set<Integer> SCC){
        if(visited[u]){
            return;
        }

        visited[u] = true;
        isInStack[u] = false;
        SCC.add(u);

        for(int v : reversedGraph.get(u)){
            if(!visited[v]){
                DFSUtil(v, visited, isInStack, SCC);
            }
        }
    }

    private boolean isInSCC(int u, int v, List<Set<Integer>> result){
        for(Set<Integer> SCC : result){
            if(SCC.contains(u) && SCC.contains(v)){
                return true;
            }
        }

        return false;
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