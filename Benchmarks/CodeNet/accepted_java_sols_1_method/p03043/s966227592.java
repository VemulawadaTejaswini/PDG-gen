import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        double ans = 0;
        for(long i = 1; i <= n; i++){
            long deno = n;
            if(i >= k){
                ans += 1d/deno;
            }else{
                long p = i;
                while(p < k){
                    deno *= 2;
                    p *= 2;
                }
                ans += 1d/deno;
            }
        }
        System.out.println(String.format("%.12f", ans));
    }
}

