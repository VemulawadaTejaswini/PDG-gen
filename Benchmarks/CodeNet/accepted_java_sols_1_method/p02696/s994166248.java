import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        
        // for (int i = 0; i <= 100; i++) {
        //     long center = i;
        //     long tmp = (long)Math.floor(a * center / b) - a * (long)Math.floor(center/b);
        //     // if (i != 4) continue;
        //     System.out.println(tmp);
        // }
        
        long x = 0;
        if (b > n+1) {
            x = b - 1 -(b-n-1);
        } else {
            x = b-1;
        }
        long tmp = a * x / b - a * (x / b);
        System.out.println(tmp);
        // System.out.println(x);
        // System.out.println((long)Math.floor(a * x / b));
        
        // 条件を満たす最小の値(最大が知りたい場合if(ok)のブロックを反転する)
        // long left = 0;
        // long right = 1000000000000l;
        
        // long ans = 0;
        // while (left < right) {
        //     long center = (left + right) / 2;
            
        //     boolean ok = true;
            
        //     // okがどうかの判定
        //     long tmp = Math.floor(a * center / b) - a * Math.floor(center/b);
            
        //     ans = Math.max(ans, tmp);
        //     if ()
            
        //     if (ok) {
        //         right = center;
        //     } else {
        //         left = center + 1;
        //     }
        // }
        
        // System.out.println(left);
    
    }
}
