import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n, X, Y;
    static char[][]field;
    static int[]dx = {-3, -2, -1, 1, 2, 3}, dy = {-3, -2, -1, 1, 2, 3};
    public static void main(String[] args) {
        while(read()){

        }
    }

    static boolean read(){
        if(!sc.hasNext())return false;
        n = sc.nextInt();sc.nextLine();
        for(int i = 1; i <= n; i++ ){
            field = new char[8][8];
            for(int j = 0; j < 8; j++){
                field[j] = sc.next().toCharArray();
            }
            X = sc.nextInt()-1;
            Y = sc.nextInt()-1;
            sc.nextLine();
            solve(X, Y);
            print(i);
        }
        return true;
    }

    static void solve(int x, int y){
        field[y][x] = '0';
        for(int i = 0; i < dx.length; i++){
            int nx = x + dx[i];
            int ny = y;
            if( 0 <= nx && nx <= 7 && field[ny][nx] == '1'){
                solve(nx, ny);
            }
        }

        for(int i = 0; i < dy.length; i++){
            int nx = x;
            int ny = y + dy[i];
            if( 0 <= ny && ny <= 7 && field[ny][nx] == '1'){
                solve(nx, ny);
            }
        }

    }
    static void print(int dataSet){
        System.out.println("Data "+dataSet+":");
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++){
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}