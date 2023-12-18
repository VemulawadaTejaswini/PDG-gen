import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        int count = 0;
        
        // board[i][j]: 迷路
        char[][] board = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
                
                if (board[i][j] == '#') count++;
            }
        }
        
        if (count == h + w - 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}