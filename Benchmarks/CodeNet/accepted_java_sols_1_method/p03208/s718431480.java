import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nk = sc.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            Integer h = Integer.parseInt(sc.nextLine());
            if (tm.containsKey(h)) {
                tm.replace(h, tm.get(h) + 1);
            } else {
                tm.put(h, 1);
            }
        }

        int min = Integer.MAX_VALUE;
        ArrayDeque<Integer> queue = new ArrayDeque<>(4);
        int trees = 0;
        for (Map.Entry<Integer, Integer> e: tm.entrySet()) {
            if (e.getValue() >= k) {
                System.out.println(0);
                System.exit(0);
            }
            for (int i = 0; i < e.getValue(); i++) {
                trees++;
                queue.add(e.getKey());
                if (trees == k) {
                    int hmin = queue.getFirst();
                    min = Math.min(min, queue.getLast() - queue.getFirst());
                    while(queue.getFirst() == hmin) {
                        queue.remove();
                    }
                    trees = trees - tm.get(hmin);
                }
            }
        }
        System.out.println(min);
    }
}