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

        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            b[n - i - 1] = in.nextInt();
        }

        int x = -1;
        int idx = -1;
        for (int i = 0; i < n; ++i) {
            if (a[i] == b[i]) {
                idx = i;
                x = a[i];
            }
        }

        int i = 0;
        while (i < n) {
            if (idx != -1 && idx < n && a[i] != x && b[i] != x && b[idx] == x) {
                int temp = b[i];
                b[i] = x;
                b[idx++] = temp;
            } 
            ++i;
        }

        for (i = 0; i < n; ++i) {
            if (a[i] == b[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        for (i = 0; i < n; ++i) {
            System.out.print(b[i] + " ");
        }
    }
}