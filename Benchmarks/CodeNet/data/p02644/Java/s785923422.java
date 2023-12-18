import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        int K = scan.nextInt();
        int x1 = scan.nextInt()-1;
        int y1 = scan.nextInt()-1;
        int x2 = scan.nextInt()-1;
        int y2 = scan.nextInt()-1;
        scan.nextLine();
        
        int[][] board = new int[h][w];
        for(int row = 0 ; row < h ; row++) {
            String s = scan.nextLine();
            for(int col = 0 ; col < w ; col++) {
                if(s.charAt(col) == '.') {
                    board[row][col] = 1000000009;
                } else {
                    board[row][col] = -1;
                }
            }
        }
        if(h == 0 || w == 0 || K == 0 || board[x2][y2] == -1) {
            System.out.println("-1");
            return;
        }
        
        Deque<int[]> queue = new LinkedList<>();
        queue.addLast(new int[]{x1,y1});
        board[x1][y1] = 0;
        int level = 0;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!queue.isEmpty()) {
            int sz = queue.size();
            for(int i = 0 ; i < sz ; i++) {
                int[] current = queue.removeFirst();
                // get all unvisited neighbours of this cell.
                for(int[] dir : dirs) {
                    for(int k = 1 ; k <= K ; k++) {
                         int newX = current[0] + dir[0]*k;
                         int newY = current[1] + dir[1]*k;
                        if(newX < 0 || newY < 0 || newX >= h || newY >= w) break;
                        if(board[newX][newY] == -1) break;
                        if(board[newX][newY] < board[current[0]][current[1]]+1) continue;
                        board[newX][newY] = board[current[0]][current[1]]+1;
                        queue.addLast(new int[]{newX, newY});
                    }
                }
                // for(int i1 = 0 ; i1 < h ; i1++) {
                //     System.out.println(Arrays.toString(board[i1]));
                // }
            }
            level++;
        }
        
        System.out.println(board[x2][y2] == 1000000009 ? -1 : board[x2][y2]);
    }
}
