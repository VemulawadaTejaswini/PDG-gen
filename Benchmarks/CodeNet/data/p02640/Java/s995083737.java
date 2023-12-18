import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int[][] A = {{1, 1, X}, {4, 2, Y}};

        if (Y / X == 2) {
            System.out.println("Yes");
        } else if (Y / X == 4) {
            System.out.println("No");
        } else {
            for (int k = 0; k < 2; k++) { // ステップ１～ステップ４
                double p = A[k][k];// ピボット係数
                int i;
                for (i = k; i < 2; i++)
                    A[k][i] /= p;  // ピボット係数を１にするためピボット行を割り算

                for (i = 0; i < 3; i++) {// ピボット列の掃き出し
                    if (i != k) {
                        double d = A[i][k];
                        for (int j = k; j < 2; j++) {
                            A[i][j] -= d * A[k][j];
                            if (A[i][j] != 1 | A[i][j] != 0) {
                                System.out.println("No");
                                System.exit(0);
                            }
                        }
                    }
                }
            }
            System.out.println("Yes");
        }
    }
}
