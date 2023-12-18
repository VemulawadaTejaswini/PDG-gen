import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Integer.parseInt(sc.next());
        Map<String, Integer> map = new HashMap<>();
        long ans = 0;
        
        for(int i = 0; i < N; i++) {
            String s = sc.next();
            if(map.containsKey(s)) {
                continue;
            }else {
                map.put(s, 1);
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}