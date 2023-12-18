import java.io.*;
import java.util.*;

public class Main {
    int n;
    Scanner sc;

    Main() {
        sc = new Scanner(System.in);
    }

    boolean init() {
        n = sc.nextInt();
        if (n == 0) return false;
        return true;
    }

    void run() {
        while (init()) {
            int[][] square = new int[n][n];
            int x = n/2, y = n/2+1;
            int cur = 1;
            square[y][x] = cur++;
            x++;
            y++;
            while (cur <= n*n) {
                if (n <= x) {
                    x = 0;
                    continue;
                } 
                if (x < 0) {
                    x = n-1;
                    continue;
                }
                if (n <= y) {
                    y = 0;
                    continue;
                }
                if (square[y][x] != 0) {
                    y++;
                    x--;
                    continue;
                }
                square[y][x] = cur++;
                x++;
                y++;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%4d", square[i][j]);
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}