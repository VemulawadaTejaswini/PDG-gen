import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main();
    }
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int h, w, n;
    int[] a;
    int[][] grid;

    Main() {
        h = in.nextInt();
        w = in.nextInt();
        n = in.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        
        int at = 0;
        grid = new int[h][w];
        for (int i = 0; i < h; i++) {
            boolean dir = i%2 == 0;
            for (int j = 0; j < w; j++) {
                if (dir)
                    grid[i][j] = at+1;
                else
                    grid[i][w-j-1] = at+1;
                a[at]--;
                if (a[at] == 0)
                    at++;
            }
        }

        for (int[] row : grid) {
            for (int cell : row)
                out.print(cell+" ");
            out.println();
        }
        out.close();
    }
}