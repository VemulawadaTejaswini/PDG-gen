import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> to = new ArrayList<>(100005);
        for (int i = 0; i < 100005; i++) {
            to.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            A--;
            B--;
            to.get(A).add(B);
            to.get(B).add(A);
        }
        sc.close();

        int[] dist = new int[100005];
        Arrays.fill(dist, -1);
        int[] pre = new int[100005];
        Arrays.fill(pre, -1);

        dist[0] = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(0);
        while (!queue.isEmpty()) {
            int v = queue.poll();

            for (Integer u : to.get(v)) {
                if (dist[u] == -1) {
                    dist[u] = dist[v] + 1;
                    pre[u] = v;
                    queue.offer(u);
                }
            }
        }

        System.out.println("Yes");
        for (int i = 0; i < n; i++) {
            if (i == 0)
                continue;
            int p = pre[i];
            p++;
            System.out.println(p);
        }
    }
}
