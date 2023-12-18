import java.util.*;

public class Main {
    public static void main(String args[]) {
        int[][][] res = new int[4][3][10];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    res[i][j][k] = 0;
                }
            }
        }

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int l = 0; l < n; l++) {
            int b = scn.nextInt();
            int f = scn.nextInt();
            int r = scn.nextInt();
            int v = scn.nextInt();

            res[b - 1][f - 1][r - 1] = res[b - 1][f - 1][r - 1] + v;

        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                String str = "";
                for (int k = 0; k < 10; k++) {
                    str = str + " " + res[i][j][k];
                }
                System.out.println(str);
            }
            if (i < 3) {
                System.out.println("####################");
            }
        }


        scn.close();

    }


}

