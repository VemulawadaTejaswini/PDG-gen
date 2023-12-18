import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<String, Long> h = new HashMap<>();
        h.put("M", 0L);
        h.put("A", 0L);
        h.put("R", 0L);
        h.put("C", 0L);
        h.put("H", 0L);
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (h.containsKey(s.substring(0, 1))) {
                h.put(s.substring(0, 1), h.get(s.substring(0, 1)) + 1L);
            }
        }
        sc.close();
        long ans = 0;
        ans += h.get("M") * h.get("A") * h.get("R");
        ans += h.get("M") * h.get("A") * h.get("C");
        ans += h.get("M") * h.get("A") * h.get("H");
        ans += h.get("M") * h.get("R") * h.get("C");
        ans += h.get("M") * h.get("R") * h.get("H");
        ans += h.get("M") * h.get("C") * h.get("H");
        ans += h.get("A") * h.get("R") * h.get("C");
        ans += h.get("A") * h.get("R") * h.get("H");
        ans += h.get("A") * h.get("C") * h.get("H");
        ans += h.get("R") * h.get("C") * h.get("H");
        System.out.println(ans);
    }
}