import java.util.*;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int gcd = a[0];
        for(int i=1; i<n; i++) {
            gcd = gcd(gcd, a[i]);
        }
        boolean setwise = gcd == 1;

        if(!setwise) {
            System.out.println("not coprime");
            return;
        }

        int[] div = new int[1000001];
        for(int i=1; i<=1000000; i++) {
            div[i] = i;
        }
        for(int i=2; i<=1000; i++) {
            if(div[i] != i) continue;
            for(int j=2; i*j<=1000000; j++) {
                div[i*j] = i;
            }
        }

        boolean pc = true;

        boolean[] used = new boolean[1000001];
        OUTER: for(int i=0; i<n; i++) {
            while(a[i] > 1) {
                int d = div[a[i]];
                if(used[d]) {
                    pc = false;
                    break OUTER;
                }
                while(a[i] % d == 0) {
                    a[i] /= d;
                }
                used[d] = true;
            }
        }


        if(pc) {
            System.out.println("pairwise coprime");
        } else {
            System.out.println("setwise coprime");

        }


    }
    static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

}