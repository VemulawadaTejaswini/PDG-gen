import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[200000];
        for (int i = 1; i < 200000; i++) {
            a[i] = i + a[i-1];
        }
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        int[] s = new int[n];
        int t = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            t += s[i];
            p[i] = t;
        }
        int max = p[k-1];
        int idx = 0;
        for (int i = k; i < n; i++) {
            int tmp = p[i] - p[i - k];
            if(max < tmp){
                max = tmp;
                idx = i -(k-1);
            }
        }
        double ans = 0.0;
        for (int i = idx; i < idx+k; i++) {
            ans += (double)a[s[i]] / s[i];
        }
        System.out.println(ans);
        sc.close();

    }

}
