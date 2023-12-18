import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static class Pos {
        public int x;
        public int prev;

        public Pos(int x, int prev) {
            this.x = x;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        int[] ans = new int[n + 1];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            List<Integer> alist = map.get(a[i]);
            alist.add(b[i]);
            map.put(a[i], alist);
            List<Integer> blist = map.get(b[i]);
            blist.add(a[i]);
            map.put(b[i], blist);
        }

        List<Integer> oneList = map.get(1);
        Deque<Pos> queue = new ArrayDeque<>();
        for (int i = 0; i < oneList.size(); i++) {
            queue.add(new Pos(oneList.get(i), 1));
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pos pos = queue.poll();
                int num = pos.x;
                int prev = pos.prev;

                if (ans[num] != 0) {
                    continue;
                }
                ans[num] = prev;
                List<Integer> l = map.get(num);
                for (int j = 0; j < l.size(); j++) {
                    queue.add(new Pos(l.get(j), num));
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (ans[i] == 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        for (int i = 2; i <= n; i++) {
            System.out.println(ans[i]);
        }
    }

}
