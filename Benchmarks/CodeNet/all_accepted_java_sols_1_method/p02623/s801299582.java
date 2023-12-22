import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n+1];
        long[] b = new long[m+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
            a[i] += a[i-1];
        }
        for (int i = 1; i <= m; i++) {
            b[i] = sc.nextLong();
            b[i] += b[i-1];
        }
        int l = 0;
        int r = n+m+1;
        while(1 < r - l){
            int mid = (l + r) / 2;
            boolean able = false;
            for (int i = Math.max(0, mid-m); i <= n; i++) {
                int bi = Math.max(0, mid - i);
                if(a[i] + b[bi] <= k){
                    able = true;
                    break;
                }
            }
            if(able) l = mid;
            else r = mid;
        }
        System.out.println(l);
        sc.close();

    }

}
