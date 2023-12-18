import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] bingoBoard = new int[3][3];
        int[][] markedBoard = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bingoBoard[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < n; k++) {
                    if (bingoBoard[i][j] == b[k]) {
                        markedBoard[i][j] = 1;
                    }
                }
            }
        }

        if (markedBoard[0][0] + markedBoard[0][1] + markedBoard[0][2] == 3) {
            System.out.println("Yes");
        }

        else if (markedBoard[1][0] + markedBoard[1][1] + markedBoard[1][2] == 3) {
            System.out.println("Yes");
        }

        else if (markedBoard[2][0] + markedBoard[2][1] + markedBoard[2][2] == 3) {
            System.out.println("Yes");
        }

        else if (markedBoard[0][0] + markedBoard[1][0] + markedBoard[2][0] == 3) {
            System.out.println("Yes");
        }

        else if (markedBoard[0][1] + markedBoard[1][1] + markedBoard[2][1] == 3) {
            System.out.println("Yes");
        }

        else if (markedBoard[0][2] + markedBoard[1][2] + markedBoard[2][2] == 3) {
            System.out.println("Yes");
        }

        else if (markedBoard[0][0] + markedBoard[1][1] + markedBoard[2][2] == 3) {
            System.out.println("Yes");
        }

        else if (markedBoard[0][2] + markedBoard[1][1] + markedBoard[0][2] == 3) {
            System.out.println("Yes");
        }

        else {
            System.out.println("No");
        }
    }
}