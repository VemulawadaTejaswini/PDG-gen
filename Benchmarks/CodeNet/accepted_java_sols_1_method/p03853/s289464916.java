import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        String[] s = new String[h];
        char[][] c = new char[h][w];
        for(int i = 0; i < h; i++){
                s[i] = scan.next();
        }
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                c[i][j] = s[i].charAt(j);
            }
        }
        for(int i = 0; i < h * 2; i++){
            for(int j = 0; j < w; j++){
                System.out.print(c[i / 2][j]);
            }
            System.out.println();
        }
    }
}