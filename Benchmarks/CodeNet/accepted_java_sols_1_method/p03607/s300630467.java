import java.util.*;

public class Main {
    static int n;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (map.containsKey(num)) {
                if (map.get(num) == 0) {
                    map.put(num, 1);
                } else {
                    map.put(num, 0);
                }
            } else {
                map.put(num, 1);
            }
        }
        int ans = 0;
        for(Integer i : map.keySet()) {
            if (map.get(i) == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
