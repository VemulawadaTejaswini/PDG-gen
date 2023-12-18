import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            if(map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1l);
            }
        }
        long ans = 0l;
        for(Entry<Long, Long> entry : map.entrySet()) {
            if(entry.getKey() > entry.getValue()) {
                ans += entry.getValue();
            } else {
                ans += entry.getValue() - entry.getKey();
            }
        }
        System.out.println(ans);
    }
}