import java.util.*;

public class Main {
    static HashSet<Integer> visited;
    static int N;
    static int M;
    static int before[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        before = new int[N + 1];
        Arrays.fill(before, -1);
        Map<Integer, HashSet<Integer>> path = new HashMap<Integer, HashSet<Integer>>();

        for (int i = 0; i < N + 1; i++) {
            path.put(i, new HashSet<>());
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            path.get(A).add(B);
            path.get(B).add(A);
        }


        visited = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        visited.add(1);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            HashSet<Integer> target = path.get(v);

            for (Integer i : target){
                if (!visited.contains(i)) {
                    queue.add(i);
                    visited.add(i);
                    before[i] = v;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        if (before[2] == -1) {
            sb.append("No");
        } else {
            sb.append("Yes");
            sb.append("\n");
        }
        for (int i = 2; i < N + 1; i++) {
            sb.append(before[i]);
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}