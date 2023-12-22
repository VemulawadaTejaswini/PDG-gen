import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        for (int i = 0; i < n; i++) c[i] = sc.nextInt();
        long ans = 0L;
        Arrays.sort(a);
        Arrays.sort(c);
        for (int i = 0; i < n; i++) {
            int ok1 = -1;
            int ng1 = n;
            while(1 < ng1 - ok1){
                int m = (ok1+ng1)/2;
                if(a[m] < b[i]) ok1 = m;
                else ng1 = m;
            }
            int ok2 = n;
            int ng2 = -1;
            while(1 < ok2-ng2){
                int m = (ok2+ng2)/2;
                if(b[i] < c[m]) ok2 = m;
                else ng2 = m;
            }
            ans += (long)ng1 * (n-ok2);
        }
        System.out.println(ans);
        sc.close();

    }

}
