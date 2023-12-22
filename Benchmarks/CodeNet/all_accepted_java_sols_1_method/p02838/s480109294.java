import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long res = 0;
        long base = 1;
        long mod = 1000000007;
        for(int j=0; j<61; j++) {
            int c1 = 0;
            int c0 = 0;
            for(int i=0; i<n; i++) {
                if((a[i] >> j) % 2 == 1) {
                    c1++;
                } else {
                    c0++;
                }
            }
            if(c1 == 0 || c0 == 0) {
                base *= 2;
                base %= mod;
                continue;
            }
            long add = base;
            add *= c1;
            add %= mod;
            add *= c0;
            add %= mod;
            res += add;
            res %= mod;
            base *= 2;
            base %= mod;
        }
        System.out.println(res);
    }
}
