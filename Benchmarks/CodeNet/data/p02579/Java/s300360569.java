import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class Point{
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){return x;}
    public int getY(){return y;}

    public boolean equals(Object a) {
        if(a instanceof Point) {
            Point A = (Point)a;
            return this.x==A.getX() && this.y==A.getY();
        }else return false;
    }
}

public class Main {
    static long divCeil(long a, long b){
        return (a+b-1)/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int Ch = sc.nextInt()-1;
        int Cw = sc.nextInt()-1;
        int Dh = sc.nextInt()-1;
        int Dw = sc.nextInt()-1;

        char[][] board = new char[H][W];
        for(int h=0; h<H; h++){
            String line = sc.next();
            for(int w=0; w<W; w++) board[h][w] = line.charAt(w);
        }

        long[][] shortest = new long[H][W];
        for(int h=0; h<H; h++) Arrays.fill(shortest[h], 5000000000000000L);
        shortest[Ch][Cw] = 0;

        LinkedList<Point> check = new LinkedList<>();
        boolean[][] c = new boolean[H][W];
        check.add(new Point(Ch,Cw));
        c[Ch][Cw] = true;
        while(!check.isEmpty()){
            Point p = check.pop();
            int x = p.getX(), y = p.getY();
            c[x][y] = false;
            for(int dx=Math.max(-2, -x); dx<=Math.min(2, H-x-1); dx++) for(int dy=Math.max(-2,-y); dy<=Math.min(2, W-y-1); dy++){
                //if(x+dx < 0 || x+dx > H || y+dy < 0 || y+dy > W) continue;
                if(dx==0 && dy==0) continue;
                if(board[x+dx][y+dy] != '.') continue;
                if(Math.abs(dx)+Math.abs(dy) <= 1){
                    if(shortest[x+dx][y+dy] > shortest[x][y]){
                        shortest[x+dx][y+dy] = shortest[x][y];
                        if(!c[x+dx][y+dy]){
                            check.add(new Point(x+dx, y+dy));
                            c[x+dx][y+dy] = true;
                        }
                    }
                }else{
                    if(shortest[x+dx][y+dy] > shortest[x][y]+1){
                        shortest[x+dx][y+dy] = shortest[x][y]+1;
                        if(!c[x+dx][y+dy]){
                            check.add(new Point(x+dx, y+dy));
                            c[x+dx][y+dy] = true;
                        }
                    }
                }
            }
        }
        
        System.out.println(shortest[Dh][Dw] < 1000000000000000L ? shortest[Dh][Dw] : -1);

    }
}
