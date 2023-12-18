import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] adj = new int[n+1][];
        for (int i = 0; i < n; i++) {
            int u = in.nextInt();
            int k = in.nextInt();
            adj[u] = new int[k];
            for (int j = 0; j < k; j++) {
                adj[u][j] = in.nextInt();
            }
        }
        in.close();
        int[] d = bfs(adj, n);
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + d[i]);
        }
    }

    private static int[] bfs(int[][] adj, int n) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.offer(1);
        int[] d = new int[n+1];
        Arrays.fill(d, -1);
        d[1] = 0;
        visited.add(1);
        while (!queue.isEmpty()) {
            int v = queue.poll();
            int[] neighbors = adj[v];
            for (int i : neighbors) {
                if (!visited.contains(i)) {
                    visited.add(i);
                    queue.offer(i);
                    if (d[i] < 0) {
                        d[i] = d[v] + 1;
                    } else if (d[v] + 1 < d[i]) {
                        d[i] = d[v] + 1;
                    }
                }
            }
        }
        return d;
    }
}

