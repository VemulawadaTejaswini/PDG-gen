import java.util.*;

public class Main {
    public static int[] xAdj = {-1,0,1,0};
    public static int[] yAdj = {0,-1,0,1};
    public static int left = 0;
    public static int right = 0;
    public static int up = 0;
    public static int down = 0;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;
            
            Square[] squares = new Square[N];
            squares[0] = new Square(0, 0);
            
            left = 0;
            right = 0;
            up = 0;
            down = 0;
            
            for (int i = 1; i < N; i++) {
                int pos = sc.nextInt();
                int dir = sc.nextInt();
                int x = squares[pos].x + xAdj[dir];
                int y = squares[pos].y + yAdj[dir];
                squares[i] = new Square(x, y);
            }
            
            int w = right - left + 1;
            int h = up - down + 1;
            System.out.println(w + " " + h);
        }
    }
    
    public static class Square {
        int x;
        int y;
        
        public Square(int x, int y) {
            this.x = x;
            this.y = y;
            left = Math.min(left, x);
            right = Math.max(right, x);
            up = Math.max(up, y);
            down = Math.min(down, y);
        }
    }
}


