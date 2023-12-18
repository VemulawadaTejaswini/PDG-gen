import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Vertex> vMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (!vMap.containsKey(a)) {
                vMap.put(a, new Vertex(a));
            }
            if (!vMap.containsKey(b)) {
                vMap.put(b, new Vertex(b));
            }
            vMap.get(a).nbrs.add(vMap.get(b));
            vMap.get(b).nbrs.add(vMap.get(a));
        }

        final Set<Integer> vis = new HashSet<>();
        int ans = 0;
        int lastSize = 0;
        for (int i = 1; i <= n; i++) {
            if (!vis.contains(i) && vMap.containsKey(i)) {
                bfs(vMap, i, vis);
                ans = Math.max(ans, vis.size() - lastSize);
                lastSize = vis.size();
            }
        }
        System.out.println(ans);
    }

    private static void bfs(Map<Integer, Vertex> vMap, int v, Set<Integer> visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        while (!q.isEmpty()) {
            int x = q.poll();
            for (Vertex n : vMap.get(x).nbrs) {
                if (!visited.contains(n.id)) {
                    q.add(n.id);
                    visited.add(n.id);
                }
            }
        }
    }

    static class Vertex {
        int id;
        List<Vertex> nbrs = new ArrayList<>();

        public Vertex(int id) {
            this.id = id;
        }
    }
}
