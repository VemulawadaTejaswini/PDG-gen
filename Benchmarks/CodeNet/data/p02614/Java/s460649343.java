import java.util.Scanner;

public class Main {
    // ABC173 H and V
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();

        char[][] masu = new char[H][];
        for (int h = 0; h < H; h++) {
            masu[h] = sc.next().toCharArray();
        }
        sc.close();
        System.out.println(count(H, W, K, masu));
    }

    private static int count(int H, int W, int K, char[][] masu) {
        int ans = 0;

        // すべての行・列について赤く塗る・塗らないの全パターンを試す。

        // 全列挙のための繰り返し文 ここから
        for (int h1 = 0; h1 < 1 << H; h1++) {
            for (int w1 = 0; w1 < 1 << W; w1++) {
                // 全列挙のための繰り返し文 ここまで

                int blackCount = 0; // 赤く塗られなかった黒の個数

                for (int h2 = 0; h2 < H; h2++) {
                    for (int w2 = 0; w2 < W; w2++) {
                        if (((h1 >> h2 & 1) == 1) || ((w1 >> w2 & 1) == 1)) {
                            // マスが赤く塗られたケース
                            continue;
                        } else {
                            // マスが赤く塗られなかったケース
                            if (masu[h2][w2] == '#') {
                                blackCount++;
                            }
                        }
                    }
                }

                if (blackCount == K) {
                    ans++;
                }
            }
        }

        return ans;
    }
}