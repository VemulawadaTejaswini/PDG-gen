import java.io.*;
import java.util.*;

public class Main {
    int n, h;
    boolean cube[][][];
    Scanner sc;
    enum C {XY, XZ, YZ;}

    Main() {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    boolean init() {
        n = sc.nextInt();
        h = sc.nextInt();
        if (n == 0 && h == 0) return false;
        cube = new boolean[n][n][n];
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                for (int k = 0; k < n; k++)
                    cube[i][j][k] = true;
        for (int q = 0; q < h; q++) {
            String c; int a, b;
            c = sc.next();
            a = sc.nextInt()-1; // input is one-origin
            b = sc.nextInt()-1;

            switch (C.valueOf(c.toUpperCase())) {
                case XY:
                    for (int i = 0; i < n; i++) cube[a][b][i] = false;
                    break;
                case XZ:
                    for (int i = 0; i < n; i++) cube[a][i][b] = false;
                    break;
                case YZ:
                    for (int i = 0; i < n; i++) cube[i][a][b] = false;
                    break;
            }
        }
        return true;
    }

    void run() {
        while (init()) {
            int count_without_hole = 0;
            for (int i = 0; i < n; i++) 
                for (int j = 0; j < n; j++) 
                    for (int k = 0; k < n; k++) 
                        if (cube[i][j][k]) count_without_hole++;
            System.out.println(count_without_hole);
        }
    }
}