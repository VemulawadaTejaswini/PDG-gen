import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int h,w;
    static char[][] field;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static boolean read(){

        h = sc.nextInt();
        w = sc.nextInt();
        if(h == 0 && w == 0)return false;

        field = new char[h][w];
        for(int i = 0; i < field.length ;i++){
            field[i] = sc.next().toCharArray();
        }
        return true;
    }

    static int slove(){
        int ret = 0;
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[0].length ;j++){
                if(field[i][j] != ' '){
                    ret++;
                    dfs(j, i);
                }
            }
        }
        return ret;
    }

    static void dfs(int x, int y){
        char c = field[y][x];
        field[y][x] = ' ';
        for(int k = 0; k < dx.length; k++){
            int nx = x + dx[k],ny = y + dy[k];
            if(0 <= nx && nx < field[0].length
                    && 0 <= ny && ny < field.length
                    && field[ny][nx] == c){
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) {

        while(read()){
            System.out.println(slove());
        }
    }
}