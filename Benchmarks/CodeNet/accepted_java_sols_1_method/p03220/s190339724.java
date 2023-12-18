import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), T = sc.nextInt(), A = sc.nextInt();
        int ans = 0;
        double min = 1e9;
        for (int n = 0; n < N; n++) {
            int h = sc.nextInt();
            double t = (double)T - (double)h * 0.006;
            double f = Math.abs(A - t);
            if (min > f) { min = f; ans = n + 1; }
        }
        sc.close();
        System.out.println(ans);
    }
}