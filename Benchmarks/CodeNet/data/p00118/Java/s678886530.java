import java.util.Scanner;

/**
 * @author ants_ypc
 * @version 1.0 5/5/16
 */
public class Main {
    private char[][] matrix;
    private boolean[][] flag;


    public int getRegions(char[][] matrix) {
        int region = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        flag = new boolean[row][col];
        this.matrix = matrix;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!flag[i][j]) {
                    region++;
                    dfs(i, j);
                }
            }
        }
        return region;
    }

    private void dfs(int x, int y) {
        flag[x][y] = true;
        if (x - 1 >= 0 && !flag[x-1][y] && matrix[x-1][y] == matrix[x][y]) {
            dfs(x - 1, y);
            flag[x - 1][y] = true;
        }
        if (x + 1 < matrix.length && !flag[x+1][y] && matrix[x+1][y] == matrix[x][y]) {
            dfs(x + 1, y);
            flag[x + 1][y] = true;
        }
        if (y - 1 >= 0 && !flag[x][y-1] && matrix[x][y-1] == matrix[x][y]) {
            dfs(x, y-1);
            flag[x][y-1] = true;
        }
        if (y + 1 < matrix[0].length && !flag[x][y+1] && matrix[x][y+1] == matrix[x][y]) {
            dfs(x, y+1);
            flag[x][y+1] = true;
        }
    }


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (true) {
            int row = cin.nextInt();
            int col = cin.nextInt();
            if (row == 0 && col == 0) break;
            cin.nextLine();

            char[][] matrix = new char[row][col];
            for (int i = 0; i < row; i++) {
                matrix[i] = cin.nextLine().toCharArray();
            }
            System.out.println(new Main().getRegions(matrix));
        }

    }
}