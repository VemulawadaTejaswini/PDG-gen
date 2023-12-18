import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (n == 0 && k == 0) break;

            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(sc.next());

            int[] s = new int[n + 1];
            s[0] = 0;
            for (int i = 0; i < n; i++) s[i+1] = s[i] + a[i];

            long ans = Long.MIN_VALUE;
            for (int i = 0; i <= n-k; i++) {
                long val = s[i+k] - s[i];
                if (ans < val) ans = val;
            }

            System.out.println(ans);
        }
    }
}

