import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer k = sc.nextInt();
        double ans = 0;
        for (int i =1;i<=n;i++) {
            int tmp = i;
            int p = 0;
            while (tmp < k) {
                tmp *= 2;
                p++;
            }
            double sum = Math.pow(0.5, p) / n ;
            ans += sum;
        }
        System.out.println(ans);
    }
}