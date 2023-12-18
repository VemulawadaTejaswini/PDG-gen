import java.util.Scanner;

public class Main {
    static int h;
    static int w;
    static char[][] s;
    static boolean[][] flag;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        flag = new boolean [h][w];
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        int ey = sc.nextInt();
        int ex = sc.nextInt();
        s = new char[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().toCharArray();
        }
        s[ey - 1][ex - 1] = 'g';
        if(dfs(sx,sy)) System.out.println(0);
        else System.out.println(-1);
    }

    static boolean dfs(int x,int y) {
        if(x < 0 || x >= h || y < 0 || y >= w || s[x][y] == '#' || flag[x][y]) {
            return false;
        }
        if(s[x][y] == 'g') {
            return true;
        }
        flag[x][y] = true;
        int[] mx = {0, 1, 0, -1};
        int[] my = {-1, 0, 1, 0};
        boolean ret = false;
        for(int i = 0; i < mx.length; i++) {
            if (ret = dfs(x + mx[i], y + my[i])) break;
        }
        return ret;
    }
}