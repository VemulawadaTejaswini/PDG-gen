import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        ArrayList<Integer>[] list = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            a[i] = Integer.parseInt(sc.next())  - 1;
            b[i] = Integer.parseInt(sc.next()) - 1;
            list[a[i]].add(b[i]);
            list[b[i]].add(a[i]);
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            k = Math.max(k, list[i].size());
        }
        Map<Long, Integer> map = new HashMap<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        Set<Integer> seen = new HashSet<>();
        int[] parent = new int[n];
        seen.add(0);

        while (queue.size() != 0) {
            int now = queue.poll();
//            int color[] = new int[k];
            int color_num = 0;
            for (Integer next : list[now]) {
                if (!seen.contains(next)) {
                    color_num++;
                    seen.add(next);
                    if (color_num == parent[now]) {
                        color_num++;
                    }
                    long min = Math.min(now, next);
                    long max = Math.max(now, next);
                    map.put(100000 * min + max, color_num);
                    parent[next] = color_num;
                    queue.add(next);
                }
            }
//            for (Integer x : list[now]) {
//                long min = Math.min(now, x);
//                long max = Math.max(now, x);
//                if (map.containsKey(100000 * min + max)) {
//                    color[map.get(100000 * min + max)]++;
//                }
//            }
//            int idx = 0;
//            for (Integer x : list[now]) {
//                if (!seen.contains(x)) {
//                    long min = Math.min(now, x);
//                    long max = Math.max(now, x);
//                    while (color[idx] != 0) {
//                        idx++;
//                    }
//                    map.put(min * 100000 + max, idx);
//                    color[idx]++;
//                    queue.add(x);
//                    seen.add(x);
//                }
//            }
        }

        System.out.println(k);
        for (int i = 0; i < n - 1; i++) {
            System.out.print(map.get((long) a[i] * 100000 + b[i]));
            System.out.print("\n");
        }


    }

}
