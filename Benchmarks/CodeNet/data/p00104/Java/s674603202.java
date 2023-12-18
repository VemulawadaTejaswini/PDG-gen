import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int W, H;
    static char[][] field;
    static boolean[][] check;
    static String input;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }

    static boolean read(){
        if(!sc.hasNext())return false;
        H = sc.nextInt();
        W = sc.nextInt();
        if(W == 0 || H == 0)return false;
        field = new char[H][W];
        check = new boolean[H][W];
        for(int i = 0; i < H; i++){
            field[i] = sc.next().toCharArray();
        }
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                check[i][j] = false;
            }
        }
        return true;
    }

    static void solve(){
        int x = 0, y = 0;
        char vector = 0;
        while(true){

            if(check[y][x] == true){
                System.out.println("LOOP");
                break;
            }
            if(field[y][x] == '.'){
                System.out.print(x + " ");
                System.out.println(y);
                break;
            }
            vector = field[y][x];
            check[y][x] =  true;
            x = x + nextVectorX(vector);
            y = y + nextVectorY(vector);
        }
    }

    static int nextVectorX(char v){
        if(v == '>'){
            return 1;
        }else if(v == '<'){
            return -1;
        }else if(v == '^'){
            return 0;
        }else {
            return 0;
        }
    }

    static int nextVectorY(char v){
        if(v == '>'){
            return 0;
        }else if(v == '<'){
            return 0;
        }else if(v == '^'){
            return -1;
        }else {
            return 1;
        }
    }
}