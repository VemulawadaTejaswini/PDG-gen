import java.util.Scanner;

public class Main {

    private static int n;
    private static int x;
    private static int y;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ##### 初期読み込み #######################################################################
        // 1行 文字 複数 ----------------------------------------------------------------------------
        String[] stringArray = scanner.nextLine().split(" ");

        n = Integer.parseInt(stringArray[0]);
        x = Integer.parseInt(stringArray[1]);
        y = Integer.parseInt(stringArray[2]);

        // ##### メイン処理 #######################################################################

        int[] result = new int[n];

        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                // XYルート使わない場合のi,j間の距離
                int route1 = j - i;

                // XYルート使う場合のi,j間の距離
                int route2 = Math.abs(x - i) + 1 + Math.abs(y - j);

                result[Math.min(route1, route2)]++;
            }
        }

        for (int i = 1; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}