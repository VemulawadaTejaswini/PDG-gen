import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long ans = 0;
        for(int i = 0; i < n-1; i++) {
            long diff = a[i] + a[i+1] - x;
            if(diff <= 0) continue;
            ans += diff;
            if(a[i+1] >= diff) {
                a[i+1] -= diff;
            } else {
                diff -= a[i+1];
                a[i+1] = 0;
                a[i] -= diff;
            }
        }
        System.out.println(ans);
    }
}
