import java.util.*;
import java.lang.*;


public class Main {
    static int a[];
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int q = sc.nextInt();
        int com[] = new int[q];
        int x[] = new int[q];
        int y[] = new int[q];
        for (int i = 0; i < q; i++) {
            com[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int m = 0;
        while (Math.pow(2, m) < n) {
            m++;
        }
        n = (int)Math.pow(2, m);
        a = new int[2 * n - 1];
        for (int i = 0; i < 2 * n - 1; i++) {
            a[i] = 2147483647;
        }

        for (int i = 0; i < q; i++) {
            if (com[i] == 0) {
                update(x[i], y[i]);
            } else {
                System.out.println(find(x[i], y[i] + 1, 0, n, 0));
            }
        }
    }
    static void update (int i, int x) {
        a[i + n - 1] = x;
        int k = i + n - 1;
        while (k > 0) {
            a[(k - 1) / 2] = Math.min(a[(k - 1) / 2 * 2 + 1], a[(k - 1) / 2 * 2 + 2]);
            k = (k - 1) / 2;
        }
    }
    static int find (int s, int t, int c, int d, int k) {
        if (t <= c || s >= d) {
            return 2147483647;
        }
        if (s <= c && t >= d) {
            return a[k];
        }
        int m = (c + d) / 2;
        return Math.min(find(s, t, c, m, 2 * k + 1), find(s, t, m, d, 2 * k + 2));
    }
}

