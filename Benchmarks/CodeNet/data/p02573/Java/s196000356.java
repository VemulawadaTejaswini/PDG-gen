import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Integer>[] adj = new ArrayList[n];
            for(int i=0 ; i<n ; i++) adj[i] = new ArrayList<>();
            for(int i=0 ; i<m ; i++) {
                int u = sc.nextInt()-1;
                int v = sc.nextInt()-1;
                adj[u].add(v);
                adj[v].add(u);
            }

            boolean[] vis = new boolean[n];
            int max = 0;
            for(int i=0 ; i<n ; i++) {
                if(!vis[i]) {
                    vis[i] = true;
                    LinkedList<Integer> queue = new LinkedList<>();
                    queue.add(i);
                    int elem = 1;
                    while(!queue.isEmpty()) {
                        int x = queue.poll();
                        for(int y: adj[x]) {
                            if(!vis[y]) {
                                vis[y] = true;
                                queue.add(y);
                                elem++;
                            }
                        }
                    }
                    max = Math.max(max, elem);
                }
            }
            pw.println(max);
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
    
    static class Reader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while(!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException io) {
                    io.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
