import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Long,Long> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            long val = sc.nextLong();
            long key = sc.nextLong();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + val);
            }else {
                map.put(key, val);
            }
        }
        long sum = 0;
        for(Entry<Long, Long> entry : map.entrySet()) {
            long time = entry.getKey();
            sum += entry.getValue();
            if(time < sum) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
