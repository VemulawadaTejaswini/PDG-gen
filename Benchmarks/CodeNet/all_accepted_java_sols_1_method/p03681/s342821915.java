import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long mod = 1000000007L;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        long res1 = n, res2 = m;
        for(int i = 1; i < n; i++) {
            res1 *= i;
            res1 %= mod;
        }
        for(int i = 1; i < m; i++) {
            res2 *= i ;
            res2 %= mod;
        }
        long res = (res1 * res2 * (n == m ? 2 : 1)) % mod;
        if(Math.abs(n - m) > 1) res = 0;
        System.out.println(res);
    }
}
