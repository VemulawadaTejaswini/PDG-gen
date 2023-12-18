import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        int idx = 0;
        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                sum += p[i];
                max = sum;
                idx = i;
            } else {
                sum = sum - p[i - k] + p[i];
                if (max < sum) {
                    max = sum;
                    idx = i;
                }
            }
        }
        double ans = 0;
        for (int i = idx - k + 1; i < idx + 1; i++) {
            ans += (p[i] * (p[i] + 1) / 2.0) / p[i];
        }
        System.out.println(ans);
    }
}
