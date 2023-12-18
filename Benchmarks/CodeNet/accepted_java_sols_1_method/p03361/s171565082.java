import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char grid[][] = new char[w][h];
        for (int y = 0;y < h;++y){
            String s = sc.next();
            for (int x = 0;x < w;++x){
                grid[x][y] = s.charAt(x);
            }
        }

        for (int y = 0;y < h;++y){
            for (int x = 0;x < w;++x){
                if(grid[x][y] == '#'){
                    int c = 0;
                    if(x > 0){
                        if(grid[x - 1][y] == '#')++c;
                    }
                    if(y > 0){
                        if(grid[x][y - 1] == '#')++c;
                    }
                    if(x < w - 1){
                        if(grid[x + 1][y] == '#')++c;
                    }
                    if(y < h - 1){
                        if(grid[x][y + 1] == '#')++c;
                    }
                    if(c == 0){
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
        //sout
    }



}