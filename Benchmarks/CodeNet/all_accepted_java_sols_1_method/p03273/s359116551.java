import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] color = new int[H][W];
        int[] HH = new int[H];
        int[] WW = new int[W];
        String[] c = new String[H];
        String stush = sc.nextLine();
        for (int i = 0; i < H; i++) {
            c[i] = sc.nextLine();
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (c[i].charAt(j) == '.') {
                    color[i][j] = 0;
                } else {
                    color[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                HH[i] += color[i][j];
            }
        }
        // ok
        for (int j = 0; j < W; j++) {
            for (int i = 0; i < H; i++) {
                WW[j] += color[i][j];
            }
        }
        int ansH = 0;
        for (int i = 0; i < H; i++) {
            if (HH[i] != 0) {
                ansH++;
            }
        }
        int ansW = 0;
        for (int j = 0; j < W; j++) {
            if (WW[j] != 0) {
                ansW++;
            }
        }
        // ok
        int[][] answer = new int[ansH][W];
        int insertH = 0;

        for (int j = 0; j < H; j++) {
            if (HH[j] != 0) {
                for (int k = 0; k < W; k++) {
                    answer[insertH][k] = color[j][k];
                }
                insertH++;
            }
        }

        int[][] answer2 = new int[ansH][ansW];
        int insertW = 0;
        for (int j = 0; j < W; j++) {
            if (WW[j] != 0) {
                for (int k = 0; k < ansH; k++) {
                    answer2[k][insertW] = answer[k][j];
                }
                insertW++;
            }
        }

        for (int i = 0; i < ansH; i++) {
            for (int j = 0; j < ansW; j++) {
                if (answer2[i][j] == 0) {
                    System.out.print(".");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}