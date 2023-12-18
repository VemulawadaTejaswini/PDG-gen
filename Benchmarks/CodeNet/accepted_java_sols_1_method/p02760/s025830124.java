
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[3][3];
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                board[i][j] = scanner.nextInt();
            }
        }
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            int current = scanner.nextInt();
            for (int k = 0; k < 3; ++k) {
                for (int m = 0; m < 3; ++m) {
                    if (current == board[k][m]) {
                        board[k][m] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < 3; ++i) {
            if (board[i][0] == 0 && board[i][1] == 0 && board[i][2] == 0) {
                System.out.println("Yes");
                return;
            }
        }
        for (int i = 0; i < 3; ++i) {
            if (board[0][i] == 0 && board[1][i] == 0 && board[2][i] == 0) {
                System.out.println("Yes");
                return;
            }
        }
        if (board[0][0] == 0 && board[1][1] == 0 && board[2][2] == 0) {
            System.out.println("Yes");
            return;
        }
        if (board[0][2] == 0 && board[1][1] == 0 && board[2][0] == 0) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
