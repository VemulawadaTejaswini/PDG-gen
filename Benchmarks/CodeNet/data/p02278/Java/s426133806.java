import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static final int MAX = 1000;
    static final int VMAX = 10000;

    public static void main(String[] args) throws Exception {
        // 入力
        int n = 0;
        int[] A = new int[MAX];
        int min = VMAX;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            n = Integer.parseInt(br.readLine());
            String[] lines = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(lines[i]);
                min = Math.min(min, A[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 最小コストソート
        int ans = 0;
        boolean[] isProcessed = new boolean[MAX];
        int[] B = new int[MAX];
        System.arraycopy(A, 0, B, 0, n);
        // 与えられた数列が昇順でそれぞれ何番目かを
        // バケット法で調べる
        Arrays.sort(B, 0, n);
        int[] order = new int[VMAX + 1];
        for (int i = 0; i < n; i++) {
            order[B[i]] = i;
        }

        for (int i = 0; i < n; i++) {
            // 真ならばサイクルで計算済みなので飛ばす
            if (isProcessed[i]) {
                continue;
            }

            int cur = i;
            // サイクル内の合計
            int cycleSum = 0;
            // サイクル内の最小値
            int cycleMin = VMAX;
            // サイクルに含まれた数
            int cycleN = 0;
            // サイクルを一周するまで
            while (true) {
                isProcessed[cur] = true;
                cycleN++;
                int v = A[cur];
                cycleMin = Math.min(cycleMin, v);
                cycleSum += v;// ΣWiの部分
                cur = order[v];// ソート前の数列Aの値の移動先の添字
                if (isProcessed[cur]) {
                    // サイクルを一周したのでループを抜ける
                    break;
                }
            }
            ans += Math.min(cycleSum + (cycleN - 2) * cycleMin, cycleSum + cycleMin + (cycleN + 1) * min);
        }

        // 出力
        System.out.println(ans);
    }
}

