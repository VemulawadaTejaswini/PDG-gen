import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        Map<Integer,Long> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            int key = sc.nextInt();
            long value = sc.nextInt();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            }else {
                map.put(key, value);
            }
        }
        long sum = k;
        for(Entry<Integer, Long> entry : map.entrySet()) {
            long tmp = entry.getValue();
            if(sum > tmp) {
                sum -= tmp;
            } else {
                System.out.println(entry.getKey());
                return;
            }
        }
    }
}