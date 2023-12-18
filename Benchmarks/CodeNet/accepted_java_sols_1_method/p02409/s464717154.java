

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int table[][][] = new int[4][3][10];

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                for (int k = 0; k < 10; k++){
                    table[i][j][k] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++){
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            table[b - 1][f - 1][r - 1] += v;
        }
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                for (int k = 0; k < 10; k++){
                    System.out.print(" ");
                    System.out.print(table[i][j][k]);
                }
                System.out.println();
            }
            if (i != 3)
            System.out.println("####################");
        }
    }
}

