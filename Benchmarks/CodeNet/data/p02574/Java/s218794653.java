import java.util.*;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
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

        boolean[] isnp = new boolean[1001];
        for(int i=2; i<=100; i++) {
            if(isnp[i]) continue;
            for(int j=2; i*j<=1000; j++) {
                isnp[i*j] = true;
            }
        }
        boolean[] used = new boolean[1000001];

        boolean pc = true;
        Set<Integer> p1000 = new HashSet<>();
        for(int i=2; i<=1000; i++) {
            if(!isnp[i]) {
                p1000.add(i);
            }
        }
        for(int i=0; i<n; i++) {
            if(used[a[i]]) {
                pc = false;
                break;
            }
            Set<Integer> rem = new HashSet<>();
            for(int div : p1000) {
                if(a[i] % div == 0) {
                    rem.add(div);
                    while(b[i] % div == 0) {
                        b[i]/=div;
                    }
                }
            }
            for(int div : rem) {
                for(int j = 1; j*div<=1000000; j++) {
                    used[div] = true;
                }
                p1000.remove(div);
            }
            if(b[i]>1000 && used[b[i]]) {
                pc = false;
                break;
            }
            used[b[i]] = true;
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