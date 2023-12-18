import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static char[][] field;

    public static void main(String[] args) {
        while(read()){
            solve();
            //print();
        }
    }
    static boolean read(){
        if(!sc.hasNext())return false;
        field = new char[12][12];
        for(int i = 0; i < 12; i++){
            field[i] = sc.next().toCharArray();
        }
        return true;
    }
    static void solve(){
        int res = 0;
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                if(field[i][j] == '1'){
                    dfs(j, i);
                    res++;
                }
            }
        }
        System.out.println(res);
    }
    static void dfs(int x, int y){
        field[y][x] = 0;
        int []dx = {-1, 0, 0, 1}, dy = {0, 1, -1, 0};
        for(int i = 0; i < 4; i++){
                int nx = x + dx[i], ny = y + dy[i];
                if(0 <= nx && nx < 12 && 0 <= ny && ny < 12 && field[ny][nx] == '1')
                    dfs(nx, ny);
        }
    }

    static void print(){
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}