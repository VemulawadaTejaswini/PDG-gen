import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, List<Integer>> restaurants = new TreeMap<>();
        Map<String, Integer> order = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            String S = sc.next();
            int P = sc.nextInt();
            order.put(S + " " + P, i + 1);
            if (restaurants.containsKey(S)) {
                restaurants.get(S).add(P);
            } else {
                List<Integer> points = new ArrayList<>();
                points.add(P);
                restaurants.put(S, points);
            }
        }
        for (Map.Entry<String, List<Integer>> e: restaurants.entrySet()) {
            e.getValue().sort(Comparator.reverseOrder());
            for (int p: e.getValue()) System.out.println(order.get(e.getKey() + " " + p));
        }
    }
}
