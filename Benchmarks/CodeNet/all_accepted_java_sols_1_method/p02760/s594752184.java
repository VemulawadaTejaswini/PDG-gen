import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int maxRow = 3;
        int maxCol = 3;
        Map<Integer, Integer> locationMap = new HashMap<>();
        boolean[][] grid = new boolean[maxRow][maxCol];

        for(int i = 0; i < maxRow; i++) {
            for(int j = 0; j < maxCol; j++) {
                locationMap.put(sc.nextInt(), i * maxCol + j);
            }
        }

        int n = sc.nextInt();
        while(n-- > 0) {
            int b = sc.nextInt();
            if(!locationMap.containsKey(b)) continue;

            int loc = locationMap.get(b);
            int row = loc / maxCol;
            int col = loc % maxCol;
            grid[row][col] = true;
        }

        for(int i = 0; i < maxRow; i++) {
            if(grid[i][0] && grid[i][1] && grid[i][2]) {
                System.out.println("Yes");
                return;
            }
            if(grid[0][i] && grid[1][i] && grid[2][i]) {
                System.out.println("Yes");
                return;
            }
        }
        if(grid[0][0] && grid[1][1] && grid[2][2] || 
            grid[2][0] && grid[1][1] && grid[0][2]
        ) {
            System.out.println("Yes");
                return;
        }
        System.out.println("No");
    }
}
