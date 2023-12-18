import java.io.*;
import java.util.*;

public class Main {
    int cx, cy;
    Scanner sc;

    Main() {
        sc = new Scanner(System.in);
    }

    int n;
    char dir;
    char[][] map;
    boolean init() {
        if (!sc.hasNext()) return false;
        n = sc.nextInt();
        map = new char[n][n];
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++)
                map[i][j] = ' ';
        return true;
    }

    boolean first_output = true;

    void run() {
        while (init()) {
            for (int i = n-1; i >= 0 ; i--)  map[i][0] = '#';
            for (int i = 0; i < n ; i++)  map[0][i] = '#';
            for (int i = 0; i < n ; i++)  map[i][n-1] = '#';
            for (int i = n-1; i >= 2 ; i--)  map[n-1][i] = '#';
            
            if (n <= 4) {
                if (!first_output) 
                    System.out.println("");
                printmap();
                first_output = false;
                continue;
            }

            dir = 'U';
            cx = 2;
            cy = n-1;

fill:
            while (true) {
                switch (dir) {
                    case 'L':
                        if (map[cy][cx-2] == '#') break fill;
                        while (map[cy][cx-2] != '#') {
                            cx--;
                            map[cy][cx] = '#';
                        }
                        if (map[cy][cx+2] != '#') break fill;
                        dir = 'U';
                        break;
                    case 'U':
                        if (map[cy-2][cx] == '#') break fill;
                        while (map[cy-2][cx] != '#') {
                            cy--;
                            map[cy][cx] = '#';
                        }
                        if (map[cy+2][cx] != '#') break fill;
                        dir = 'R';
                        break;
                    case 'R':
                        if (map[cy][cx+2] == '#') break fill;
                        while (map[cy][cx+2] != '#') {
                            cx++;
                            map[cy][cx] = '#';
                        }
                        if (map[cy][cx-2] != '#') break fill;
                        dir = 'D';
                        break;
                    case 'D':
                        if (map[cy+2][cx] == '#') break fill;
                        while (map[cy+2][cx] != '#') {
                            cy++;
                            map[cy][cx] = '#';
                        }
                        if (map[cy-2][cx] != '#') break fill;
                        dir = 'L';
                        break;
                }
            }

            if (!first_output) 
                System.out.println("");
            printmap();
            first_output = false;
        }

    }

    void printmap() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(map[i][j]);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}