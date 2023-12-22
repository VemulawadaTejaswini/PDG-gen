import java.util.Scanner;

public class Main {

    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = Integer.parseInt(sc.nextLine());
        int[][] grid = new int[2][N];
        for (int i = 0; i < N; i++) {
            grid[0][i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < N; i++) {
            grid[1][i] = Integer.parseInt(sc.next());
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int tmp = 0;
            for (int j = 0; j <= i; j++) {
                // 右移動
                tmp += grid[0][j];
            }
            for (int j = i; j < N; j++) {
                // 下に移動して、あとは全部右移動
                tmp += grid[1][j];
            }

            ans = Math.max(tmp, ans);
        }

        System.out.println(ans);
    }
}

