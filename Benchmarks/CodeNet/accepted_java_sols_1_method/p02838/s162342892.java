import java.util.*;

class Main {
    static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long l[] = new long[n];
        for (int i=0; i<n; i++) {
            l[i] = sc.nextLong();
        }

        int ones[] = new int[60];
 
        for (int i=0; i<n; i++) {
            long x = l[i];
            for (int j=0; j<60; j++) {
                if (((x>>j)&1)==1) {
                    ones[j] ++;
                }
            }
        }
        long ans = 0;
        long base = 1;
        for (int j=0; j<60; j++) {
            long tmp = (long) (n-ones[j])*ones[j] % mod;
            ans += tmp * base % mod;
            ans %= mod;
            base *= 2;
            base %= mod;
        }
        System.out.println(ans);
        sc.close();
    }
}