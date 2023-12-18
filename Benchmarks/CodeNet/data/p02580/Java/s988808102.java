import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        int m = in.nextInt();
        int[][] mat = new int[h][w];
        for(int i=0; i<m; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            mat[x][y] = 1;
        }
        int[] row = new int[h];
        int[] col = new int[w];
        for(int i=0; i<h; i++) {
            int sum = 0;
            for(int j=0; j<w; j++)
                sum += mat[i][j];
            row[i] = sum;
        }
        for(int i=0; i<w; i++) {
            int sum = 0;
            for(int j=0; j<h; j++) {
                sum += mat[j][i];
            }
            col[i] = sum;
        }
        int max = 0;
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                max = Math.max(max, row[i] + col[j] - mat[i][j]);
            }
        }
        System.out.println(max);
        in.close();
    }
}