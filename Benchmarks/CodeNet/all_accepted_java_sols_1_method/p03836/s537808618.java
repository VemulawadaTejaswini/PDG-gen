import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
        
        int MAP_SIZE = 1000;// 座標の制約は-MAP_SIZE < x, y, < MAP_SIZE
        
        int sx = scan.nextInt();
        int sy = scan.nextInt();
        int tx = scan.nextInt();
        int ty = scan.nextInt();
        
        //無駄が多いが余裕をもって4000*4000のマップデータを作成
        int walkerBox[][] = new int[4*MAP_SIZE][4*MAP_SIZE];
        
        //マイナスの分を平行移動する
        tx += (MAP_SIZE*2);
        ty += (MAP_SIZE*2);
        sx += (MAP_SIZE*2);
        sy += (MAP_SIZE*2);
        
        int now_x = sx;
        int now_y = sy;
        
        while( now_x != tx || now_y != ty )
        {
       	 if( now_y < ty ){
       	   now_y++;
       	   System.out.print("U");
       	 }
         else if( now_x < tx ){
           now_x++;
           System.out.print("R");
       	 }
         else if( now_y > ty ){
       	   now_y--;
       	   System.out.print("D");
       	 }
         else if( now_x > tx ){
           now_x--;
           System.out.print("L");
       	 }
          walkerBox[now_x][now_y] = 1;
        }
        
        while( now_x != sx || now_y != sy )
        {
         if( now_y < sy ){
       	   now_y++;
       	   System.out.print("U");
       	 }
         else if( now_x < sx ){
           now_x++;
           System.out.print("R");
       	 }
       	 else if( now_y > sy ){
       	   now_y--;
       	   System.out.print("D");
       	 }
         else if( now_x > sx ){
           now_x--;
           System.out.print("L");
       	 }
          walkerBox[now_x][now_y] = 1;
        }
        
        walkerBox[tx][ty] = 0;
        walkerBox[sx][sy] = 0;
        
        //2周目　通った道にぶつかる場合は反時計回り90°を向いてもらう
        while( now_x != tx || now_y != ty )
        {
       	 if( now_y < ty && walkerBox[now_x][now_y+1] == 0){
       	   now_y++;
       	   System.out.print("U");
       	 }
         else if( now_y < ty && walkerBox[now_x][now_y+1] == 1){
           now_x--;
           System.out.print("L");
         }
          
         else if( now_x < tx && walkerBox[now_x+1][now_y] == 0){
           now_x++;
           System.out.print("R");
       	 }
         else if( now_x < tx && walkerBox[now_x+1][now_y] == 1){
           now_y++;
       	   System.out.print("U");
       	 }
          
         else if( now_y > ty && walkerBox[now_x][now_y-1] == 0){
       	   now_y--;
       	   System.out.print("D");
       	 }
         else if( now_y > ty && walkerBox[now_x][now_y-1] == 1){
       	   now_x++;
           System.out.print("R");
       	 }
          
         else if( now_x > tx && walkerBox[now_x-1][now_y] == 0){
           now_x--;
           System.out.print("L");
       	 }
         else if( now_x > tx && walkerBox[now_x-1][now_y] == 1){
           now_y--;
       	   System.out.print("D");
       	 }
          walkerBox[now_x][now_y] = 1;
        }
        
        while( now_x != sx || now_y != sy )
        {
       	 if( now_y < sy && walkerBox[now_x][now_y+1] == 0){
       	   now_y++;
       	   System.out.print("U");
       	 }
         else if( now_y < sy && walkerBox[now_x][now_y+1] == 1){
           now_x--;
           System.out.print("L");
         }
          
         else if( now_x < sx && walkerBox[now_x+1][now_y] == 0){
           now_x++;
           System.out.print("R");
       	 }
         else if( now_x < sx && walkerBox[now_x+1][now_y] == 1){
           now_y++;
       	   System.out.print("U");
       	 }
          
         else if( now_y > sy && walkerBox[now_x][now_y-1] == 0){
       	   now_y--;
       	   System.out.print("D");
       	 }
         else if( now_y > sy && walkerBox[now_x][now_y-1] == 1){
       	   now_x++;
           System.out.print("R");
       	 }
          
         else if( now_x > sx && walkerBox[now_x-1][now_y] == 0){
           now_x--;
           System.out.print("L");
       	 }
         else if( now_x > sx && walkerBox[now_x-1][now_y] == 1){
           now_y--;
       	   System.out.print("D");
       	 }
          walkerBox[now_x][now_y] = 1;
        }
            
        System.out.println("");
	  }
}