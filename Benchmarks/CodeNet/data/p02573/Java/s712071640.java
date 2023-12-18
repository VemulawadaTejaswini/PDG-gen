import java.util.*;

public class Main {

    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Set<Integer>> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new HashSet<>());
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            list.get(A).add(B);
            list.get(B).add(A);
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            int tmp = bfs(list,i);
            max = Math.max(max,tmp);
        }

        System.out.println(max);
    }

    private static int bfs(List<Set<Integer>> list, int now) {

        Set<Integer> tmp = new HashSet<>();
        tmp.add(now);

        LinkedList<Integer> q = new LinkedList<>();
        Set<Integer> next = list.get(now);
        for (int n : next) {
            q.offer(n);
            tmp.add(n);
        }
        while (!q.isEmpty()) {
            for (int n: list.get(q.poll())) {
                tmp.add(n);
            }
        }

        return tmp.size();
    }
}
