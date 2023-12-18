import java.io.*;
import java.util.*;

public class Main {
    Scanner sc;
    Main() {
        sc = new Scanner(System.in);
        case_n = 0;
    }
    public static void main(String[] args) {
        new Main().run();
    }
    int case_n;
    int n;
    boolean init() {
        case_n++;
        n = sc.nextInt(); 
        if (n == 0) return false;
        return true;
    }
    void run() {
        while (init()) {
            System.out.println("Case " + case_n + ":");
            int cur = 1;

            int[][] tile = new int[n][n];
            for (int i = 1; i <= n; i++) {
                int y, x;
                int dy, dx;
                if (i % 2 == 0) {
                    y = 0;
                    x = i-1;
                    dx = -1;
                    dy = 1;
                } else {
                    y = i-1;
                    x = 0;
                    dx = 1;
                    dy = -1;
                }
                for (int j = 0; j < i; j++) {
                    tile[y][x] = cur; cur++;
                    y+=dy; x+=dx;
                }
            }
            for (int i = n+1; i < 2*n; i++) {
                int y, x;
                int dy, dx;
                if (i % 2 == 0) {
                    y = i-n;
                    x = n-1;
                    dx = -1;
                    dy = 1;
                } else {
                    y = n-1;
                    x = i-n;
                    dx = 1;
                    dy = -1;
                }
                for (int j = 0; j < 2*n-i; j++) {
                    tile[y][x] = cur; cur++;
                    y+=dy; x+=dx;
                }
            }
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%3d", tile[i][j]);
                }
                System.out.println("");
            }
        }
    }
}