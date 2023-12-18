import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Arrays;
// import java.util.StringTokenizer;

// import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));

        int MOD = (int) (Math.pow(10, 9)) + 7;

        StringTokenizer st = new StringTokenizer(f.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());


        int[][] grid = new int[H][W];

        grid[0][0] = 1;

        for (int i = 0; i < H; i++) {
            String s = f.readLine();
            for (int j = 0; j < W; j++) {
                if (s.charAt(j) == '#') {
                    grid[i][j] = 0; // actually don't need to do anything
                }
                else if (i == 0 && j == 0) {

                }
                else if (i == 0) {
                    grid[i][j] = grid[i][j-1];
                }else if (j == 0) {
                    grid[i][j] = grid[i-1][j];
                }
                else {
                    grid[i][j] = (grid[i-1][j] + grid[i][j-1]) % MOD;
                }
            }
        }

        /* for (int[] i : grid){
            for (int j : i){
                System.out.print(String.valueOf(j) + " ");
            }
            System.out.println();
        } */
        System.out.println(grid[H-1][W-1]);

    }
}