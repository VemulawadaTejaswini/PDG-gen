import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int s = sc.nextInt();
                s--;
                a[s] |= 1<<i;
            }
        }
        int p = 0;
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            p |= x<<i;
        }
        int ans = 0;
        for (int s = 0; s < (1<<n); s++) {
            int t = 0;
            for (int i = 0; i < n; i++) {
                if ((s>>i & 1) != 0) {
                    t ^= a[i];
                }
            }
            if (t == p) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}