

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int lower = Math.max(a, Math.max(b, c));
            int ans = Integer.MAX_VALUE;

            for (int n = lower; n <= 100; n++) {
                for (int ia = a; ia <= n; ia += 2) {
                    for (int ib = b; ib <= n; ib += 2) {
                        for (int ic = c; ic <= n; ic += 2) {
                            int x[] = {n - ia, n - ib, n - ic};
                            Arrays.sort(x);
                            if ( x[2] - x[0] == x[1] ) {
                                int cnt = (ia - a) / 2 + (ib - b) / 2 + (ic - c) / 2;
                                cnt += (x[0] + x[1] + x[2]) / 2;
                                ans = Math.min(ans, cnt);
                            }
                        }
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
