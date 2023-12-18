import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<HashSet<Integer>> graph;
    static HashSet<Integer>components;
    static int cnt;
    static boolean[]visited;
    public static void dfs(int vertex){
        if (visited[vertex])return;
        components.add(vertex);
        visited[vertex] = true;
        for (int nbr:graph.get(vertex))
            dfs(nbr);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] inp = buffer.readLine().split(" ");
        int n = Integer.parseInt(inp[0]), m = Integer.parseInt(inp[1]);
        if (m==0)
            System.out.println(1);
        else
        {
            graph = new ArrayList<>();
            for (int pos = 0; pos < n; pos++) {
                graph.add(new HashSet<>());
            }
            visited = new boolean[n];
            for (int pos = 0; pos < m; pos++) {
                inp = buffer.readLine().split(" ");
                int a = Integer.parseInt(inp[0]), b = Integer.parseInt(inp[1]);
                a--;
                b--;
                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            components = new HashSet<>();
            int ans = Integer.MIN_VALUE;
            for (int pos = 0; pos < n; pos++) {
                if (graph.get(pos).size() == 0) continue;
                if (!visited[pos]) {
                    components.clear();
                    dfs(pos);
                    ans = Math.max(ans, components.size());
                }
            }
            System.out.println(ans);
        }
    }
}
