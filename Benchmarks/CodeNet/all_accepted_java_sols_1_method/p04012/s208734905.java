import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < w.length(); i++) {
            String key = w.substring(i, i + 1);
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key, 1);
            }
        }
        for(Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 != 0) {
               System.out.println("No");
               return;
            }
        }
        System.out.println("Yes");
    }
}