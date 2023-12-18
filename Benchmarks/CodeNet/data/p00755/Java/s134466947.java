import java.util.Scanner;

public class Main {
    static int h;
    static int w;
    static int c;
    static int ans;
    static int count;
    static int[] color_order;
    static int[][] map;
    static int[][] tmp;

    public static void main(String[] args) throws java.io.IOException {

        Scanner sc = new Scanner(System.in);
        while (true) {
            h = sc.nextInt();
            w = sc.nextInt();
            c = sc.nextInt();
            if ((h | w | c) == 0)
                break;
            ans =0;
            map = new int[h][w];
            tmp = new int[h][w];
            for (int i = 0; i < h; i++)
                for (int j = 0; j < w; j++)
                    map[i][j] = sc.nextInt();
            color_order = new int[5];
            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j <= 6; j++) {
                    for (int k = 1; k <= 6; k++) {
                        for (int l = 1; l <= 6; l++) {
                            color_order[0] = i;
                            color_order[1] = j;
                            color_order[2] = k;
                            color_order[3] = l;
                            color_order[4] = c;
                            for (int m = 0; m < h; m++)
                                for (int n = 0; n < w; n++)
                                    tmp[m][n] = map[m][n];
                            count =0;
                            ele();
                            ans = Math.max(ans,count);
                        }
                    }
                }

            }
            System.out.println(ans);

        }
    }

    public static void ele() {
        for (int i = 0; i < 5; i++) {
            if (tmp[0][0] == color_order[i])
                continue;
            flip(0,0,tmp[0][0],color_order[i]);
        }
        solve(0,0);
    }

    public static void flip(int x, int y, int from,int to) {
        int dx[] = { 1, 0, -1, 0 };
        int dy[] = { 0, 1, 0, -1 };
        tmp[y][x] = to;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0&&ny>=0&&ny<h&&nx<w&&tmp[ny][nx] == from){
                flip(nx,ny,tmp[ny][nx],to);


                }
            }
        }
    public static void solve(int x,int y){

        int dx[] = { 1, 0, -1, 0 };
        int dy[] = { 0, 1, 0, -1 };
        count++;
        tmp[y][x] =0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0&&ny>=0&&ny<h&&nx<w&&tmp[ny][nx]!=0&&c== tmp[ny][nx] ){
                solve(nx,ny);


                }
            }
    }
}