import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 1000000007;
        long sum = 0;
        long[] a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
            sum += a[i] % mod;
        }

        long ans = 0;
        for(int i=0; i<n; i++) {
            sum -= a[i];
            if(sum < 0) sum += mod;
            ans += sum * a[i];
        }

        System.out.println(ans%mod);
    }
}
