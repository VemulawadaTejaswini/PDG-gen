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
        int[][] c = new int[3][3];
        for (int k = 0 ; k < n ; k++) {
            for (int i = 0 ; i < 3 ; i++) {
                for (int j = 0 ; j < 3 ; j++) {
                    if (a[i][j] == b[k]) {
                        c[i][j] = 1;
                    }
                }
            }
        }
        boolean flg = false;
        for (int i = 0 ; i < 3 ; i++) {
            if (c[i][0] + c[i][1] + c[i][2] == 3) flg = true;
        }
        for (int i = 0 ; i < 3 ; i++) {
            if (c[0][i] + c[1][i] + c[2][i] == 3) flg = true;
        }
        if (c[0][0] + c[1][1] + c[2][2] == 3) {
            flg = true;
        }
        if (c[2][0] + c[1][1] + c[0][2] == 3) {
            flg = true;
        }

        System.out.println(flg ? "Yes" : "No");
    }

}