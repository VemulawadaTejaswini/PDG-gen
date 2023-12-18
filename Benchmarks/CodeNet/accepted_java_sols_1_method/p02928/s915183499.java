import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();
        }

        long [] b = new long[n];
        for (int i = 0 ; i < n ; i++) {
            int count = 0;
            for (int j = i + 1 ; j < n ; j++) {
                if (a[i] > a[j]) count++;
            }
            b[i] = count;
        }

        long [] c = new long[n];
        for (int i = 0 ; i < n ; i++) {
            int count = 0;
            for (int j = 0 ; j < n ; j++) {
                if (a[i] > a[j]) {
                    count++;
                }
            }
            c[i] = count;
        }
        long ans = 0;
        long mod = 1000000007 ;
        long e = 0;
        for (int i = 0 ; i < n ; i++) {
            e += c[i] % mod;
        }
        long z = k * (k - 1) / 2;
        z %= mod;
        ans += e * z % mod;
        long d = 0;
        for (int i = 0 ; i < n ; i++) {
            d += b[i] % mod;
        }
        long y = d * k % mod;
        ans += y % mod;

        System.out.println(ans % mod);


    }

}