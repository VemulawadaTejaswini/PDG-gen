
import java.util.Scanner;
 
public class Main {
    static Scanner sc = new Scanner(System.in);
    static char map[][];
    static int dx[] = {0, 1, 0, -1};
    static int dy[] = {1, 0, -1, 0};
    static int ys;
    static int xs;
    public static void main(String[] args) {
         
        while (true) {
             
            ys = sc.nextInt();
            xs = sc.nextInt();
            if (ys==0 && xs==0) break;
            map = new char[ys][xs];
            for (int j=0; j<ys; j++) {
                map[j] = sc.nextCharArray(xs);
            }
             
            int ans = 0;
             
            for (int j=0; j<ys; j++) {
                for (int i=0; i<xs; i++) {
                    if (map[j][i]=='@' || map[j][i]=='#' || map[j][i]=='*') {
                        dfs(i, j, map[j][i]);
                        ans++;
                    }
                }
            }
             
            System.out.println(ans);
 
        }
         
    }
     
    static void dfs(int x, int y, char c) {
         
        map[y][x] = ' ';
        for (int i=0; i<4; i++) {
            if (0<=x+dx[i] && x+dx[i]<xs && 0<=y+dy[i] && y+dy[i]<ys) {
                if (map[y+dy[i]][x+dx[i]]==c) dfs(x+dx[i], y+dy[i], c);
            }
        }
         
    }