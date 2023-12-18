import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        double ans = 0.0;
        for (int i = 1; i < n + 1; i++) {
            double p = 1;
            double a = i;
            while (a < k) {
                p *= 0.5;
                a *= 2;
            }
            ans += p/n;
        }
        System.out.println(ans);
    }
}