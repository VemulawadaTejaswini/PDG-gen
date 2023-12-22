

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int cnt[] = new int[100002];
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                cnt[a]++;
            }

            int ans = 0;
            int evenCnt = 0;
            for (int i = 0; i <= 100000; i++) {
                if ( cnt[i] == 0 )
                    continue;
                if ( cnt[i] % 2 == 1 ) {
                    ans++;
                } else {
                    evenCnt++;
                }
            }

            if ( evenCnt > 0 ) {
                if ( evenCnt % 2 == 0 ) {
                    ans += evenCnt;
                } else {
                    ans += evenCnt - 1;
                }
            }
            System.out.println(ans);
        }
    }
}
