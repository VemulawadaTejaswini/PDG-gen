
import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            double p = 0;
            double x = 0;
            double score = i;
            while (score < k) {
                score *= 2;
                x++;
            }
            double d = 1.0 / n;
            p = d * Math.pow(0.5, x);
            ans += p;
        }
        System.out.println(ans);
    }
}