import java.util.*;

public class Main {
    private static int[][] c;
    private static int count;

    public static void main(String[] args) {
        int h, w;

        Scanner sc = new Scanner(System.in);

        while (true) {
            w = sc.nextInt();
            h = sc.nextInt();
            if (w == 0 && h == 0) break;

            c = new int[h+2][w+2];

            for (int i=1; i<=h; i++) {
                for (int j=1; j<=w; j++) {
                    c[i][j] = sc.nextInt();
                }
            }
            for (int i=0; i<h+2; i++) c[i][0] = c[i][w+1] = 0;
            for (int j=0; j<w+2; j++) c[0][j] = c[h+1][j] = 0;

            count = 1;
            for (int i=1; i<=h; i++) {
                for (int j=1; j<=w; j++) {
                    if (c[i][j] == 1) {
                        count++;
                        bfs(i, j);
                    }
                }
            }
            
            System.out.println(count-1);
            c = null;
        }
    }

    private static void bfs(int row, int column) {
        c[row][column] = count;
        for(int i=-1; i<=1; i++) {
            for (int j=-1; j<=1; j++) {
                if (c[row+i][column+j] == 1) bfs(row+i, column+j);
            }
        }
    }
}