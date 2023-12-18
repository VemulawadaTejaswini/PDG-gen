import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum[] = new long[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + sc.nextLong();
        }
        long count = 0;
        Arrays.sort(sum);
        long tmp = sum[0];
        long tmpc = 1;
        for (int i = 1; i <= n; i++) {
            if (sum[i] == tmp) {
                tmpc++;
            } else {
                if (tmpc != 1) {
                    count += tmpc * (tmpc - 1) / 2;
                }
                tmp = sum[i];
                tmpc = 1;
            }
        }
        if (tmpc != 1) {
            count += tmpc * (tmpc - 1) / 2;
        }
        System.out.println(count);
    }
}
