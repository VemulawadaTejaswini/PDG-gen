import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    ;
    PrintWriter out = new PrintWriter(System.out);
    StringTokenizer tok = new StringTokenizer("");

    void run() {
        try {
            long timeStart = System.currentTimeMillis();
            solve();

            out.close();

            long timeEnd = System.currentTimeMillis();
            System.err.println("Time = " + (timeEnd - timeStart));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    String readLine() throws IOException {
        return in.readLine();
    }

    String delimiter = " ";

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            String nextLine = readLine();
            if (null == nextLine) return null;

            tok = new StringTokenizer(nextLine);
        }

        return tok.nextToken(delimiter);
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    static int[] dist;
    static int[] par;
    static int n;
    static List<Integer>[] g;
    static ArrayDeque<Integer> q;
    static boolean used[];
    static void BFS(int start){
        q = new ArrayDeque<>();
        int v;
        used[start] = true;
        dist[start] = 0;
        q.addLast(start);
        while (q.size() > 0){
            v = q.pollFirst();
            for(int to : g[v]){
                if(dist[v] + 1 < dist[to]){
                    used[to] = true;
                    dist[to] = dist[v] + 1;
                    par[to] = v;
                    q.addLast(to);
                }
            }
        }
    }

    void solve() throws IOException {
        int n = readInt(), m = readInt(), a, b;
        g = new List[n];
        ArrayDeque<Integer> gr = new ArrayDeque<>();
        for(int v = 0; v < n; v++)
            g[v] = new ArrayList<>();
        dist = new int[n];
        par = new int[n];
        used = new boolean[n];
        for(int i = 0; i < n; i++){
            dist[i] = n;
            used[i] = false;
            par[i] = -1;
        }
        for(int e = 0; e < m; e++){
            a = readInt();
            b = readInt();
            g[a-1].add(b-1);
            g[b-1].add(a-1);
        }
        BFS(0);
        boolean f = true;
        for (int i = 1; i < n; i++)
            if (par[i] == -1){
                f = false;
                break;
            }
        if (f){
            out.println("Yes");
            for (int i = 1; i < n; i++)
                out.println(par[i] + 1);
        }
        else
            out.println("No");
    }


}