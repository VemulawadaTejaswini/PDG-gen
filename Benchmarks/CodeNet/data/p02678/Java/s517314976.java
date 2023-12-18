import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();


        List<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i=0; i<N; i++) {
            ArrayList<Integer> g = new ArrayList<Integer>();
            graph.add(g);
        }

        for (int i=0; i<M; i++) {
            int A = sc.nextInt() - 1;
            int B = sc.nextInt() - 1;

            graph.get(A).add(B);
            graph.get(B).add(A);
        }


        int[] dist = new int[N];
        int[] sign = new int[N];

        Queue<Integer> Q = new ArrayDeque<Integer>();
        dist[0] = 0;
        sign[0] = 0;
        Q.add(0);


        while (!Q.isEmpty()) {
            //キューから値の取得と削除
            Integer v = Q.poll();
            for (Integer u : graph.get(v)) {
                if (dist[u] != 0) continue;
                Q.add(u); dist[u]=dist[v]+1; sign[u]=v;
            }
        }

        System.out.println("YES");
        for (int s = 0; s < sign.length; s++) {
            if (s == 0) continue;
            System.out.println(sign[s] + 1);
        }
    }
}
