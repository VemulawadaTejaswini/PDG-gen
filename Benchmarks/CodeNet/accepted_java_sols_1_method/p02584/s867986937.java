import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long now = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();
        
        long ans = 0;
        
        // 10 5 8
        // 2回行くことになる。 now = -6
        // 残り3回はプラスマイナスを往復 2,-6,2 ans = 2;
        long needcount = (Math.abs(now) + d+1) / d;
        // System.out.println(needcount);
        
        if (needcount > k) {
            if (now < 0) {
                ans = now + k * d;
                // System.out.println(ans);
            } else {
                ans = now - k * d;
                // System.out.println(ans);
            }
        } else {
            long leftcount = k - needcount;
            if (now < 0) {
                now = now + needcount * d;
            } else {
                now = now - needcount * d;
            }
            // System.out.println(now);
            
            if (leftcount % 2 == 1) {
                if (now < 0) {
                    now += d;
                } else {
                    now -= d;
                }
            }
            
            ans = now;
            // System.out.println(now);
        }
        // if (Math.abs(now) > Math.abs(k * d))
        System.out.println(Math.abs(ans));
    }
}
