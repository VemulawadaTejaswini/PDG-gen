import java.util.*;

public class Main {
    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), ret = 0;

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                for (int h = 1; h <= k; h++) {
                    ret += gcd(i, gcd(j, h));
                }
            }
        }

        System.out.println(ret);
    }

    private static int gcd(int n, int m) {
        int r;
        while (n > 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}