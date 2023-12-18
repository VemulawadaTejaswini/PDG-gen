import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(map.containsKey(a)) {
                map.put(a, map.get(a) + b);
            }else {
                map.put(a, b);
            }
        }
        long ans = 0l;
        int count = 0;
        while(true) {
            Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
            for(Map.Entry<Integer, Integer> entry : entries) {
                int aa = entry.getKey();
                int bb = entry.getValue();
                for(int i = 0; i < bb; i++) {
                    if(count >= m) {
                        System.out.println(ans);
                        return;
                    }
                    ans += aa;
                    count++;
                }
            }
        }
    }
}