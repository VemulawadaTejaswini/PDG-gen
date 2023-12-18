import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> g = new ArrayList<>();
            graph.add(g);
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt() - 1;
            int B = sc.nextInt() - 1;
            graph.get(A).add(B);
            graph.get(B).add(A);
        }

        int[] dist = new int[N];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = -1;
        }
        Queue<Integer> que = new LinkedList<>();
        dist[0] = 0;
        que.add(0);

        while (!que.isEmpty()) {
            int v = que.remove();
            for (int nv : graph.get(v)) {
                if (dist[nv] != -1) {
                    continue;
                }
                dist[nv] = dist[v] + 1;
                que.add(nv);
            }
        }
        boolean ok = true;
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] == -1) {
                ok = false;
                break;
            }
        }
        if (ok) {
            System.out.println("Yes");
            for (int i = 1; i < N; i++) {
                for (int j = 0; j < graph.get(i).size(); j++) {
                    int next = graph.get(i).get(j);
                    if (dist[next] == dist[i] - 1) {
                        System.out.println(next + 1);
                        break;
                    }
                }
            }
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}