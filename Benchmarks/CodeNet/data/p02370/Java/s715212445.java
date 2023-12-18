import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.ArrayDeque;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            
            List<Set<Integer>> g = new ArrayList<>();
            for (int i = 0; i < n; i++)
                g.add(new HashSet<>());

            Queue<Integer> q = new ArrayDeque<>();
            Map<Integer, Integer> mm = new HashMap<>();
            for (int i = 0; i < n; i++)
                mm.put(i, 0);
            
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                int f = in.nextInt();
                int t = in.nextInt();

                g.get(f).add(t);
                mm.replace(t, mm.get(t)+1);
            }

            for (Map.Entry<Integer, Integer> e : mm.entrySet()) {
                if (e.getValue() == 0)
                    q.add(e.getKey());
            }

            while (!q.isEmpty()) {
                int v = q.remove();
                out.printf("%d\n", v);

                for (int vv : g.get(v)) {
                    int d = mm.get(vv)-1;

                    if (d == 0)
                        q.add(vv);
                    mm.replace(vv, d);
                }
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}