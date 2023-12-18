import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for(int i = 0; i < m; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            while(!map.isEmpty()) {
                Map.Entry<Integer, Integer> entry = map.firstEntry();
                int minKey = entry.getKey();
                if(minKey >= c) break;
                int minvalueCount = entry.getValue();
                if(b < minvalueCount) {
                    map.put(entry.getKey(), minvalueCount - b);
                    map.put(c, map.getOrDefault(c, 0) + b);
                    break;
                }
                if(b == minvalueCount) {
                    map.remove(entry.getKey());
                    map.put(c, map.getOrDefault(c, 0) + b);
                    break;
                }
                map.remove(entry.getKey());
                map.put(c, map.getOrDefault(c, 0) + minvalueCount);
                b -= minvalueCount;
            }
        }
        long sum = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            long key = entry.getKey();
            long value = entry.getValue();
            sum += (key * value);
        }
        System.out.println(sum);
    }
}

