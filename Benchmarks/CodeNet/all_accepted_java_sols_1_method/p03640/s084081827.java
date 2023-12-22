import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = sc.nextInt();
        }
        
        int nowh = 0;
        int noww = 0;
        int now = 0;
        int index = 0;
        int[][] board = new int[h][w];
        while (now < h * w) {
            board[nowh][noww] = index + 1;
            
            count[index]--;
            if (count[index] == 0) index++;
            now++;
            
            if (nowh % 2 == 0) {
                if (noww != w - 1) {
                    noww++;
                } else {
                    nowh++;
                }
            } else {
                if (noww != 0) {
                    noww--;
                } else {
                    nowh++;
                }
            }
        }
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(board[i][j]);
                
                if (j != w - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
            }
        }
    }
}