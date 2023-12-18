import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map =new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int count = map.getOrDefault(a, 0);
            map.put(a, ++count);
        }
        
        long ans = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int key = e.getKey();
            int count = e.getValue();
            if (key > count) {
                ans += count;
            }
            if (key < count) {
                ans += count - key;
            }
        }
        System.out.println(ans);
    }
}
