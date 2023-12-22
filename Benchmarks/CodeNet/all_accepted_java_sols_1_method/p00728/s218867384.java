import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを読み込む準備
        Scanner sc = new Scanner(System.in);

        int n, s;
        while ((n = sc.nextInt()) != 0) {
            int max = 0, min = 1000, sum = 0;// 比較に寄り更新させる
            for (int i = 0; i < n; i++) {
                s = sc.nextInt(); // ここで全て+=にて代入す
                sum += s;
                if (s > max) {
                    max = s;
                }
                if (s < min) {
                    min = s;
                }
            }
            System.out.println((sum - max - min) / (n - 2));
        }
    }
}

// 最高点と最低点は除外する．(必ず2つのデータは除外)
// もし最高点をつけた審判が複数いた ら，そのうちのひとつだけを無視する
// 最低点についても同様である
// 平均点 には端数があるかもしれないが，それは切り捨てて最終的な点数は整数値
