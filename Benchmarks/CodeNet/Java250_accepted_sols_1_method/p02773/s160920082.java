import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        TreeMap<String, Integer> map = new TreeMap<>();
        int max = 0;
        for(int i = 0; i < N; i++) {
            String key = sc.next();
            if(map.containsKey(key)) {
                int val = map.get(key);
                map.put(key, ++val);
            } else {
                map.put(key, 1);
            }
            int val = map.get(key);
            max = Math.max(val, max);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            String key = entry.getKey();
            if(val == max) System.out.println(key);
        }
    }
}
