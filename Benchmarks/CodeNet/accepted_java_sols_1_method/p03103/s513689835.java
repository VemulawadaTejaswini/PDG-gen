import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextInt();
        TreeMap<Long, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            long key = sc.nextLong();
            int val = sc.nextInt();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + val);
            }else {
                map.put(key, val);
            }
        }
        long ans = 0l;
        for(Entry<Long, Integer> entry : map.entrySet()) {
            long key = entry.getKey();
            int val = entry.getValue();
            if(m >= val) {
                ans += key * val;
                m = m - val;
            } else if(m < val) {
                ans += m * key;
                break;
            }
        }
        System.out.println(ans);
    }
}