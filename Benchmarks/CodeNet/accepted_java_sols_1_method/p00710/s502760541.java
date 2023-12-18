import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを読み込む準備
        Scanner sc = new Scanner(System.in);
        int n, r, i, j;
        while ((n = sc.nextInt()) != 0 && (r = sc.nextInt()) != 0) {
            int data[] = new int[n];
            // 最初に一番下を1番として順にn番まで の札が積み上げられた山を仮定して，山を混ぜて切り終わったときから
            for (i = 0; i < n; i++) {
                data[i] = n - i;
            }
            for (i = 0; i < r; i++) {// r回値の確保
                int p = sc.nextInt();
                int c = sc.nextInt();
                // (３つに分割)配列ごと変数にしてる

                int subData[] = new int[n];
                for (j = 0; j < c; j++) {
                    subData[j] = data[p + j - 1];// 新しいのを定義しc個入れる
                }
                for (j = 0; j < p - 1; j++) {
                    subData[c + j] = data[j];// p-1まで入れる
                }
                for (j = 0; j < n + 1 - p - c; j++) {
                    subData[c + p - 1 + j] = data[c + p - 1 + j];
                }
                for (j = 0; j < n; j++) {// 代入
                    data[j] = subData[j];
                }
            }
            System.out.println(data[0]);

        }

    }
}

