import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        // 白く塗る キーは実際の座標より-1
        int[][] WH = new int[W][H];
        for (int i = 0; i < W; ++i) {
            for (int j = 0; j < H; ++j) {
                WH[i][j] = 1;
            }
        }
        // 黒く塗る キーは実際の座標より-1
        int N = sc.nextInt();
        int[][] XY = new int[N][N];
        for (int i = 0; i < N; ++i) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int A = sc.nextInt();
            switch (A) {
            case 1:
                for (int j = 0; j < X; ++j) {
                    for (int k = 0; k < H; ++k) {
                        WH[j][k] = 0;
                    }
                }
                break;
            case 2:
                for (int j = X; j < W; ++j) {
                    for (int k = 0; k < H; ++k) {
                        WH[j][k] = 0;
                    }
                }
                break;
            case 3:
                for (int j = 0; j < W; ++j) {
                    for (int k = 0; k < Y; ++k) {
                        WH[j][k] = 0;
                    }
                }
                break;
            case 4:
                for (int j = 0; j < W; ++j) {
                    for (int k = Y; k < H; ++k) {
                        WH[j][k] = 0;
                    }
                }
                break;
            default:
                break;
            }
        }
        sc.close();

        int ans = 0;
        for (int[] ary : WH) {
            for (int white : ary) {
                ans += white;
            }
        }
        System.out.println(ans);
    }
}