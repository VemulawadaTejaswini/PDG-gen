import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<List<Integer>> g = new ArrayList<>();
        for (int i= 0; i < N; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            g.get(A).add(B);
            g.get(B).add(A);
        }

        int[] mark = new int[N];
        for (int i = 0; i < N; i++) {
            mark[i] = -1;
        }

        LinkedList<Integer> q = new LinkedList<>();
        q.offer(0);
        while (!q.isEmpty()) {
            int now = q.poll();
            List<Integer> next = g.get(now);
            for (int n : next) {
                if (n == now) continue;
                if (mark[n] == -1) {
                    q.add(n);
                    mark[n] = now;
                }
            }
        }

        System.out.println("Yes");
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < N; i++) {
            ans.append(mark[i]+1).append('\n');
        }
        System.out.print(ans);
    }
}
