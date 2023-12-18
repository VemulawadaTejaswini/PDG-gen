import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力
        Scanner         sc = new Scanner(System.in);

        int             n;
        while ((n = Integer.parseInt(sc.next())) != 0) {
            double[]        S = new double[n];
            double          sum = 0;
            for (int i = 0; i < n; i++) {
                S[i] = Double.parseDouble(sc.next());
                sum += S[i];
            }

            // 平均点を求める
            double          ave = sum / (double) S.length;
            // 偏差の二乗の合計をデータの総数で割り、分散を求める
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (S[i] - ave) * (S[i] - ave);
            }
            double         sd = Math.sqrt(sum / (double) S.length);

            // 出力
            System.out.println(sd);
        }
        sc.close();
    }
}

