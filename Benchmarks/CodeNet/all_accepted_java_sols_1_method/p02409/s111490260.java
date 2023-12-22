import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int tou1[][] = new int[n][10];
        int tou2[][] = new int[n][10];
        int tou3[][] = new int[n][10];
        int tou4[][] = new int[n][10];

        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            int f = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int v = sc.nextInt();

            for (int j = 0; j < 10; j++) {
                tou1[i][j] = 0;
                tou2[i][j] = 0;
                tou3[i][j] = 0;
                tou4[i][j] = 0;

            }

            switch (b) {
                case 1:
                    tou1[f][r] = tou1[f][r] + v;
                    break;
                case 2:
                    tou2[f][r] = tou2[f][r] + v;
                    break;
                case 3:
                    tou3[f][r] = tou3[f][r] + v;
                    break;
                case 4:
                    tou4[f][r] = tou4[f][r] + v;
                    break;
            }

        }

        for (int k = 0; k <= 2; k++) {
            for (int l = 0; l <= 9; l++) {
                System.out.print(" " + tou1[k][l]);
            }
            System.out.println();
        }

        System.out.println("####################");

        for (int k = 0; k <= 2; k++) {
            for (int l = 0; l <= 9; l++) {
                System.out.print(" " + tou2[k][l]);
            }
            System.out.println();
        }

        System.out.println("####################");

        for (int k = 0; k <= 2; k++) {
            for (int l = 0; l <= 9; l++) {
                System.out.print(" " + tou3[k][l]);
            }
            System.out.println();
        }

        System.out.println("####################");

        for (int k = 0; k <= 2; k++) {
            for (int l = 0; l <= 9; l++) {
                System.out.print(" " + tou4[k][l]);
            }
            System.out.println();
        }

    }

}