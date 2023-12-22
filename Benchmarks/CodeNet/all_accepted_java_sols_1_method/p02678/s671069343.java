import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            a--;
            b--;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int[] dist = new int[n];
        int[] ans = new int[n];
        Arrays.fill(dist, -1);

        Deque<Integer> q = new ArrayDeque<>();
        q.add(0);
        dist[0] = 0;
 
        while (!q.isEmpty()) {
            int i = q.poll();

            for (int j = 0; j < graph.get(i).size(); j++) {
                int v = graph.get(i).get(j);

                if (dist[v] < 0) {
                    dist[v] = dist[i] + 1;
                    ans[v]  = i;
                    q.add(v);
                }
            }                
        }
        System.out.println("Yes");

        for (int i = 1; i < n; i++) {
            System.out.println(ans[i]+1);
        }
    }
}