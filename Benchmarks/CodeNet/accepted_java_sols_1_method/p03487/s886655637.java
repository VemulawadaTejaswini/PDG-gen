import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            
            if( map.containsKey(x) ) {
                int v = map.get(x);
                map.put(x, v+1 );
            } else {
                map.put(x, 1);
            }
        }
        
        long ans = 0;
        for (Entry<Integer, Integer> entry : map.entrySet() ) {
            int key = entry.getKey();
            int value = entry.getValue();
            
            if( key > value ) {
                ans += value;
            } else {
                ans += value - key;
            }
        }

        System.out.println(ans);
    }
}
