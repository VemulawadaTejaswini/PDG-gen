import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int n1 = in.nextInt() - 1, n2 = in.nextInt() - 1;
            adj[n1].add(n2);
            adj[n2].add(n1);
        }
        int[] distance = new int[N];
        for (int i = 1; i < N; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        int[] point = new int[N];
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> distance[a] - distance[b]);
        pq.offer(0);
        boolean[] added = new boolean[N];
        added[0] = true;
        while (!pq.isEmpty()) {
            int n = pq.poll();
            for (int i : adj[n]) {
                if (distance[n] + 1 < distance[i]) {
                    distance[i] = distance[n] + 1;
                    point[i] = n;
                    if (!added[i]) {
                        pq.offer(i);
                    }
                }
            }
        }
        System.out.println("Yes");
        for (int i = 1; i < N; i++) {
            System.out.println(point[i] + 1);
        }
    }
}