import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

class Point{
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object another){
        if(another instanceof Point){
            return this.x==((Point)another).x && this.y==((Point)another).y;
        }else return false;
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        char[][] board = new char[H+2][W+2];
        Arrays.fill(board[0], '@');
        Arrays.fill(board[H+1], '@');
        for(int h=1; h<=H; h++){
            
            board[h][0] = '@';
            board[h][W+1] = '@';
            String line = sc.next();
            for(int w=1; w<=W; w++) board[h][w] = line.charAt(w-1);
        }

        int[][] shortest = new int[H+2][W+2];
        for(int h=0; h<=H+1; h++) for(int w=0; w<=W+1; w++){
            shortest[h][w] = 1000000000;
            shortest[x1][y1] = 0;
        }

        LinkedList<Point> toCheck = new LinkedList<>();
        toCheck.add(new Point(x1, y1));

        while(!toCheck.isEmpty()){
            Point p = toCheck.pop();
            for(int d=1; d<=K; d++){
                if(board[p.x+d][p.y]=='.' && shortest[p.x][p.y]+1 <= shortest[p.x+d][p.y]){
                    toCheck.addLast(new Point(p.x+d, p.y));
                    shortest[p.x+d][p.y] = 1+shortest[p.x][p.y];
                }else break;
            }
            for(int d=1; d<=K; d++){
                if(board[p.x-d][p.y]=='.' && shortest[p.x][p.y]+1 <= shortest[p.x-d][p.y]){
                    toCheck.addLast(new Point(p.x-d, p.y));
                    shortest[p.x-d][p.y] = 1+shortest[p.x][p.y];
                }else break;
            }
            for(int d=1; d<=K; d++){
                if(board[p.x][p.y+d]=='.' && shortest[p.x][p.y]+1 <= shortest[p.x][p.y+d]){
                    toCheck.addLast(new Point(p.x, p.y+d));
                    shortest[p.x][p.y+d] = 1+shortest[p.x][p.y];
                }else break;
            }
            for(int d=1; d<=K; d++){
                if(board[p.x][p.y-d]=='.' && shortest[p.x][p.y]+1 <= shortest[p.x][p.y-d]){
                        toCheck.addLast(new Point(p.x, p.y-d));
                        shortest[p.x][p.y-d] = 1+shortest[p.x][p.y];
                }else break;
            }
        }

        //System.out.println(Arrays.deepToString(shortest));
        System.out.println(shortest[x2][y2] > 10000000 ? -1 : shortest[x2][y2]);
    }
}