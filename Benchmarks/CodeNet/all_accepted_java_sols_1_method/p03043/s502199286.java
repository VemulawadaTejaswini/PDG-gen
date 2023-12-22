import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double ans = 0.0;
        for (int i = 1; i <= n; i++) {
            int sum = i;
            double tmp = 1.0 / (double)n;
            while(sum < k) {
                sum *= 2;
                tmp /= 2.0;
            }
            ans += tmp;
        }
        System.out.println(ans);
    }
}