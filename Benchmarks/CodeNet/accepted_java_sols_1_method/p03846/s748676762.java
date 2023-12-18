

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long MOD = 1000000007;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] cnt = new int[1000002];

            for (int i = 0; i < n; i++) {
                cnt[sc.nextInt()]++;
            }

            if (n % 2 == 1 && cnt[0] != 1) {
                System.out.println("0");
                continue;
            }

            int start = (n % 2 == 0) ? 1 : 2;
            long ans = 1;

            for (int i = start; i < n; i += 2) {
                if (cnt[i] != 2) {
                    ans = 0;
                    break;
                }
                ans *= 2;
                ans %= MOD;
            }

            System.out.println(ans);
        }
    }
}
