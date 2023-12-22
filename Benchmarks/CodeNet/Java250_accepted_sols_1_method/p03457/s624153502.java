import java.util.Scanner;

// C - Traveling
// https://atcoder.jp/contests/abc086/tasks/arc089_a
public class Main {

    /**
     * 最短で移動できるか移動して距離的に可能か、
     * かつ t 時間に指定位置に行けるか (残り時間が偶数か)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int[] T = new int[N];
        int[] X = new int[N];
        int[] Y = new int[N];

        for (int i = 0; i < N; i++) {
            T[i] = Integer.parseInt(scanner.next());
            X[i] = Integer.parseInt(scanner.next());
            Y[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        int currentX = 0;
        int currentY = 0;

        for (int i = 0; i < N; i++) {
            int t = T[i];
            int x = X[i];
            int y = Y[i];

            int diff = Math.abs(currentX - x) + Math.abs(currentY - y);
            if (diff > t) {
                // 到達不可
                System.out.println("No");
                return;
            }

            int diffT = t - diff;
            if (diffT % 2 != 0) {
                // ターン合わせが出来ないので到達不可
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
