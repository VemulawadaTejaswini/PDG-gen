import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt(); y[i] = sc.nextInt(); h[i] = sc.nextInt();
        }
        for (int cx = 0; cx <= 100; cx++) for (int cy = 0; cy <= 100; cy++) {
            int l = 0, r = 1000001000;
            while (r - l > 1) {
                int c = (l + r) / 2;
                int judge = 0;
                for (int i = 0; i < n; i++) {
                    int hgt = Math.max(c - Math.abs(x[i] - cx) - Math.abs(y[i] - cy), 0);
                    if (h[i] > hgt) judge = -1;
                    if (h[i] < hgt) judge = 1;
                    if (judge != 0) break;
                }
                if (judge == 0) {
                    System.out.println(cx + " " + cy + " " + c);
                    return;
                }
                if (judge == 1) r = c;
                if (judge == -1) l = c;
            }
        }
    }
}