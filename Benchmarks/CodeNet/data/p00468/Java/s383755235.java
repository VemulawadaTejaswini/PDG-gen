import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            HashSet<Integer> all = new HashSet<>();
            all.addAll(graph.get(1));
            for (int x : graph.get(1)) {
                all.addAll(graph.get(x));
            }
            if (all.size() == 0) {
                sb.append(0).append("\n");
            } else {
                sb.append(all.size() - 1).append("\n");
            }
        }
        System.out.print(sb);
    }
}

