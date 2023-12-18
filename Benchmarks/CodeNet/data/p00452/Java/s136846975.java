import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if ((n | m) == 0)
                break;
            int[] ds = new int[n + 1];
            ds[0] = 0;
            for (int i = 1; i <= n; i++) {
                ds[i] = sc.nextInt();
            }
            int[] qs = new int[(n + 1) * n / 2 + n + 1];
            int k = 0;
            for (int i = 0; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    qs[k++] = ds[i] + ds[j];
                }
            }
            Arrays.sort(qs);
            int max = 0;
            for (int i = 0; i < qs.length; i++) {
                int lb = 0;
                int ub = qs.length - 1;
                while (ub - lb > 1) {
                    int mid = (lb + ub) / 2;
                    if (qs[i] + qs[mid] <= m) {
                        lb = mid;
                    } else {
                        ub = mid;
                    }
                }
                if (qs[i] + qs[lb] <= m)
                    max = Math.max(max, qs[i] + qs[lb]);
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}