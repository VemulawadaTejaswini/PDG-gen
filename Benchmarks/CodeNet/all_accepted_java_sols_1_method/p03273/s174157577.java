import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] a = new String[h][w];
        boolean[][] b = new boolean[h][w];
        for (int i = 0 ; i < h ; i++) {
            String s = sc.next();
            for (int j = 0 ; j < w ; j++) {
                a[i][j] = s.substring(j, j + 1);
                b[i][j] = true;
            }
        }
// 白：.黒：#
        for (int i = 0 ; i < h ; i++) {
            boolean isAllWhite = true;
            for (int j = 0 ; j < w ; j++) {
                if (a[i][j].equals("#")) {
                    isAllWhite = false;
                }
            }
            for (int j = 0 ; j < w ; j++) {
                if (isAllWhite) {
                    b[i][j] = false;
                }
            }
        }

        for (int j = 0 ; j < w ; j++) {
            boolean isAllWhite = true;
            for (int i = 0 ; i < h ; i++) {
                if (a[i][j].equals("#")) {
                    isAllWhite = false;
                }
            }
            for (int i = 0 ; i < h ; i++) {
                if (isAllWhite) {
                    b[i][j] = false;
                }
            }
        }

        for (int i = 0 ; i < h ; i++) {
            boolean c = false;
            for (int j = 0 ; j < w ; j++) {
                if (b[i][j]) {
                    System.out.print(a[i][j]);
                    c = true;
                }
            }
            if (c) {
                System.out.println("");
            }
        }
    }

}