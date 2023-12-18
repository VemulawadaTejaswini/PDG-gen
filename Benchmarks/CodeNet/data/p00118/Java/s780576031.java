import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static char[][] field;
    static int H, W;
    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }

    static boolean read(){
        H = sc.nextInt();
        W = sc.nextInt();
        if( H == 0 && W == 0)return false;

        field = new char[H][W];

        for(int i = 0; i < field.length; i++){
            field[i] = sc.next().toCharArray();
        }

        return true;
    }

    static void solve(){
        int res = 0;
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j< field[0].length; j++){
                if(field[i][j] != '?'){
                    res++;
                    dfs(j, i);
                }
            }
        }
        System.out.println(res);
    }

    static void dfs(int x, int y){
        char c = field[y][x];
        field[y][x] = '?';
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i] , ny = y + dy[i];
            if(0 <= nx && nx < field[0].length
                    && 0 <= ny && ny < field.length
                        && field[ny][nx] == c){
                dfs(nx, ny);
            }
        }
    }

}