import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ma = sc.nextInt();
        int mb = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        int suma = 0;
        int sumb = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            suma += a[i];
            sumb += b[i];
        }

        suma += 150;
        sumb += 150;
        // dp[i][j][k] := i個数目まで商品を使って(j,k)の品物を作るのに必要な最小値
        int dp[][][] = new int[n][suma][sumb];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < suma; j++) {
                for (int j2 = 0; j2 < sumb; j2++) {
                    // 大きい値で初期化しておく
                    dp[i][j][j2] = Integer.MAX_VALUE / 2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            // 一つの商品だけを使う場合
            dp[i][a[i]][b[i]] = c[i];
        }
        for (int i = 0; i < n; i++) {
            dp[i][0][0] = 0;
        }

        for (int i = 1; i < n; i++) {
            // i番目までの商品をを使う
            dp[i][a[i]][b[i]] = c[i];
            int aa = a[i];
            int bb = b[i];
            for (int j = 0; j < suma; j++) {

                for (int k = 0; k < sumb; k++) {
                    dp[i][j][k] = Math.min(dp[i][j][k], dp[i - 1][j][k]);
                    if (j - aa < 0) {
                        continue;
                    }
                    if (k - bb < 0) {
                        continue;
                    }
                    dp[i][j][k] = Math.min(dp[i][j][k], dp[i - 1][j - aa][k - bb] + c[i]);
                }
            }
        }
        int ans = Integer.MAX_VALUE / 2;
        int cnt = 1;
        while (true) {
            if (cnt * ma >= suma || cnt * mb >= sumb) {
                break;
            }
            ans = Math.min(ans, dp[n - 1][cnt * ma][cnt * mb]);
            cnt++;
        }
        if (ans == Integer.MAX_VALUE / 2) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
        sc.close();
    }
}
