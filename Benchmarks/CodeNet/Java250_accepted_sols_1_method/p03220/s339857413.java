import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) h[i] = sc.nextInt();
        int p = 0;
        double dmin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            double d = Math.abs(a - (t - h[i] * 0.006));
            if (dmin > d) {
                dmin = d;
                p = i + 1;
            }
        }
        System.out.println(p);
    }
}