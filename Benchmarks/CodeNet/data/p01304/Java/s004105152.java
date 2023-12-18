import java.io.*;
import java.util.*;

public class Main {
    Scanner sc;
    int[][] field;
    int gx, gy;
    int p;
    boolean[][][][] matatabi;

    int dataset;

    Main() {
        sc = new Scanner(System.in);
        dataset = sc.nextInt();
    }

    void init() {
        gx = sc.nextInt();
        gy = sc.nextInt();
        field = new int[gy+1][gx+1];
        matatabi = new boolean[gy+1][gx+1][gy+1][gx+1];

        p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            matatabi[y1][x1][y2][x2] = true;
            matatabi[y2][x2][y1][x1] = true;
        }
    }

    void run() {
        for (int _i = 0; _i < dataset; _i++) {
            init();
            field[0][0] = 1;
            for (int i = 1; i <= gx; i++) {
                if (matatabi[0][i-1][0][i]) break;
                field[0][i] = 1;
            }
            for (int i = 1; i <= gy; i++) {
                if (matatabi[i-1][0][i][0]) break;
                field[i][0] = 1;
            }

            for (int i = 1; i <= gy; i++) {
                for (int j = 1; j <= gx; j++) {
                    if (matatabi[i][j-1][i][j] && matatabi[i-1][j][i][j]) {
                        field[i][j] = 0;
                    } else if (matatabi[i][j-1][i][j]) {
                        field[i][j] = field[i-1][j];
                    } else if (matatabi[i-1][j][i][j]) {
                        field[i][j] = field[i][j-1];
                    } else {
                        field[i][j] = field[i-1][j] + field[i][j-1];
                    }
                }
            }

            if (field[gy][gx] == 0) {
                System.out.println("Miserable Hokusai!");
            } else {
                System.out.println(field[gy][gx]);
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
            