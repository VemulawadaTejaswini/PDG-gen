import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            if (map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            } else {
                map.put(key, 1);
            }
        }
        int ans = 0;
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (value == 0) continue;
            if (value > key) {
                ans += value - key;
            } else if(value < key) {
                ans += value;
            }
        }
        System.out.println(ans);
    }
}
