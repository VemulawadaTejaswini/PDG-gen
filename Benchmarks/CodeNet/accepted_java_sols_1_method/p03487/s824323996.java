import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            int key = sc.nextInt();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key, 1);
            }
        }
        long ans = 0;
        for(Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(key < value) {
                ans += value - key;
            } else if(key > value) {
                ans += value;
            }
        }
        System.out.println(ans);
    }
}