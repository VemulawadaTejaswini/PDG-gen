import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int W = sc.nextInt();
        final int H = sc.nextInt();
        final int N = sc.nextInt();

        final int[][] area = new int[W][H];
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                area[i][j] = 1;
            }
        }

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();

            switch (a) {
                case 1:
                    for (int j = 0; j < x; j++) {
                        for (int k = 0; k < H; k++) {
                            area[j][k] = 0;
                        }
                    }
                    break;
                case 2:
                    for (int j = x; j < W; j++) {
                        for (int k = 0; k < H; k++) {
                            area[j][k] = 0;
                        }
                    }
                    break;
                case 3:
                    for (int j = 0; j < W; j++) {
                        for (int k = 0; k < y; k++) {
                            area[j][k] = 0;
                        }
                    }
                    break;
                case 4:
                    for (int j = 0; j < W; j++) {
                        for (int k = y; k < H; k++) {
                            area[j][k] = 0;
                        }
                    }
                    break;
            }
        }

        int ans = 0;
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                ans += area[i][j];
            }
        }

        System.out.println(ans);
    }
}
