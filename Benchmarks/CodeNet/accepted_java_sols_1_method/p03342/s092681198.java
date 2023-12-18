import java.util.*;

public class Main {

    public static void main(String[] args) {
        final long INF = (long) 1e15;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        a[n] = 0;

        long ans = 0;
        int l = 0;
        int r = 0;
        int tmp = a[0];
        while(l < n){
            if((tmp&a[r+1]) == 0 && r < n-1){
                r++;
                tmp |= a[r];
            }else{
                ans += r-l+1;
                tmp ^= a[l];
                l++;
            }
        }

        System.out.println(ans);
    }
}
