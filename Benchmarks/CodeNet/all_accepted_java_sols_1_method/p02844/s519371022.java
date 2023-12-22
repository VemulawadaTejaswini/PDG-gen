import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Lucky PIN Mitsui 2019 D
        // S から N−3 桁を消して残りの 3 桁を左から読んだものを暗証番号として設定することにしました
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        int ans = 0;
        // Sの持つ数値について左から3桁、1桁ずつ検証する.
        for (int i = 0; i <= 9; i++) {
            // char + int ex. '0' + 0 = 48, '0' + 1 = 49, '0' + 2 = 50
            // indexOf(48, 0) は 48 = 文字列char'0' を検証する
            int p1 = S.indexOf('0' + i, 0);
            // p1 は i([0-9])のある桁数(index番号)
            if (p1 == -1) {
                // もし整数iがSに含まれていなければ、検証する必要がないので
                // continueする
                continue;
            }
            for (int j = 0; j <= 9; j++) {
                // 左から順番にだから p1(index番号) + 1
                int p2 = S.indexOf('0' + j, p1 + 1);
                if (p2 == -1) {
                    continue;
                }
                for (int k = 0; k <= 9; k++) {
                    // 左から順番にだから p2(index番号) + 1
                    int p3 = S.indexOf('0' + k, p2 + 1);
                    if (p3 == -1) {
                        continue;
                    }
                    // ここまで検証できれば、3桁の暗証番号が成立することがわかる
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}