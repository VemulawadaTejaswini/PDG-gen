import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 入力
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
        }

        long ans = 0;
        int all = 1<<n;
        // 00...01（n桁） から 11...11（n桁） までループ(bit全探索)
        for (int mask = 1; mask < all; mask++) {
            boolean ok = true;
            for (int i = 0; i < n && ok; i++) {
                // 各ビットでループ
                if (((mask>>i) & 0x1) == 1) {
                    for (int j = i+1; j < n && ok; j++) {
                        if (((mask>>j) & 0x1) == 1) {
                            double temp = a[i] * a[j] + b[i] * b[j];
                            if (temp == 0) {
                                // 仲が悪い
                                ok = false;
                            }
                        }
                    }
                }
            }
            if (ok) {
                ans++;
            }
        }

        // 出力
        System.out.println(ans % 1000000007);
    }
}
