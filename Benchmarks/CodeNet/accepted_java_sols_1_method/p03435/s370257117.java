import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int a1, a2, a3, b1, b2, b3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] grid = new int[3][3];
        String ans = "No";
        
        for (int i = 0; i < 3; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                grid[i][j] = Integer.parseInt(line[j]);
            }
        }
        
        for (a1 = 0; a1 <= grid[0][0]; a1++) {
            b1 = grid[0][0] - a1;
            b2 = grid[0][1] - a1;
            b3 = grid[0][2] - a1;
            a2 = grid[1][0] - b1;
            a3 = grid[2][0] - b1;
            if (a2 + b2 == grid[1][1] && a2 + b3 == grid[1][2] && a3 + b2 == grid[2][1] && a3 + b3 == grid[2][2]) ans = "Yes";
        }
        
        
        System.out.println(ans);
    }
}
