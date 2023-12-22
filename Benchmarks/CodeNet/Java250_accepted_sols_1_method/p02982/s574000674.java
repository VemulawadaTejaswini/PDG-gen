import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        Integer[][] x = new Integer[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = sc.nextInt();
            }
        }

        int result = 0;

        // リストのサイズ-1分繰り返す（最後のインデックスで比較対象がないため）
        for (int i = 0; i < n - 1; i++) {

            // 以降のインデックス全てを比較
            for (int k = 0; k < n - 1 - i; k++) {

                // ルートの中身の項を計算
                int sumInRoot = 0;
                for (int j = 0; j < d; j++) {
                    int y = x[i][j];
                    int z = x[i + 1 + k][j];
                    sumInRoot += (y - z) * (y - z);
                }

                // 座標xを求める
                String coordinate = String.valueOf(Math.sqrt(sumInRoot));

                // 整数判定
                int pointIndex = coordinate.indexOf(".");
                if (coordinate.length() - 2 == coordinate.substring(0, pointIndex).length()) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
