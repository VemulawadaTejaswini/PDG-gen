import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 都市の数
        int m = sc.nextInt();// 道路の数
        int[][] map = new int[n][n];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 道路の数をカウントアップ(双方向のため両方カウントアップ)
            map[a-1][b-1]++;
            map[b-1][a-1]++;
        }

        // 各都市からの道を出力
        for (int i = 0; i < n; i++) {
            int roadCnt = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                roadCnt += map[i][j];
            }
            System.out.println(roadCnt);
        }
    }
}
