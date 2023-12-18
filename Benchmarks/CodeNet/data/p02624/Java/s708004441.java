import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long result = 0;

        for(int K=1; K<=N; K++) {
            // 平方根を保存
            int s = (int) Math.sqrt(K) + 100;
            int n = K;

            long divisorCount = 1;

            // 2から平方根までの素因数を求める
            for (int i=2; i<=s; i++) {
                int r = 0;
                if ((n % i) == 0) {
                    r = 0; // 指数カウンタクリア
                    do {
                        r++; // 指数カウンタプラス
                        n = n / i;
                    } while ((n % i) == 0);

                    divisorCount *= r+1;
                }
            }

            if (n > s) {
                divisorCount *= 2;
            }

            System.err.println(K + ":" + divisorCount);
            result += divisorCount * K;
        }

        System.out.println(result);
    }
}