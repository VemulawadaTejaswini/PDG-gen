import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int h;
    public static int w;
    public static int x;
    public static int y;
    public static int res;
    public static boolean[][] b;
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            w = sc.nextInt();
            h = sc.nextInt();
            
            if (w == 0 && h == 0) break;
            
            x = 0;
            y = 0;
            res = 0;
            b = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                String s = sc.next();
                for (int j = 0; j < w; j++) {
                    if (s.charAt(j)=='#') {
                        b[i][j] = true;
                    } else if (s.charAt(j)=='@') {
                        x = i;
                        y = j;
                    }
                }
            }
            
            solve(x, y);
            
            System.out.println(res);
        }
    }
    
    public static void solve(int x, int y) {
        b[x][y] = true;
        res++;
        int[] d = {-1,0,1,0,0,-1,0,1};
        for (int i = 0; i < 4; i++) {
            int nx = x + d[i*2];
            int ny = y + d[i*2+1];
            if ( 0 <= nx && nx < h && 0 <= ny && ny < w && b[nx][ny] == false) {
                solve(nx, ny);
            }
        }
    }
}