import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
    private static final long MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] cnt = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            cnt[a[i]]++;
        }
        for (int i = 0; i < n; ++i) {
            b[i] = in.nextInt();
            cnt[b[i]]++;
        }
        for (int i = 0; i <= n; ++i) {
            if (cnt[i] > n) {
                System.out.println("No");
                return;
            }
        } 
        Arrays.sort(a);
        Arrays.sort(b); 
        int[] c = new int[n];
        Arrays.fill(c, -1);
        int j = 0;
        for (int i = 0; i < n; ++i) {
            while (true) {
                if (a[j] != b[i] && c[j] == -1) {
                    c[j] = b[i];
                    j = (j + 1) % n;
                    break;
                }
                j = (j + 1) % n;
            }
        }
        // for (int i = 0; i < n; ++i) {
        //     System.out.print(c[i] + " ");
        // }
        for (int i = 0; i < n; ++i) {
            if (c[i] == a[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        for (int i = 0; i < n; ++i) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}