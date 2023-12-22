import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();
        double k = sc.nextInt();

        double ans = 0;

        for (double i = 1; i <= n; i++) {
            double kakuritu = 1;
            double point = i;

            while (point < k) {
                point *= 2;
                kakuritu *= 0.5;
            }

            ans += 1 / n * kakuritu;
        }

        System.out.println(ans);
    }
}