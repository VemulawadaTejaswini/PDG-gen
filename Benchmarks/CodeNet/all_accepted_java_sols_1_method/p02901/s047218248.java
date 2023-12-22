import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        // 解説youtube後
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // キー集合のID、バリュー鍵の値段
        Map<Integer, Integer> keyInfo = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int price = sc.nextInt();
            int keyNum = sc.nextInt();
            int keyInfoID = 0;
            for (int j = 0; j < keyNum; j++) {
                int openNo = sc.nextInt();
                openNo--; // 1-indexed;
                keyInfoID |= 1 << openNo;
            }

            // 集合が被った場合はコストが安い方を採用する
            if (price < keyInfo.getOrDefault(keyInfoID, Integer.MAX_VALUE)) {
                keyInfo.put(keyInfoID, price);
            }
        }

        // DP用意と初期化
        int[] dp = new int[1 << n]; // 2^n;
        int AMAX = 1001001001;
        for (int i = 0; i < dp.length; i++) {
            dp[i] = AMAX;
        }
        dp[0] = 0;

        for (int s = 0; s < 1 << n; s++) {
            for (Entry<Integer, Integer> ent : keyInfo.entrySet()) {
                int t = s | ent.getKey();
                int cost = dp[s] + ent.getValue();
                dp[t] = Math.min(cost, dp[t]);
            }
        }

        // 組み合わせが存在しない場合は-1
        int ans = dp[dp.length - 1];
        if (ans == AMAX) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
