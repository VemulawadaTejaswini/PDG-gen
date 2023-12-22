
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] cs = new long[n];
        for (int i = 0; i < n; i++) {
            cs[i] = in.nextLong();
        }
        Arrays.sort(cs);
        long[] sum = new long[n];
        long[] r = new long[n];
        sum[0] = cs[0];
        r[0] = 1;
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + cs[i];
            if (sum[i - 1] * 2 >= cs[i]) {
                r[i] = r[i - 1] + 1;
            } else {
                r[i] = 1;
            }
        }
        System.out.println(r[n - 1]);
    }
}