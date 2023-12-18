
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i] = Math.min(b[Math.min(Math.max(i - 1, 0),n-2)], b[Math.min(Math.max(i, 0),n-2)]);
        }
        // a[n-2]=Math.min(b[n-2],b[n-3]);
        // a[n-1]=b[n-2];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i];
        }
        // System.out.println(Arrays.toString(b));
        // System.out.println(Arrays.toString(a));
        System.out.println(ans);
    }
}