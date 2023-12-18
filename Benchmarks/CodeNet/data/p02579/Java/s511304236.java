import java.io.*;
import java.util.*;
import java.awt.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String strSplitHW[] = br.readLine().split(" ");
            int H = Integer.parseInt(strSplitHW[0]);
            int W = Integer.parseInt(strSplitHW[1]);
            String strSplitC[] = br.readLine().split(" ");
            int sh = Integer.parseInt(strSplitC[0])-1;
            int sw = Integer.parseInt(strSplitC[1])-1;
            String strSplitD[] = br.readLine().split(" ");
            int dh = Integer.parseInt(strSplitD[0])-1;
            int dw = Integer.parseInt(strSplitD[1])-1;
            
            int yWalk[] = {-1, 0, 1, 0};
            int xWalk[] = {0, 1, 0, -1};
            
            
            char ch[][] = new char[H][W];
            int d[][] = new int[H][W];
            for(int i=0; i<H; i++){
                char strChar[] = br.readLine().toCharArray();
                for(int j=0; j<W; j++){
                    ch[i][j] = strChar[j];
                    d[i][j] = Integer.MAX_VALUE;
                }
            }
            
            
            d[sh][sw] = 0;
            Point p = new Point(sh, sw);
            Deque<Point> dq = new ArrayDeque<Point>();
            dq.offerFirst(p);
            while(dq.size() != 0){
                Point dqP = dq.pollFirst();
                int y = dqP.x;
                int x = dqP.y;
                int kariD = d[y][x];
                for(int i=0; i<4; i++){
                    int chY = y+yWalk[i];
                    int chX = x+xWalk[i];
                    if(chY >= 0 && chY < H && chX >= 0 && chX < W && ch[chY][chX] == '.' && d[chY][chX] > kariD){
                        d[chY][chX] = kariD;
                        dq.offerFirst(new Point(chY, chX));
                    }
                }
                for(int i=-2; i<=2; i++){
                    for(int j=-2; j<=2; j++){
                        int chY = y+i;
                        int chX = x+j;
                        if(chY >= 0 && chY < H && chX >= 0 && chX < W && ch[chY][chX] == '.' && d[chY][chX] > kariD+1){
                            d[chY][chX] = kariD+1;
                            dq.offerLast(new Point(chY, chX));
                        }
                    }
                }
                
                //System.out.println(dq);
            }
    
    
            /*for(int i=0; i<H; i++){
                for(int j=0; j<W; j++){
                    System.out.print(d[i][j] + " ");
                }
                System.out.println();
            }*/
            
            
            if(d[dh][dw] == Integer.MAX_VALUE){
                System.out.println("-1");
            }else{
                System.out.println(d[dh][dw]);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}