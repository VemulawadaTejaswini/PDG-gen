import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(sc.next());

            Set<Integer> set = new HashSet<>();

            for (int j = 0; j < k; j++) {
                set.add(Integer.parseInt(sc.next()) - 1);
            }

            map.put(i, set);
        }

        List<Boolean> p = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            p.add(Integer.parseInt(sc.next()) == 1);
        }

        int count = 0;

        for (int i = 0; i < Math.pow(2, n); i++) {
            boolean on = true;

            for (int j = 0; j < m; j++) {
                boolean sw = false;

                for (int k : map.get(j)) {
                    sw = sw ^ ((i & (int) Math.pow(2, k)) != 0);
                }

                if (sw != p.get(j)) on = false;
            }

            if (on) count++;
        }

        System.out.println(count);
    }
}