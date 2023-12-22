import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int[][] bingo = new int[3][3];
        boolean[][] bingoOK = new boolean[3][3];
        for (int i = 0; i < 3; i++) {
            bingo[i][0] = sc.nextInt();
            bingo[i][1] = sc.nextInt();
            bingo[i][2] = sc.nextInt();
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (bingo[j][k] == v) {
                        bingoOK[j][k] = true;
                        break;
                    }
                }
            }
        }

        // 横
        parent : for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                if (!bingoOK[i][j]) {
                    continue parent;
                }
            }
            System.out.println("Yes");
            return;
        }

        // 縦
        parent : for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                if (!bingoOK[j][i]) {
                    continue parent;
                }
            }
            System.out.println("Yes");
            return;
        }

        // 斜め
        if (bingoOK[0][0] && bingoOK[1][1] && bingoOK[2][2]) {
            System.out.println("Yes");
            return;
        }
        if (bingoOK[0][2] && bingoOK[1][1] && bingoOK[2][0]) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}
