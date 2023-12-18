import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        if(n == 1) {
            System.out.println(0);
            System.exit(0);
        }

        int cnt = 0;
        Map<Long, Integer> map = new HashMap<>();
        for(long i=2; i*i<=n; i++) {
            if(n % i != 0) {
                continue;
            }
            while(n % i == 0) {
                n /= i;
                cnt++;
            }
            map.put(i,cnt);
            cnt = 0;
        }
        if(n != 1) {
            map.put(n,1);
        }

        int ans = 0;
        for(long l: map.keySet()) {
            System.out.println(l + ": " + map.get(l) );
            if(map.get(l) == 1) {
                ans += 1;
            } else {
                ans += map.get(l)-1;
            }
        }
        System.out.println(ans);
    }
}
