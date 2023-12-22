import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (h.containsKey(a)) {
                h.put(a, h.get(a) + 1);
            } else {
                h.put(a, 1);
            }
        }
        sc.close();
        long ans = 0;
        for (int k : h.keySet()) {
            if (h.get(k) > k) {
                ans += h.get(k) - k;
            } else if (h.get(k) < k) {
                ans += h.get(k);
            }
        }
        System.out.println(ans);
    }
}