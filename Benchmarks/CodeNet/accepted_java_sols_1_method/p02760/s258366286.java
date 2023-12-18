import java.util.Scanner;

public class Main {
    static int n;
    static int[][] bingo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bingo = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bingo[i][j] = sc.nextInt();
            }
        }
        n = sc.nextInt();
        for (int i = 0; i <= n-1; i++) {
            int t = sc.nextInt();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (bingo[j][k] == t) {
                        bingo[j][k] = -1;
                    }
                }
            }
        }
        boolean bl = false;
        //横
        if (bingo[0][0] == -1 && bingo[0][1] == -1 && bingo[0][2] == -1 ) bl = true;
        if (bingo[1][0] == -1 && bingo[1][1] == -1 && bingo[1][2] == -1 ) bl = true;
        if (bingo[2][0] == -1 && bingo[2][1] == -1 && bingo[2][2] == -1 ) bl = true;
        //縦
        if (bingo[0][0] == -1 && bingo[1][0] == -1 && bingo[2][0] == -1 ) bl = true;
        if (bingo[0][1] == -1 && bingo[1][1] == -1 && bingo[2][1] == -1 ) bl = true;
        if (bingo[0][2] == -1 && bingo[1][2] == -1 && bingo[2][2] == -1 ) bl = true;
        //斜め右
        if (bingo[0][0] == -1 && bingo[1][1] == -1 && bingo[2][2] == -1 ) bl = true;
        if (bingo[0][2] == -1 && bingo[1][1] == -1 && bingo[2][0] == -1 ) bl = true;

        System.out.println(bl?"Yes":"No");
    }

}