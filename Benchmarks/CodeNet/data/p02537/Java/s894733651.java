import java.util.*;

public class Main {

    private static int[] dat;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int a = 1;
        while (a < 300000) {
            a *= 2;
        }
        dat = new int[2*a];

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int l = Math.max(A-K,0);
            int r = A+K+1;
            int max = query(l,r,0,0,a);
            update(A, max+1, a);
        }

        System.out.println(dat[0]);
    }

    private static void update(int i, int x, int n) {
        i += n-1;
        dat[i] = x;
        while (i > 0) {
            i = (i-1)/2;
            dat[i] = Math.max(dat[i*2+1], dat[i*2+2]);
        }
    }

    private static int query(int a, int b, int k, int l, int r) {
        if (r <= a || b <= l) return 0;
        if (a <= l && r <= b) return dat[k];

        int vl = query(a, b, k*2+1, l, (l+r)/2);
        int vr = query(a, b, k*2+2, (l+r)/2, r);

        return Math.max(vl, vr);
    }
}
