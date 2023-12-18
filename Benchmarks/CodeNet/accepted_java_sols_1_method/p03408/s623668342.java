import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            } else {
                map.put(tmp, 1);
            }
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String tmp = sc.next();
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) - 1);
            }
        }
        int max = 0;
        for (Integer num : map.values()) {
            max = Math.max(max,num);
        }
        System.out.println(max);
    }    
}
