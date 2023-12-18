import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
        }
        int g[] = new int[n];
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            if (g[a - 1] < h[b - 1])
                g[a - 1] = h[b - 1];
            if (g[b - 1] < h[a - 1])
                g[b - 1] = h[a - 1];
        }
        sc.close();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (h[i] > g[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}