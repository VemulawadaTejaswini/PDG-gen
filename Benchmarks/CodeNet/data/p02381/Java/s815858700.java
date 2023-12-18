import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            if(n == 0) break;
            double[] s = new double[n];
            double sum = 0.0;
            for(int i = 0; i < n; i++) {
                s[i] = sc.nextDouble();
                sum += s[i];
            }
            double ave = sum / (double)n;
            double ans = 0.0;
            for(int i = 0; i < n; i++) {
                ans += (s[i] - ave) * (s[i] - ave);
            }
            ans = Math.sqrt(ans/(double)n);
            System.out.printf("%.8f\n", ans);
        }
    }
}
