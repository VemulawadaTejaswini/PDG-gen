import java.util.Scanner;

public class Main {

    private static final int BINGO = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
            a[i][j] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int b = scanner.nextInt();

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (a[j][k] == b) {
                        a[j][k] = BINGO;
                    }
                }
            }
        }

        boolean isBingo = false;

        // ななめ
        if (a[0][0] == BINGO && a[1][1] == BINGO && a[2][2] == BINGO) {
            isBingo = true;
        } else if (a[0][2] == BINGO && a[1][1] == BINGO && a[2][0] == BINGO) {
            isBingo = true;
        } else {
            // 縦 or 横
            for (int i = 0; i < 3; i++) {
                if (a[i][0] == BINGO && a[i][1] == BINGO && a[i][2] == BINGO) {
                    isBingo = true;
                } else if (a[0][i] == BINGO && a[1][i] == BINGO && a[2][i] == BINGO) {
                    isBingo = true;
                }
            }
        }
        System.out.println(isBingo ? "Yes" : "No");
    }
}
