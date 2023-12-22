import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        // 全体数 - (B以下でCまたはDで割り切れるものの個数 - A-1以下でCまたはDで割り切れるものの個数)
        long ans = (B - A + 1) -
                ((B/C + B/D - B/(C*D/gcd(C, D))) - ((A-1)/C + (A-1)/D - (A-1)/(C*D/gcd(C, D))));
    System.out.print(ans);
    }


    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}
