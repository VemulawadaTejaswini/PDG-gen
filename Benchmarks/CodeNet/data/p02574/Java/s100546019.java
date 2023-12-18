import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    Set<Integer> set = new HashSet<>();
    boolean check = false;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<n; i++) a[i] = sc.nextInt();

        int gcd = a[0];

        for (int i=0; i<n; i++) {
            gcd = gcd(gcd, a[i]);
        }

        int[] smallPrime;
        smallPrime = sieve(1000001);

//        for (int i=0; i<100+1; i++) System.out.print(smallPrime[i] + " ");

        for (int i=0; i<n; i++) {
            factor(a[i], smallPrime);
        }

//        System.out.print(set);


        if (!check) {
            System.out.print("pairwise coprime");
            return;
        }


        if (gcd == 1) {
            System.out.print("setwise coprime");
            return;
        }

        System.out.print("not coprime");

    }

    int gcd(int c, int d) {
        if (c < d) return gcd(d, c);
        if (d == 0) return c;
        return gcd(d, c % d);
    }

    int[] sieve(int n) {
        int[] res = new int[n+1];
        for (int i=0; i<n+1; i++) res[i] = i;
        for (int i=2; i*i<n; i++) {
            if (res[i] < i) continue;
            for (int j=i*i; j<=n; j+=i) {
                if (res[j] == j) res[j] = i;
            }
        }
        return res;
    }

    void factor(int n, int[] min) {
        while (n > 1) {
            if (!set.add(min[n])) {
                check = true;
            }
            n /= min[n];
        }
    }


}

