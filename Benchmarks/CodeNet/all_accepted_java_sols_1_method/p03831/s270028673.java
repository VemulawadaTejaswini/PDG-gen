import java.util.*;
import java.lang.Math;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        long[] x = new long[n];
        long ans = 0L;
        for(int i = 0; i < n; ++i){
            x[i] = sc.nextLong();

            if(i == 0) continue;

            ans += Math.min(a * (x[i] - x[i - 1]), b);
        }

        System.out.println(ans);
    }
}