import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][][] hu = new int[4][3][10];

        //b?£?f???r?????????v?????\????????????
        while (n != 0) {
            int b = scan.nextInt();
            int f = scan.nextInt();
            int r = scan.nextInt();
            int v = scan.nextInt();
            hu[b - 1][f - 1][r - 1] += v;
            n--;
        }

        //????????¨??????0?????\??????
        for (int num = 0; num < 4; num++) {
            for (int i = 0; i < 3; i++) {
                for (int a = 0; a < 10; a++) {
                    hu[num][i][a] += 0;
                }
            }
        }

        //??¨?????????
        for (int num = 0; num < 4; num++) {
            for (int i = 0; i < 3; i++) {
                for (int a = 0; a < 10; a++) {
                    System.out.print(" " + hu[num][i][a]);
                }
                System.out.println();
            }

            if (num != 4 - 1) {
                for (int i = 0; i < 20; i++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}