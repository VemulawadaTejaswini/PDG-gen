import java.util.*;
import java.math.*;

public class Main {

    static long MOD = 1000000007;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = i + l;
        }
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += a[i];
        }
        int dif = 324092384;
        int ans = sum * 2;
        for(int i = 0; i < n; i++) {
            if(Math.abs(a[i]) < dif) {
                dif = Math.abs(a[i]);
                ans = sum - a[i];
            }
        }
        System.out.println(ans);
    }
}