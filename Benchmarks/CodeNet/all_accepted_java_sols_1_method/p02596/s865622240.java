import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        int now = 7;
        now %= k;
        Set<Integer> set = new HashSet<Integer>();
        int count = 1;
        
        int oldsize = 0;
        while (true) {
            if (now == 0) break;
            
            now *= 10;
            now += 7;
            now %= k;
            
            count++;
            
            set.add(now);
            if (oldsize == set.size()) {
                System.out.println(-1);
                return;
            }
            oldsize = set.size();
        }
        System.out.println(count);
    }
}
