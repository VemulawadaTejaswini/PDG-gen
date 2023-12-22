import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0 ; i < n ; i++) {
            b[i] = sc.nextInt();
        }
        int [][] bingo = new int[3][3];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                for (int k = 0 ; k < 3 ; k++) {
                    if (b[i] == a[j][k]) {
                        bingo[j][k]++;
                    }
                }
            }
        }

        boolean flg = false;
        if (bingo[0][0] + bingo[0][1] + bingo[0][2] == 3) {
            flg = true;
        }
        if (bingo[1][0] + bingo[1][1] + bingo[1][2] == 3) {
            flg = true;
        }
        if (bingo[2][0] + bingo[2][1] + bingo[2][2] == 3) {
            flg = true;
        }
        if (bingo[0][0] + bingo[1][0] + bingo[2][0] == 3) {
            flg = true;
        }
        if (bingo[0][1] + bingo[1][1] + bingo[2][1] == 3) {
            flg = true;
        }
        if (bingo[0][2] + bingo[1][2] + bingo[2][2] == 3) {
            flg = true;
        }
        if (bingo[0][0] + bingo[1][1] + bingo[2][2] == 3) {
            flg = true;
        }
        if (bingo[0][2] + bingo[1][1] + bingo[2][0] == 3) {
            flg = true;
        }
        System.out.println(flg ? "Yes" : "No");
    }

}