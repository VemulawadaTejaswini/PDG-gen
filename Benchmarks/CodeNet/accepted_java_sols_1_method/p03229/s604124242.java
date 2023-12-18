import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long ans = 0;
        if(n%2 == 0){
            int[] b = new int[n];
            b[0] = -1;
            b[n-1] = 1;
            for(int i = 1; i < n-1; i++){
                if(i%2 == 1){
                    b[i] = 2;
                }else{
                    b[i] = -2;
                }
            }
            Arrays.sort(b);
            for(int i = 0; i < n; i++){
                ans += a[i] * b[i];
            }
        }else{
            int[] c = new int[n];
            int[] d = new int[n];
            c[0] = -1;
            c[n-1] = -1;
            d[0] = 1;
            d[n-1] = 1;
            for(int i = 1; i < n-1; i++){
                if(i%2 == 1){
                    c[i] = 2;
                    d[i] = -2;
                }else{
                    c[i] = -2;
                    d[i] = 2;
                }
            }
            Arrays.sort(c);
            Arrays.sort(d);
            long ans1 = 0;
            long ans2 = 0;
            for(int i = 0; i < n; i++){
                ans1 += a[i] * c[i];
                ans2 += a[i] * d[i];
            }
            ans = Math.max(ans1, ans2);
        }
        System.out.println(ans);
    }
}
