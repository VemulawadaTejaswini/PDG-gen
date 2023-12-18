import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int M = scan.nextInt();
        int[] h = new int[M];
        int[] w = new int[M];
        HashMap<Integer, List<Integer>> map_h = new HashMap<>();
        HashMap<Integer, List<Integer>> map_w = new HashMap<>();
        HashSet<Long> cache = new HashSet<>();
        for (int i = 0; i < M; i++) {
            h[i] = scan.nextInt();
            w[i] = scan.nextInt();
            cache.add((long) h[i]*1000000 + (long) w[i]);
            if (!map_h.containsKey(h[i])) {
                map_h.put(h[i], new ArrayList<>());
            }
            if (!map_w.containsKey(w[i])) {
                map_w.put(w[i], new ArrayList<>());
            }
            map_h.get(h[i]).add(i);
            map_w.get(w[i]).add(i);
        }
        List<Integer> vl = new ArrayList<>();
        List<Integer> hl = new ArrayList<>();
        HashMap<Integer, HashSet<Integer>> list_vertical = new HashMap<>();
        for (int y : map_h.keySet()) {
            int count = map_h.get(y).size();
            if (!list_vertical.containsKey(count)) {
                list_vertical.put(count, new HashSet<>());
                vl.add(count);
            }
            list_vertical.get(count).add(y);
        }
        HashMap<Integer, HashSet<Integer>> list_horizontal = new HashMap<>();
        for (int x : map_w.keySet()) {
            int count = map_w.get(x).size();
            if (!list_horizontal.containsKey(count)) {
                list_horizontal.put(count, new HashSet<>());
                hl.add(count);
            }
            list_horizontal.get(count).add(x);
        }
        vl.sort(Comparator.reverseOrder());
        hl.sort(Comparator.reverseOrder());
        long ans = vl.get(0) + hl.get(0)-1;
        for (int y : list_vertical.get(vl.get(0))) {
            for (int x : list_horizontal.get(hl.get(0))) {
                long index = y * 1000000 + x;
                if (!cache.contains(index)) {
                    System.out.println(ans + 1);
                    return;
                }
            }
        }
        System.out.println(ans);
    }
}
