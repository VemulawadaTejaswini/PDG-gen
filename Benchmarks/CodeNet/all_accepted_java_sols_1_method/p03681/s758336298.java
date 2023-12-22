import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long mod = 1000000007;
        if (n == m) {
            //n!m! x2
            long ans = 2;
            while (n > 0) {
                ans = (ans % mod) * (n % mod) % mod;
                n--;
            }
            while (m > 0) {
                ans = (ans % mod) * (m % mod) % mod;
                m--;
            }
            System.out.println(ans);
        } else if (Math.abs(n - m) == 1) {
            //n!m!
            long ans = 1;
            while (n > 0) {
                ans = (ans % mod) * (n % mod) % mod;
                n--;
            }
            while (m > 0) {
                ans = (ans % mod) * (m % mod) % mod;
                m--;
            }
            System.out.println(ans);
        } else {
            System.out.println(0);
        }

    }

}