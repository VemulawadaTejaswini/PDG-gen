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
        for (int i = 0; i < n; ++i) a[i] = in.nextInt();
        for (int i = 0; i < n; ++i) b[i] = in.nextInt();

        int[] c = new int[n];
        int[] vis = new int[n];
        Arrays.fill(c, -1);
        int j = 0;
        for (int i = 0; i < n; ++i) {
            while (true) {
                vis[j]++;
                if (vis[j] > 20) {
                    System.out.println("No");
                    return;
                }
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