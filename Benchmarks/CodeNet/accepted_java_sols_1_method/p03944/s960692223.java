import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        boolean[][] matrix = new boolean[w][h];// false:白, true:黒

        for (int i = 0; i < n; i++) {
            int borderX = sc.nextInt();
            int borderY = sc.nextInt();
            int a = sc.nextInt();

            switch (a) {
                case 1:// x<xi を黒くする
                    for (int x = 0; x < borderX; x++) {
                        for (int y = 0; y < h; y++) {
                            matrix[x][y] = true;
                        }
                    }
                    break;
                case 2:// x>xi を黒くする
                    for (int x = borderX; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            matrix[x][y] = true;
                        }
                    }
                    break;
                case 3:// y<yi を黒くする
                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < borderY; y++) {
                            matrix[x][y] = true;
                        }
                    }
                    break;
                case 4:// y>yi を黒くする
                    for (int x = 0; x < w; x++) {
                        for (int y = borderY; y < h; y++) {
                            matrix[x][y] = true;
                        }
                    }
                    break;
            }
        }


        int count = 0;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (matrix[i][j] == false) count++;
            }
        }

        System.out.println(count);
    }
}
